package structure.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

    private final TreeMap<Integer, String> treeMap;

    public TreeMapClass(TreeMap<Integer, String> treeMap) {
        this.treeMap = treeMap;
    }

    // 맵에 키-값 쌍을 추가하거나 업데이트합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public TreeMap<Integer, String> put(int key, String value) {
        this.treeMap.put(key, value);
        return this.treeMap;
    }

    // 지정된 키에 해당하는 값을 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public String get(int key) {
        return this.treeMap.get(key);
    }

    // 지정된 키에 해당하는 항목을 제거합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public TreeMap<Integer, String> remove(int key) {
        this.treeMap.remove(key);
        return this.treeMap;
    }

    // 맵에 지정된 키가 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public boolean containsKey(int key) {
        return this.treeMap.containsKey(key);
    }

    // 맵에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public boolean containsValue(String value) {
        return this.treeMap.containsValue(value);
    }

    // 맵의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public void clear() {
        this.treeMap.clear();
    }

    // 맵이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public boolean isEmpty() {
        return this.treeMap.isEmpty();
    }

    // 맵의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public int size() {
        return this.treeMap.size();
    }

    // 가장 작은 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NoSuchElementException - 맵이 비어 있는 경우
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public Map.Entry<Integer, String> firstEntry() {
        return this.treeMap.firstEntry();
    }

    // 가장 큰 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NoSuchElementException - 맵이 비어 있는 경우
    // 예외 발생: NullPointerException - treeMap이 null인 경우
    public Map.Entry<Integer, String> lastEntry() {
        return this.treeMap.lastEntry();
    }

    // 지정된 키보다 작은 키 중 가장 큰 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public Map.Entry<Integer, String> lowerEntry(int key) {
        return this.treeMap.lowerEntry(key);
    }

    // 지정된 키보다 큰 키 중 가장 작은 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public Map.Entry<Integer, String> higherEntry(int key) {
        return this.treeMap.higherEntry(key);
    }

    // 지정된 키 이하의 키 중 가장 큰 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public Map.Entry<Integer, String> floorEntry(int key) {
        return this.treeMap.floorEntry(key);
    }

    // 지정된 키 이상의 키 중 가장 작은 키에 해당하는 엔트리를 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - treeMap이 null이거나 key가 null인 경우
    public Map.Entry<Integer, String> ceilingEntry(int key) {
        return this.treeMap.ceilingEntry(key);
    }
}