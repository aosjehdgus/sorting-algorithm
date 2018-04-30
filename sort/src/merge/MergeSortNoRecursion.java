package merge;

import java.util.Arrays;

/**
 * 
 * @author : hoTire
 * @comment : Merge Sort No Recursion
 */
public class MergeSortNoRecursion {

	public static void main (String args[]) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];
		for (int k = 1; k < arr.length; k*=2) {
			for (int left = 0; left + k  < arr.length; left += k*2) {
				int right = left + k;
				int end = right + k < arr.length ? right + k : arr.length;
				int begin = left; int count = left; 
				int center = right;
				while (begin < right && center < end) {
					if (arr[begin] < arr[center]) temp[count++] = arr[begin++];
					else temp[count++] = arr[center++];
				}
				while (begin < right) temp[count++] = arr[begin++];
				while (center < end) temp[count++] = arr[center++];
				for (int i = left; i < end; i ++) arr[i] = temp[i];
			}
		}
	}
}
