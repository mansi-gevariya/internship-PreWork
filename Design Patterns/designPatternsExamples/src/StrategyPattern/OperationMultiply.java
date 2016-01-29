package StrategyPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
