package Array_concept;

import java.util.Arrays;

public class Array_Sort_Direct {
    public static void main(String[] args) {
        int arr[] = {2,4,7,1,3,9};
        //! Array direct sorting -->
           Arrays.parallelSort(arr);
           for (int i=0; i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
    }
}
