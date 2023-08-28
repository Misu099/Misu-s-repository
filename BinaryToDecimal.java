public class BinaryToDecimal {



    public int convert( int[] bin){
        int result = 0;
        for (int i = 0; i < bin.length; i++){
            result = 2 * result + bin[i];
        }
        return result;
    }
}
