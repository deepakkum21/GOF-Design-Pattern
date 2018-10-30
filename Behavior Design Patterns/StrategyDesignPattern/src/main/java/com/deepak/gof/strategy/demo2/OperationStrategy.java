package com.deepak.gof.strategy.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.deepak.gof.strategy.demo2.operation.impl.OperationAdd;
import com.deepak.gof.strategy.demo2.operation.impl.OperationDivide;
import com.deepak.gof.strategy.demo2.operation.impl.OperationMultiply;
import com.deepak.gof.strategy.demo2.operation.impl.OperationSubtract;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OperationStrategy {

    static final Logger logger = LogManager.getLogger(OperationStrategy.class);
    private int choice;
    private int operand1;
    private int operand2;

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws NumberFormatException, IOException {
        OperationStrategy myOperationStrategy = new OperationStrategy();
        while (true) {
            logger.info("********* OPERATION MENU ************");
            logger.info("\n 1. Addition");
            logger.info("\n 2. Subtraction");
            logger.info("\n 3. Multiplication");
            logger.info("\n 4. Division");
            logger.info("\n 5. Exit");
            logger.info("\n Enter the choice: ");
            myOperationStrategy.choice = Integer.parseInt(myOperationStrategy.bufferedReader.readLine());

            if (myOperationStrategy.choice == 5) {
                System.exit(0);
            }

            switch (myOperationStrategy.choice) {
            case 1:
                getOperands(myOperationStrategy);
                Context addContext = new Context(new OperationAdd());
                logger.info("The result is: "
                        + addContext.executeOperation(myOperationStrategy.operand1, myOperationStrategy.operand2));
                break;

            case 2:
                getOperands(myOperationStrategy);
                Context subtractContext = new Context(new OperationSubtract());
                logger.info("The result is: "
                        + subtractContext.executeOperation(myOperationStrategy.operand1, myOperationStrategy.operand2));
                break;

            case 3:
                getOperands(myOperationStrategy);
                Context multiplyContext = new Context(new OperationMultiply());
                logger.info("The result is: "
                        + multiplyContext.executeOperation(myOperationStrategy.operand1, myOperationStrategy.operand2));
                break;

            case 4:
                getOperands(myOperationStrategy);
                Context divideContext = new Context(new OperationDivide());
                logger.info("The result is: "
                        + divideContext.executeOperation(myOperationStrategy.operand1, myOperationStrategy.operand2));
                break;

            default:
                logger.info("Selected A wrong choice");
            }
        }
    }

    private static void getOperands(OperationStrategy myOperationStrategy) throws IOException {
        logger.info("\n Enter the value for Operand1: ");
        myOperationStrategy.operand1 = Integer.parseInt(myOperationStrategy.bufferedReader.readLine());
        logger.info("\n Enter the value for Operand2: ");
        myOperationStrategy.operand2 = Integer.parseInt(myOperationStrategy.bufferedReader.readLine());
    }
}