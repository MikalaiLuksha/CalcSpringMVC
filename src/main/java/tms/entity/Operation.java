package tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Operation {
    private double num1;
    private double num2;
    private double res;
    private String operation;

    @Override
    public String toString() {
        return num1 + " "+ operation +" " + num2 +" = "+ res ;
    }
}
