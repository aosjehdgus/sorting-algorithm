package merge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author : hoTire
 * @comment : No Recursion, Using Queue
 */
public class MergeSortNoRecursionUsingQueue {

	public static int[] mergesort(int[] A) {
		Queue<int[]> queue = new LinkedList<int[]>();
		for (int i = 0; i < A.length; i++) {
			queue.add(new int[] { A[i] });
		}
		while (queue.size() > 1) {
			int[] r = queue.poll();
			int[] l = queue.poll();
			int[] merged = merge(l, r);
			queue.add(merged);
		}
		return queue.poll();
	}
	
	public static int[] merge(int[] l, int[] r) {
		int[] tmp = new int[l.length+r.length];
		int count = 0;
		int left = 0;
		int right = 0;
		while (left < l.length && right < r.length) {
			if (l[left] < r[right]) tmp[count++] = l[left++];
			else tmp[count++] = r[right++];
		}
		while (left < l.length) tmp[count++] = l[left++];
		while (right < r.length) tmp[count++] = r[right++];
		return tmp;
	}
}
