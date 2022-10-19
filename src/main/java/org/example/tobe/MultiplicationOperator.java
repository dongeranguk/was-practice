package org.example.tobe;

import org.example.domain.NewArithmeticOperator;
import org.example.domain.PositiveNumber;

public class MultiplicationOperator implements NewArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "*".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() * operand2.toInt();
    }
}