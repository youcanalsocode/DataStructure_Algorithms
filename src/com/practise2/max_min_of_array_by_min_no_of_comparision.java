package com.practise2;
//import java.util.Arrays;
public class max_min_of_array_by_min_no_of_comparision {
    public static void main(String args[]) {


        int arr[] = {2, 3, 28789, 7, 5, 88978, 6};
        int min = arr[0];
        int max = arr[1];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }

        }
System.out.println("min  :" +min +"\nmax :"+max);
    }
}
