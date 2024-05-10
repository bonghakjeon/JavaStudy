package Knou.Calculator;

public class Calculator implements ICalculator {
    private int num1;
    private int num2; 

    public Calculator(int numA, int numB) {
        num1 = numA;
        num2 = numB;
    }

    @Override
    public int getAdd() {
        return num1 + num2;
    }

    @Override
    public int getSub() {
        return num1 - num2;
    }

    @Override
    public int getMul() {
        return num1 * num2;
    }

    @Override
    public int getQuo() {
        return num1 / num2;
    }

    @Override
    public int getRemain() {
        return num1 % num2;
    }
}
