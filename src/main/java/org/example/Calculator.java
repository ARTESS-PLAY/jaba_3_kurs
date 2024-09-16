package org.example;

public class Calculator implements  CalculatorInterface<Double>
{
    public Double sum(Double a, Double b){
        return a + b;
    }

    public Double sub(Double a, Double b){
        return a - b;
    }

    public Double div(Double a, Double b){
        if(b == 0){
            throw new ArithmeticException("Divided by zero");
        }

        return a / b;
    }

    public Double multi(Double a, Double b){
        return  a * b;
    }
}
