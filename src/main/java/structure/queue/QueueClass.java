package structure.queue;

import java.util.Queue;

public class QueueClass {

    private final Queue<Integer> queue;

    public QueueClass(Queue<Integer> queue) {
        this.queue = queue;
    }

    // 큐의 끝에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public Queue<Integer> offer(int value) {
        this.queue.offer(value);
        return this.queue;
    }

    // 큐의 front 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public Integer poll() {
        return this.queue.poll();
    }

    // 큐의 front 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public Integer peek() {
        return this.queue.peek();
    }

    // 큐의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public void clear() {
        this.queue.clear();
    }

    // 큐가 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    // 큐의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public int size() {
        return this.queue.size();
    }

    // 큐에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (큐를 순차적으로 검색)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public boolean contains(int value) {
        return this.queue.contains(value);
    }

    // 큐에서 지정된 값을 제거합니다.
    // 시간 복잡도: O(n) (값을 찾은 후 제거)
    // 예외 발생: NullPointerException - queue가 null인 경우
    public Queue<Integer> remove(Integer value) {
        this.queue.remove(value);
        return this.queue;
    }
}
