public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        // 배열의 모든 요소에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            // 현재 인덱스 i에서 가장 작은 요소의 인덱스를 찾음
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // 가장 작은 요소의 인덱스 업데이트
                }
            }
            // 현재 인덱스 i의 요소와 가장 작은 요소를 교환
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    