package hanson;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index] = arr2[i];
            index++;
        }

        return mergedArray;
    }

	

}
