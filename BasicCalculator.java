public class BasicCalculator extends Calculator {


    @Override
    public float sum(float a, float b) {
        float sum = a + b;
        return (a + b);
    }

    @Override
    public float divide(float a, float b) {
        return (a / b);
    }

    @Override
    public float subtract(float a, float b) {
        float result = a - b;
        return result;
    }

    @Override
    public float multiply(float a, float b) {
        return (a * b);
    }
}
