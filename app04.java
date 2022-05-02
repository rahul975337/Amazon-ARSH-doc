import java.util.*;
//TODO:
/*
 4. Given a array of integers of length N and a positive integer 2<k<N-1. Find minimum operations to make the array good. (array good is when A[i]<=A[i+k], i=0,1,2,3....N-1)  Ex. [2,4,1,3] - 2
 */

public class app04 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3 };
        int k = 2;
        int ops = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i += k)
            ops += bubbleSort(arr, i, i + k);
        System.out.println(Arrays.toString(arr));
        System.out.println(ops);
    }

    static int bubbleSort(int[] arr, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            for (int j = start; j < end - start + 1; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
