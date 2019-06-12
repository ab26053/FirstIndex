package main;
import java.util.ArrayList;
import  java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 2, 8,7};
        System.out.println(firstindex(arr,0,8));
    }

    public static int firstindex(int[] arr, int si, int data) {
        if (si == arr.length) {
            return -1;
        }
        if(arr[si]==data)
        {
            return si;
        }
        else{
            return firstindex(arr,si+1,8);
        }
    }
}

