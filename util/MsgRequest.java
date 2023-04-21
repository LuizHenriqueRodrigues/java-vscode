package util;

import java.io.Serializable;

public class MsgRequest implements Serializable{
    private Double value1, value2;
    private char operation;
    public MsgRequest(Double value1, Double value2, char operation) {
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
    }
    public Double getValue1() {
        return value1;
    }
    public Double getValue2() {
        return value2;
    }
    public char getOperation() {
        return operation;
    }

    
}
