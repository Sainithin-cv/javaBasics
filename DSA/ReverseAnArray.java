package DSA;

import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element "+i);
            arr[i] = sc.nextInt();
        }
        method2(arr, n);

    }

    public static void method2(int[] arr, int n){
        for(int i=0; i<n/2; i++){
            int temp= arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
