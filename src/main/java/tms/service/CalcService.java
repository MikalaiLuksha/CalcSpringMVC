package tms.service;


import org.springframework.stereotype.Component;
import tms.entity.Operation;


import java.util.List;



public class CalcService {

    public CalcService(List<Operation> operations) {
        this.operations = operations;
    }

    private List<Operation> operations;


    public double calculation(String operation, double num1, double num2) {
        double num3;
        switch (operation) {
            case ("plus"):
                num3 = num1 + num2;
                break;
            case ("minus"):
                num3 = num1 - num2;
                break;
            case ("div"):
                num3 = num1 / num2;
                break;
            case ("times"):
                num3 = num1 * num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        addHistory(num1, num2, num3, operation);
        return num3;
    }
    private void addHistory(double num1, double num2, double res, String operation) {
        String symbol = symbol(operation);
        Operation operation1 = new Operation(num1, num2, res, symbol);
        operations.add(operation1);
    }

    private String symbol (String operation) {

        switch (operation) {
            case ("plus"):
                return "+";
            case ("minus"):
                return "-";
            case ("div"):
                return "/";
            case ("times"):
                return "*";
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }

    public List getHistory() {
        return operations;
    }

}
