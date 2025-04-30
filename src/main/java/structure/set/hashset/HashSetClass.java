package structure.set.hashset;

import java.util.HashSet;

public class HashSetClass {

    private final HashSet<Integer> hashSet;

    public HashSetClass(HashSet<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    // 집합에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public HashSet<Integer> add(int value) {
        this.hashSet.add(value);
        return this.hashSet;
    }

    // 집합에서 지정된 값을 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public HashSet<Integer> remove(int value) {
        this.hashSet.remove(value);
        return this.hashSet;
    }

    // 집합에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public boolean contains(int value) {
        return this.hashSet.contains(value);
    }

    // 집합의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public void clear() {
        this.hashSet.clear();
    }

    // 집합이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public boolean isEmpty() {
        return this.hashSet.isEmpty();
    }

    // 집합의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashSet이 null인 경우
    public int size() {
        return this.hashSet.size();
    }
}