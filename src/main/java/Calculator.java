public final class Calculator {
    public double add(String StA, String StB) {
        int intA = Integer.parseInt(StA);
        int intB = Integer.parseInt(StB);

        return intA + intB;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
    public double square(double a) {
        return a * a;
    }
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }


}
