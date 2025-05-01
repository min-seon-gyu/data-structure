package structure.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

    private final LinkedHashMap<Integer, String> linkedHashMap;

    public LinkedHashMapClass(LinkedHashMap<Integer, String> linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }

    // 맵에 키-값 쌍을 추가하거나 업데이트합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public LinkedHashMap<Integer, String> put(int key, String value) {
        this.linkedHashMap.put(key, value);
        return this.linkedHashMap;
    }

    // 지정된 키에 해당하는 값을 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public String get(int key) {
        return this.linkedHashMap.get(key);
    }

    // 지정된 키에 해당하는 항목을 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public LinkedHashMap<Integer, String> remove(int key) {
        this.linkedHashMap.remove(key);
        return this.linkedHashMap;
    }

    // 맵에 지정된 키가 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public boolean containsKey(int key) {
        return this.linkedHashMap.containsKey(key);
    }

    // 맵에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public boolean containsValue(String value) {
        return this.linkedHashMap.containsValue(value);
    }

    // 맵의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public void clear() {
        this.linkedHashMap.clear();
    }

    // 맵이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public boolean isEmpty() {
        return this.linkedHashMap.isEmpty();
    }

    // 맵의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedHashMap이 null인 경우
    public int size() {
        return this.linkedHashMap.size();
    }
}