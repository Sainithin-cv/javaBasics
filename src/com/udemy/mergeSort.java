package com.udemy;

public class mergeSort {
    public static void divide(int[] arr, int si, int ei){
        //this will divide the entire array into single elements
        // has a time complexity of O(n)
        if(si>=ei){
            //in case the starting index is greater than the ending index, it will report an error
            //if the array is completely divided into single element si = ei, we can't divide it anymore.
            return;
        }
        int mid = si+(ei-si)/2; //to avoid space complexity, we use this formula instead of si+ei/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void conquer(int[] arr, int si,int mid, int ei){
        //creating a dummy array and storing the sorted elements in  it
        int[] merged = new int[ei-si+1];
        int indx1 = si; //to carry the index of left array after division
        int indx2 = mid+1; //to carry the index of right array after division
        int x =0; //to carry the index of dummy
        while (indx1 <= mid && indx2<= ei){
            if(arr[indx1]<= arr[indx2]){
                merged[x]= arr[indx1];
                x++;
                indx1++;
            }else{
                merged[x]= arr[indx2];
                x++;
                indx2++;
            }
        }

        // when one of the loop is completed, we directly paste thr remaining sorted lists using the following code. any one of the following while loops will be applied
        while (indx1 <= mid){
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }
        while (indx2 <= ei){
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }

        //copy sorted elements from dummy array to original array
        for(int i =0,j=si; i<merged.length; i++, j++){
            arr[j]=merged[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,2,3,8,4,9};
        int n =arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("");
        divide(arr, 0, n-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
