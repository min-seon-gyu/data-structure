package structure.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    private final LinkedHashSet<Integer> linkedHashSet;

    public LinkedHashSetClass(LinkedHashSet<Integer> linkedHashSet) {
        this.linkedHashSet = linkedHashSet;
    }

    // 집합에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public LinkedHashSet<Integer> add(int value) {
        this.linkedHashSet.add(value);
        return this.linkedHashSet;
    }

    // 집합에서 지정된 값을 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public LinkedHashSet<Integer> remove(int value) {
        this.linkedHashSet.remove(value);
        return this.linkedHashSet;
    }

    // 집합에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public boolean contains(int value) {
        return this.linkedHashSet.contains(value);
    }

    // 집합의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public void clear() {
        this.linkedHashSet.clear();
    }

    // 집합이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public boolean isEmpty() {
        return this.linkedHashSet.isEmpty();
    }

    // 집합의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashSet이 null인 경우
    public int size() {
        return this.linkedHashSet.size();
    }
}