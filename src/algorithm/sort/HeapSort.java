package algorithm.sort;

public class HeapSort {
    private static int [] array = {5, 4, 3, 2, 1};
    public static void main(String args []) {
        heapSort();
        checkStatus();
    }

    public static void heapSort() {                 //堆排序算法
        maxHeapBuild();
        for(int i = array.length - 1; i >= 0; i --) {
            swap(i, 0);
            checkStatus();
            heapModify(0,i );
            checkStatus();
        }
    }


    public static void maxHeapBuild() {             //建立最大堆
        for(int i = array.length / 2 - 1; i >= 0; i -- )
            heapModify(i, array.length);
    }
    public static void heapModify(int i, int length) {               //调整最大堆
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if(left < length && array[left] > array[i] )
            largest = left;
        if(right < length && array[right] > array[largest] )
            largest = right;
        if(largest != i) {
            swap(largest, i);
            heapModify(largest, length);
        }
    }



    public static void swap(int i, int j) {               //更换位置
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void checkStatus() {
        for(int i = 0; i < array.length; i ++)
            System.out.print(array[i]+" ");
        System.out.println("/n");
    }
}
