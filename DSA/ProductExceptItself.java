package DSA;

import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        int[] arr = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=1;
        right[n-1]=1;

        for(int i=1; i<n; i++){
            left[i] = (nums[i-1]*left[i-1]);
        }

        for(int i=n-2; i>=0; i--){
            right[i] = (nums[i+1]*right[i+1]);
        }


        for(int i=0; i<n; i++){
            arr[i] = (right[i] * left[i]);
        }

         System.out.println(Arrays.toString(arr));
    }
}
