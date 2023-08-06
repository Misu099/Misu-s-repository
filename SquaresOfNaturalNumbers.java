public class SquaresOfNaturalNumbers {
    private int[] list;
    public int[] generate(int num) {
        int aval = (int) Math.sqrt(num);
        list = new int[aval];
        for (int i = 1; i <= aval; i++) {
            list[i - 1] = i;
        }
        display();
        return list;
    }

    private void display() {
        for (int el : list) {
            System.out.print(el + "  ");
        }
    }
}


