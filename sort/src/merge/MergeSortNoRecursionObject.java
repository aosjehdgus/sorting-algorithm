package merge;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortNoRecursionObject {

	public Object[] merge(Object[] ...args) {
		Object[] result = args[0];
		for (int i = 1 ; i < args.length; i++) 
			result = merge(result,args[i]);
		return result;
	}
	public Object[] merge(Object[] left, Object[] right) {
		int lStart,rStart,lEnd,rEnd,count;
		lStart = rStart = count = 0 ;
		lEnd = left.length;
		rEnd = right.length;
		Object[] result = new Object[lEnd + rEnd];
		while (lStart < lEnd && rStart < rEnd) {
			if (((Comparable)left[lStart]).compareTo(right) <= 0) {
				result[count++] = left[lStart++];
			} else {
				result[count++] = right[rStart++];
			}
		}
		while (lStart < lEnd) result[count++] = left[lStart++];
		while (rStart < rEnd) result[count++] = right[rStart++];
		return result;
	}
	public Object[] mergeSort(Object[] arr) {
		Queue<Object[]> q = new LinkedList<Object[]>();
		
		for (int i = 0; i < arr.length; i++) q.add(new Object[]{arr[i]});
		
		while (q.size() > 1) {
			Object[] left = q.poll();
			Object[] right = q.poll();
			q.add(merge(left,right));
		}
		return q.poll();
	}
}
