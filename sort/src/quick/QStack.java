package quick;

import java.util.Random;

/**
 * 
 * @author : hoTire
 * @comment : No Recursion, Random Pivot, Stack Quick Sort
 */
public class QStack {
	private int MAX_NUM = 50;
	private int top = 0;
	private int[] stack = new int[MAX_NUM];
	private Random r = new Random();
	private void init() { this.top = 0;}
	private void push(int i) {
			if (top >= MAX_NUM) throw new RuntimeException("Stack is full");
			stack[top++] = i;
	}
	private int pop() {
		if (top == 0) throw new RuntimeException("Stack is empty");
		return stack[--top];
	}
	private boolean isEmpty() {
		return top == 0;
	}
	/**
	 * 
	 * @author : hoTire
	 * @comment : sorting
	 * @param a array
	 * @param n	array.length
	 */
	public void quickSort (int a[], int n) {
		push(n-1);		// R
		push(0);		// L
		
		while (!isEmpty()) {
			int L = pop();
			int R = pop();	
			if (R > L) {
				int index = generateRandomPivot(R-L+1)+L;	// Random Pivot
				int pivot = a[index];
				a[index] = a[R];
				a[R] = pivot;
				int begin = L-1;
				int end = R;
				
				while (begin < end) {
					while(begin < end && a[++begin] <= pivot);
					while(end > begin && a[--end] > pivot);
					
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
				}
			
				// pivot, begin swap
				int temp = a[begin];
				a[begin] = pivot;
				a[index] = temp; 
				
				push(R);				// R
				push(begin+1);			// L
				push(begin-1);			// R
				push(L);				// L
			}
		}
	}
	private int generateRandomPivot(int n) {
		return r.nextInt(n);
	}
	
}
