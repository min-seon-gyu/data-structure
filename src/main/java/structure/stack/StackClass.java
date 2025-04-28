package structure.stack;

import java.util.Stack;

public class StackClass {

    private final Stack<Integer> stack;

    public StackClass(Stack<Integer> stack) {
        this.stack = stack;
    }

    // 스택의 top에 값을 추가합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public Stack<Integer> push(int value) {
        this.stack.push(value);
        return this.stack;
    }

    // 스택의 top 요소를 제거하고 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: EmptyStackException - 스택이 비어 있는 경우
    // 예외 발생: NullPointerException - stack이 null인 경우
    public int pop() {
        return this.stack.pop();
    }

    // 스택의 top 요소를 반환합니다(제거하지 않음).
    // 시간 복잡도: O(1)
    // 예외 발생: EmptyStackException - 스택이 비어 있는 경우
    // 예외 발생: NullPointerException - stack이 null인 경우
    public int peek() {
        return this.stack.peek();
    }

    // 스택의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public void clear() {
        this.stack.clear();
    }

    // 스택이 비어 있는지 확인합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public boolean empty() {
        return this.stack.empty();
    }

    // 스택의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public int size() {
        return this.stack.size();
    }

    // 지정된 인덱스의 요소를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: ArrayIndexOutOfBoundsException - 인덱스가 스택 범위를 벗어난 경우
    // 예외 발생: NullPointerException - stack이 null인 경우
    public int get(int index) {
        return this.stack.get(index);
    }

    // 스택에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public boolean contains(int value) {
        return this.stack.contains(value);
    }

    // 스택에서 지정된 값의 첫 번째 인덱스를 반환합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public int indexOf(int value) {
        return this.stack.indexOf(value);
    }

    // 스택에서 지정된 인덱스의 요소를 제거합니다.
    // 시간 복잡도: O(n)
    // 예외 발생: ArrayIndexOutOfBoundsException - 인덱스가 스택 범위를 벗어난 경우
    // 예외 발생: NullPointerException - stack이 null인 경우
    public Stack<Integer> removeOfIndex(int index) {
        this.stack.remove(index);
        return this.stack;
    }

    // 스택에서 지정된 값의 첫 번째 발생을 제거합니다.
    // 시간 복잡도: O(n) (값을 찾기 위해 스택을 순차적으로 검색)
    // 예외 발생: NullPointerException - stack이 null인 경우
    public Stack<Integer> removeOfValue(Integer value) {
        this.stack.remove(value);
        return this.stack;
    }
}
