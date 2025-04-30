package structure.list.linkedlist;

import java.util.List;

public class LinkedListClass {

    private final List<Integer> linkedList;

    public LinkedListClass(List<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    // 리스트의 지정된 위치에 값을 삽입합니다.
    // 시간 복잡도: O(n) (중간 삽입 시 노드를 탐색해야 하기 때문)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> offer(int index, int value) {
        ((java.util.LinkedList<Integer>) this.linkedList).add(index, value);
        return this.linkedList;
    }

    // 리스트의 첫 번째에 값을 삽입합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> offerFirst(int value) {
        ((java.util.LinkedList<Integer>) this.linkedList).addFirst(value);
        return this.linkedList;
    }

    // 리스트의 마지막에 값을 삽입합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> offerLast(int value) {
        ((java.util.LinkedList<Integer>) this.linkedList).addLast(value);
        return this.linkedList;
    }

    // 리스트에서 지정된 위치의 요소를 제거합니다.
    // 시간 복잡도: O(n) (중간 삭제 시 노드를 탐색해야 하기 때문)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> poll(int index) {
        ((java.util.LinkedList<Integer>) this.linkedList).remove(index);
        return this.linkedList;
    }

    // 리스트의 첫 번째 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NoSuchElementException - 리스트가 비어 있는 경우
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> pollFirst() {
        ((java.util.LinkedList<Integer>) this.linkedList).removeFirst();
        return this.linkedList;
    }

    // 리스트의 마지막 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NoSuchElementException - 리스트가 비어 있는 경우
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public List<Integer> pollLast() {
        ((java.util.LinkedList<Integer>) this.linkedList).removeLast();
        return this.linkedList;
    }

    // 지정된 인덱스의 요소를 반환합니다.
    // 시간 복잡도: O(n) (인덱스를 찾아야 하기 때문)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public int get(int index) {
        return this.linkedList.get(index);
    }

    // 리스트에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (리스트를 순차적으로 검색)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public boolean contains(int value) {
        return this.linkedList.contains(value);
    }

    // 리스트에서 지정된 값의 첫 번째 인덱스를 반환합니다.
    // 시간 복잡도: O(n) (리스트를 순차적으로 검색)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public int indexOf(int value) {
        return this.linkedList.indexOf(value);
    }

    // 리스트의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1) (참조를 제거하는 작업)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public void clear() {
        this.linkedList.clear();
    }

    // 리스트의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - linkedList가 null인 경우
    public int size() {
        return this.linkedList.size();
    }
}
