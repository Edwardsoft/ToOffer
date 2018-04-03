package algorithm.sort;

public class SelectSort {
    private static int [] array = {5, 4, 3, 2, 1};
    public static void main(String args []) {
        selectSort();
        System.out.println(array.toString());
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
    public static void selectSort() {
        for (int i = 0; i < array.length - 1; i ++) {
            int k = i;
            for(int j = i + 1; j < array.length; j ++)
                if(array[i] > array[j]) {
                    k = j;
                }
            if(k != i) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
    }
}
