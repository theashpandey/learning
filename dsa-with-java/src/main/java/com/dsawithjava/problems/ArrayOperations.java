package com.dsawithjava.problems;

/**
 * @author ashish.pandey
 */
public class ArrayOperations {
  public static void main(String[] args) {
    // insertElementInKthPosition();
    // removeElementFromKthPosition();
   //  searchElementWithUnsortedArray();
  }

  public static void insertElementInKthPosition() {
    int arr[] = { 1, 2, 3, 4, 5 };
    int position = 6;
    int element = 6;
    int n = arr.length;
    int newArr[] = new int[n + 1];
    for (int i = 0; i < position - 1; i++) {
      newArr[i] = arr[i];
    }
    newArr[position - 1] = element;
    for (int i = position - 1; i < n; i++) {
      newArr[i + 1] = arr[i];
    }
    for (int e : newArr) {
      System.out.println(e);
    }
  }

  public static void removeElementFromKthPosition() {
    int arr[] = { 1, 2, 3, 4, 5 };
    int position = 5;
    int newarr[] = new int[arr.length - 1];
    for (int i = 0; i < position - 1; i++) {
      newarr[i] = arr[i];
    }
    for (int i = position; i < arr.length; i++) {
      newarr[i - 1] = arr[i];
    }
    for (int e : newarr) {
      System.out.println(e);
    }
  }
  
  public static void searchElementWithUnsortedArray() {
    int arr[]= {3,4,5,1,4};
    int element =4;
    int left =0, right=arr.length-1;
    
    while (left<right) {
      if(arr[left]==element) {
        System.out.println(left+1);
      }
      if(arr[right]==element) {
        System.out.println(right+1);
      }
      left++;
      right--;
    }
  }

  
  
}
