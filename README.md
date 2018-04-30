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
-> <b>No Recursion 방법</b> 

2. 최악의 시간 복잡도 (N^2)
항상 가장 큰, 가장 작은 원소를 Pivot으로 고를 경우 최악의 시간 복잡도 발생
-> <b>Random Pivot</b>


## 2. Merge Sort
분할 정복 방법을 통해 정렬하는 안정(stable) 정렬이다.

1. 리스트의 길이가 0 또는 1이면 이미 정렬된 것으로 본다.<br/> 
   그렇지 않은 경우에는정렬되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
2. 각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬한다.
3. 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.

- 시간 복잡도 : O(NlogN)
- 공간 복잡도 : O(N) 

### 문제점
1. Recursion Stack Overflow
퀵정렬과 마찬가지로 배열이 아주 클 경우 Recursion으로 인한 stack overflow 발생 <br/>
-> <b>No Recursion 방법 </b>

2. 병합하는 단계에서 추가적인 공간이 필요하다.(N)
Merge 단계에서 추가적인 배열이 생성된다. 이때 마다 매번 데이터를 새로 불러와야한다. (참조성 사용하지 못한다.) <br/>


hotire blog : https://blog.naver.com/gngh0101
