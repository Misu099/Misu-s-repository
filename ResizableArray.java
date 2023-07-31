public class ResizableArray {
    private String[] arr;
    private static final int DEFAULT_SIZE = 10;


    public ResizableArray() {
        arr = new String[DEFAULT_SIZE];
    }

    public ResizableArray(int size) {
        if (size < 1 || size > 100) {
            arr = new String[DEFAULT_SIZE];
        }
        arr = new String[size];
    }


    public boolean update(String s, int index) {
        if (index > (arr.length - 1)) {
            return false;
        }
        arr[index] = s;
        return true;
    }

    public boolean add(String s, int index) {
        if (index > (arr.length - 1)) {
            return false;
        }
        if (arr[index] != null) {
            return false;
        }
        arr[index] = s;
        return true;
    }

    public void add(String s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = s;
                //System.out.println("Add: arr[" + i + "]: " + arr[i]);
                return;
            }
        }
        expandArray();
        arr[arr.length - 1] = s;
        //System.out.println("Add: arr[" + (arr.length-1) + "]: " + arr[arr.length-1]);
    }

    public String get(int index) {
        if (index > -1 && index < arr.length) {
            // System.out.println("Get: arr[" + index+ "]:" + arr[index]);
            return arr[index];
        }
        return null;
    }

    public String getAndRemove(int index) {
        if (index > -1 && index < arr.length) {
            String temp = arr[index];
            //System.out.println("Get&Remove: arr[" + index+ "]:" + arr[index]);
            arr[index] = null;
            return temp;
        }
        return null;
    }

    private void expandArray() {
        String[] tempArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    private void expandArray(int n) {
        if (n > arr.length) {
            String[] tempArr = new String[arr.length + n];
            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
    }

    private void shrinkArray() {
        String[] temparr = new String[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temparr[i] = arr[i];
        }
        arr = temparr;
    }

    private void shrinkArray(int n) {
        if (n < arr.length) {
            String[] temparr = new String[n];
            for (int i = 0; i < n; i++) {
                temparr[i] = arr[i];
            }
            arr = temparr;
        }
    }

    public void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("->>          size:" + arr.length);
        System.out.println();
    }
}

