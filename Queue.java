public class Queue {
    private String[] arr;
    private int index = -1;
    private static final int DEFAULT_SIZE = 10;


    public Queue() {
        arr = new String[DEFAULT_SIZE];
    }

    public Queue(int size) {
        if (size < 0 || size > 100) {
            arr = new String[DEFAULT_SIZE];
        } else {
            arr = new String[size];
        }
    }

    public void add(String text) {

        if (++index >= arr.length) {
            expandQueue();
        }
        arr[index] = text;
    }

    public String get() {
        if (index >= 0) {
            String temp = arr[0];
            for (int i = 0; i < index; i++) {
                arr[i] = arr[i + 1];
            }
            arr[index--] = null;
            shrinkQueue();
            return temp;
        }
        return null;
    }

    public void expandQueue() {
        String[] tempArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    private void shrinkQueue() {
        int temp = arr.length - (index + 1);
        if (temp > 20) {
            String[] temparr = new String[arr.length - (temp / 2)];
            for (int i = 0; i < temparr.length; i++) {
                temparr[i] = arr[i];
            }
            arr = temparr;
        }
    }

    public void displayQueue() {
        System.out.println();
        for (int j = 0; j <= index; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}