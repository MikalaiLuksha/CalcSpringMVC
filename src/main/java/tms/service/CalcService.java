package tms.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tms.entity.Operation;


import java.util.ArrayList;
import java.util.List;


@Service
public class CalcService {

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
        return num3;
    }

    public String symbol (String operation) {

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
}
