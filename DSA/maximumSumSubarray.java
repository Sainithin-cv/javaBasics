package DSA;

import java.util.Scanner;

public class maximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            //System.out.println("enter element "+i);
            arr[i] = sc.nextInt();
        }
        maximumSum(arr, n);
    }
    public static void maximumSum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int start = 0;
        int end = 0;
        int newstart = 0;
        for(int i=0; i<n; i++){
            if(curr>max){
                max = curr;
                end = i;
            }
            curr += arr[i];
            if(curr <= 0 ){
                curr = 0;
                start = newstart;
                newstart =i;
            }
        }
        System.out.println("Maximum sum of a contagious sub array is "+ max);
        if(newstart>end){
            newstart = start;
        }
        for (int i=newstart+1; i < end; i++ ){
            System.out.println(arr[i]);
        }
    }
}
