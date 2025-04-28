package structure.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeClass {

    private final ArrayDeque<Integer> arrayDeque;

    public ArrayDequeClass(ArrayDeque<Integer> arrayDeque) {
        this.arrayDeque = arrayDeque;
    }

    // 덱의 뒤(rear)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null이거나 값이 null인 경우
    public ArrayDeque<Integer> offer(int value) {
        this.arrayDeque.offer(value);
        return this.arrayDeque;
    }

    // 덱의 앞(front)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null이거나 값이 null인 경우
    public ArrayDeque<Integer> offerFirst(int value) {
        this.arrayDeque.offerFirst(value);
        return this.arrayDeque;
    }

    // 덱의 뒤(rear)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null이거나 값이 null인 경우
    public ArrayDeque<Integer> offerLast(int value) {
        this.arrayDeque.offerLast(value);
        return this.arrayDeque;
    }

    // 덱의 앞(front) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer poll() {
        return this.arrayDeque.poll();
    }

    // 덱의 앞(front) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer pollFirst() {
        return this.arrayDeque.pollFirst();
    }

    // 덱의 뒤(rear) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer pollLast() {
        return this.arrayDeque.pollLast();
    }

    // 덱의 앞(front) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer peek() {
        return this.arrayDeque.peek();
    }

    // 덱의 앞(front) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer peekFirst() {
        return this.arrayDeque.peekFirst();
    }

    // 덱의 뒤(rear) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public Integer peekLast() {
        return this.arrayDeque.peekLast();
    }

    // 덱의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public void clear() {
        this.arrayDeque.clear();
    }

    // 덱이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public boolean isEmpty() {
        return this.arrayDeque.isEmpty();
    }

    // 덱의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public int size() {
        return this.arrayDeque.size();
    }

    // 덱에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (덱을 순차적으로 검색)
    // 예외 발생: NullPointerException - arrayDeque가 null인 경우
    public boolean contains(int value) {
        return this.arrayDeque.contains(value);
    }
}