package structure.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueClass {

    private final PriorityQueue<Integer> priorityQueue;

    public PriorityQueueClass(PriorityQueue<Integer> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    // 우선순위 큐에 값을 추가합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - priorityQueue가 null이거나 값이 null인 경우
    public PriorityQueue<Integer> offer(int value) {
        this.priorityQueue.offer(value);
        return this.priorityQueue;
    }

    // 우선순위가 가장 높은(가장 작은) 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(log n)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public Integer poll() {
        return this.priorityQueue.poll();
    }

    // 우선순위가 가장 높은(가장 작은) 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public Integer peek() {
        return this.priorityQueue.peek();
    }

    // 큐의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public void clear() {
        this.priorityQueue.clear();
    }

    // 큐가 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public boolean isEmpty() {
        return this.priorityQueue.isEmpty();
    }

    // 큐의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public int size() {
        return this.priorityQueue.size();
    }

    // 큐에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (전체를 탐색)
    // 예외 발생: NullPointerException - priorityQueue가 null인 경우
    public boolean contains(int value) {
        return this.priorityQueue.contains(value);
    }
}