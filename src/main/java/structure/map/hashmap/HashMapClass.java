package structure.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class HashMapClass {

    private final HashMap<Integer, String> hashMap;

    public HashMapClass(HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
    }

    // 맵에 키-값 쌍을 추가하거나 업데이트합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public HashMap<Integer, String> put(int key, String value) {
        this.hashMap.put(key, value);
        return this.hashMap;
    }

    // 지정된 키에 해당하는 값을 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public String get(int key) {
        return this.hashMap.get(key);
    }

    // 지정된 키에 해당하는 항목을 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public HashMap<Integer, String> remove(int key) {
        this.hashMap.remove(key);
        return this.hashMap;
    }

    // 맵에 지정된 키가 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public boolean containsKey(int key) {
        return this.hashMap.containsKey(key);
    }

    // 맵에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public boolean containsValue(String value) {
        return this.hashMap.containsValue(value);
    }

    // 맵의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public void clear() {
        this.hashMap.clear();
    }

    // 맵이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public boolean isEmpty() {
        return this.hashMap.isEmpty();
    }

    // 맵의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public int size() {
        return this.hashMap.size();
    }

    // 지정된 키가 존재하면 해당 값을, 없으면 기본값을 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public String getOrDefault(int key, String defaultValue) {
        return this.hashMap.getOrDefault(key, defaultValue);
    }

    // 맵의 모든 값을 Collection 형태로 반환합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - hashMap이 null인 경우
    public Collection<String> values() {
        return this.hashMap.values();
    }
}