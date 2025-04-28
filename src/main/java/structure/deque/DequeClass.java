package structure.deque;

import java.util.Deque;

public class DequeClass {

    private final Deque<Integer> deque;

    public DequeClass(Deque<Integer> deque) {
        this.deque = deque;
    }

    // 덱의 뒤(rear)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Deque<Integer> offer(int value) {
        this.deque.offer(value);
        return this.deque;
    }

    // 덱의 앞(front)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Deque<Integer> offerFirst(int value) {
        this.deque.offerFirst(value);
        return this.deque;
    }

    // 덱의 뒤(rear)에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Deque<Integer> offerLast(int value) {
        this.deque.offerLast(value);
        return this.deque;
    }

    // 덱의 앞(front) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer poll() {
        return this.deque.poll();
    }

    // 덱의 앞(front) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer pollFirst() {
        return this.deque.pollFirst();
    }

    // 덱의 뒤(rear) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer pollLast() {
        return this.deque.pollLast();
    }

    // 덱의 앞(front) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer peek() {
        return this.deque.peek();
    }

    // 덱의 앞(front) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer peekFirst() {
        return this.deque.peekFirst();
    }

    // 덱의 뒤(rear) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public Integer peekLast() {
        return this.deque.peekLast();
    }

    // 덱의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public void clear() {
        this.deque.clear();
    }

    // 덱이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    // 덱의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public int size() {
        return this.deque.size();
    }

    // 덱에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (덱을 순차적으로 검색)
    // 예외 발생: NullPointerException - deque가 null인 경우
    public boolean contains(int value) {
        return this.deque.contains(value);
    }
}