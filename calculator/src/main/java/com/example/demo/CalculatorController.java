package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calculatorForm() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam(name = "num1") double num1,
                            @RequestParam(name = "num2") double num2,
                            @RequestParam(name = "operator") String operator,
                            Model model) {
        double result;
        switch (operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    model.addAttribute("error", "Division by zero is not allowed.");
                    return "calculator";
                }
                result = num1 / num2;
                break;
            default:
                model.addAttribute("error", "Invalid operator.");
                return "calculator";
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}

