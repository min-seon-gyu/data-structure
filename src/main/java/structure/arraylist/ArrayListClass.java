package structure.arraylist;

import java.util.List;

public class ArrayListClass {

    private final List<Integer> arrayList;

    public ArrayListClass(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    // 리스트의 끝에 지정된 값을 추가합니다.
    // 시간 복잡도: O(1) (배열 크기 조정이 필요한 경우 O(n))
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public List<Integer> add(int value) {
        this.arrayList.add(value);
        return this.arrayList;
    }

    // 지정된 인덱스의 요소를 제거합니다.
    // 시간 복잡도: O(n) (제거 후 요소를 이동해야 하기 때문)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public List<Integer> removeOfIndex(int index) {
        this.arrayList.remove(index);
        return this.arrayList;
    }

    // 리스트에서 지정된 값의 첫 번째 발생을 제거합니다.
    // 시간 복잡도: O(n) (값을 찾고 요소를 이동해야 하기 때문)
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public List<Integer> removeOfValue(int value) {
        this.arrayList.remove(Integer.valueOf(value));
        return this.arrayList;
    }

    // 지정된 인덱스의 요소를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public int get(int index) {
        return this.arrayList.get(index);
    }

    // 지정된 인덱스의 요소를 주어진 값으로 대체합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public List<Integer> set(int index, int value) {
        this.arrayList.set(index, value);
        return this.arrayList;
    }

    // 지정된 인덱스에 값을 삽입합니다.
    // 시간 복잡도: O(n) (삽입 후 요소를 이동해야 하기 때문)
    // 예외 발생: IndexOutOfBoundsException - 인덱스가 리스트 범위를 벗어난 경우
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public List<Integer> add(int index, int value) {
        this.arrayList.add(index, value);
        return this.arrayList;
    }

    // 리스트에 지정된 값이 포함되어 있는지 확인합니다.
    // 시간 복잡도: O(n) (리스트를 순차적으로 검색)
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public boolean contains(int value) {
        return this.arrayList.contains(value);
    }

    // 리스트에서 지정된 값의 첫 번째 인덱스를 반환합니다.
    // 시간 복잡도: O(n) (리스트를 순차적으로 검색)
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public int indexOf(int value) {
        return this.arrayList.indexOf(value);
    }

    // 리스트의 모든 요소를 제거합니다.
    // 시간 복잡도: O(1) (참조를 제거하는 작업)
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public void clear() {
        this.arrayList.clear();
    }

    // 리스트의 요소 개수를 반환합니다.
    // 시간 복잡도: O(1)
    // 예외 발생: NullPointerException - arrayList가 null인 경우
    public int size() {
        return this.arrayList.size();
    }
}
