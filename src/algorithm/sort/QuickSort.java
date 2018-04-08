package algorithm.sort;

public class QuickSort {
    private static int[] array = {5, 4, 3, 2, 1};

    public static void main(String args[]) {
        quickSort();
        System.out.println(array.toString());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort() {  //快速排序算法
        qSort(0, array.length - 1);
    }

    public static void qSort(int begin, int end) {
        if (begin < end) {
            int pivot = partition(begin, end);
            qSort(begin, pivot - 1);
            qSort(pivot + 1, end);
        }
    }

    public static int partition(int begin, int end) {
        int pivot = array[begin];
        while (begin < end) {
            while (begin < end && array[end] >= pivot) --end;
            array[begin] = array[end];
            while (begin < end && array[begin] <= pivot) ++begin;
            array[end] = array[begin];
        }
        array[begin] = pivot;
        return begin;
    }
}
