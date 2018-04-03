package algorithm.sort;

public class BubbleSort {
    private static int [] array = {5, 4, 3, 2, 1};
    public static void main(String args []) {
        bubbleSort();
        System.out.println(array.toString());
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
    public static void bubbleSort() {
        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
