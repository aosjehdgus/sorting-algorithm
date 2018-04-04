# 정렬 알고리즘 (sorting-algorithm)

## 1. Quick Sort
분할 정복 방법을 통해 정렬하는 불안정(unstable) 정렬이다. 

1. 리스트 가운데서 하나의 원소, 피봇을 고른다. 
2. 피봇 앞에는 피벗보다 작은 모든 원소들이 오고, 피봇 보다 큰 원소들은 피봇 뒤에 오도록 리스트를 둘로 나눈다.(분할)
3. 분할된 두 개의 리스트에 대해 Recursion(재귀)적으로 반복한다. 리스트의 크기가 0 ,1 될 때까지 반복한다. 

- 시간 복잡도 : O(NlogN)
- 공간 복잡도 : O(log N), 정렬 단계에서 추가적인 공간은 없지만, Recursion 단계에서 스택공간이 필요하다.  


### 문제점 
1. Recursion Stack Overflow
배열이 아주 클 경우 Recursion으로 인한 stack overflow 발생
-> No Recursion 방법 

2. 최악의 시간 복잡도 (N^2)
항상 가장 큰, 가장 작은 원소를 Pivot으로 고를 경우 최악의 시간 복잡도 발생
-> Random Pivot


hotire blog : https://blog.naver.com/gngh0101
