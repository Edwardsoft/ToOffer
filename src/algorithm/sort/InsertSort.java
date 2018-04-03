package algorithm.sort;

public class InsertSort {
    private static int [] array = {5, 4, 3, 2, 1};
    public static void main(String args []) {
        insertSort();
        System.out.println(array.toString());
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
    public static void insertSort() {
        for (int i = 1; i < array.length; i ++) {
            int j = i - 1;
            int k = array[i];
            while (j >= 0 && array[j] > k) {
                array [j + 1] = array[j];
                j --;
            }
            array[j + 1] = k;
        }
    }
}
