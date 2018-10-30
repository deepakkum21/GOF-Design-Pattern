package com.deepak.gof.strategy.demo2;

import com.deepak.gof.strategy.demo2.operation.IOperation;

public class Context {
    private IOperation operation;

    Context(IOperation operation) {
        this.operation = operation;
    }

    public int executeOperation(int num1, int num2) {
        return operation.performOperation(num1, num2);
    }
}