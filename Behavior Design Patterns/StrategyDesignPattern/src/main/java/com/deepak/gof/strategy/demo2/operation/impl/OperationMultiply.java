package com.deepak.gof.strategy.demo2.operation.impl;

import com.deepak.gof.strategy.demo2.operation.IOperation;

public class OperationMultiply implements IOperation {

    @Override
    public int performOperation(int operand1, int operand2) {
        return operand1 * operand2;
    }

}