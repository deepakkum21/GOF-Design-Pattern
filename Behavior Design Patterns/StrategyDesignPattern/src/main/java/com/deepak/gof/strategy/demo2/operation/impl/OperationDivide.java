package com.deepak.gof.strategy.demo2.operation.impl;

import com.deepak.gof.strategy.demo2.operation.IOperation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OperationDivide implements IOperation {

    private static final Logger logger = LogManager.getLogger(OperationDivide.class);

    @Override
    public int performOperation(int operand1, int operand2) {
        if (operand2 == 0) {
            try {
                throw new ArithmeticException("/ by zero");
            } catch (ArithmeticException exception) {
                logger.info("Arithmetic Exception occured " + exception);
                exception.printStackTrace();
                return 404;
            }
        } else {
            return operand1 / operand2;
        }
    }

}