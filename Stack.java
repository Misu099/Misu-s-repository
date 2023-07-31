public class Stack {

    private int[] arr;
    private int index = -1;
    private static final int DEFAULT_SIZE = 10;


    public Stack() {
        arr = new int[DEFAULT_SIZE];
    }

    public Stack(int size) {
        if (size < 1 || size > 100) {
            arr = new int[DEFAULT_SIZE];
        }
        arr = new int[size];
    }


    public Integer get() {
        if (index >= 0) {
            int temp = arr[index];
            arr[index--] = 0;
            shrinkStack();
            return temp;
        }
        return null;
    }

    public void add(int num) {
        if (index + 1 >= arr.length) {
            expandStack();
        }
        arr[++index] = num;
    }

    private void expandStack() {
        int[] tempArr = new int[arr.length + 5];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    private void shrinkStack() {
        int temp = arr.length - (index + 1);
        if (temp > 10) {
            int[] temparr = new int[arr.length - (temp / 2)];
            for (int i = 0; i < temparr.length; i++) {
                temparr[i] = arr[i];
            }
            arr = temparr;
        }
    }

    public void displayStack() {
        System.out.println();
        for (int j = index; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("size: " + arr.length);
    }
}