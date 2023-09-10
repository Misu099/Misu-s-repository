public class Pow {



    private double x;
    private int n;
    private double result = 1;
private int temp;
    public double pow(double x, int n){
        if(n<0){
            temp = -n;
        }

        for (int i =0; i < temp; i++){
            result *=x;
        }

        if(n < 0){
            result = 1/ result;
        }
        return result;
    }


}
