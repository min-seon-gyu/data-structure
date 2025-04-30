package structure.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

    private final TreeSet<Integer> treeSet;

    public TreeSetClass(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    // 집합에 값을 추가합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public TreeSet<Integer> add(int value) {
        this.treeSet.add(value);
        return this.treeSet;
    }

    // 집합에서 지정된 값을 제거합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public TreeSet<Integer> remove(int value) {
        this.treeSet.remove(value);
        return this.treeSet;
    }

    // 집합의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public void clear() {
        this.treeSet.clear();
    }

    // 정렬 순서에 따라 맨 앞 요소를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NoSuchElementException - 집합이 비어 있는 경우
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public Integer first() {
        return this.treeSet.first();
    }

    // 정렬 순서에 따라 맨 뒤 요소를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NoSuchElementException - 집합이 비어 있는 경우
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public Integer last() {
        return this.treeSet.last();
    }

    // 정렬 순서 기준으로 가장 앞 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public Integer pollFirst() {
        return this.treeSet.pollFirst();
    }

    // 정렬 순서 기준으로 가장 뒤 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public Integer pollLast() {
        return this.treeSet.pollLast();
    }

    // 지정된 값보다 큰 원소 중 가장 작은 값을 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public Integer higher(int value) {
        return this.treeSet.higher(value);
    }

    // 지정된 값보다 작은 원소 중 가장 큰 값을 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public Integer lower(int value) {
        return this.treeSet.lower(value);
    }

    // 지정된 값 이상인 원소 중 최소값을 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public Integer ceiling(int value) {
        return this.treeSet.ceiling(value);
    }

    // 지정된 값 이하인 원소 중 최대값을 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public Integer floor(int value) {
        return this.treeSet.floor(value);
    }

    // 집합에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 값이 null인 경우
    public boolean contains(int value) {
        return this.treeSet.contains(value);
    }

    // 집합이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - treeSet이 null인 경우
    public boolean isEmpty() {
        return this.treeSet.isEmpty();
    }

    // 집합에서 fromValue 이상 toValue 미만의 값들을 부분 집합으로 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeSet이 null이거나 fromValue 또는 toValue가 null인 경우
    // 예외 발생: IllegalArgumentException - fromValue가 toValue보다 큰 경우
    public SortedSet<Integer> subSet(int fromValue, int toValue) {
        return this.treeSet.subSet(fromValue, toValue);
    }
}