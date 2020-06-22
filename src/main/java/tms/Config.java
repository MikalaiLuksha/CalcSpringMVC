package tms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import tms.controller.CalcController;
import tms.controller.HistoryController;
import tms.entity.Operation;
import tms.service.CalcService;

import java.util.ArrayList;
import java.util.List;


@Configuration
@ComponentScan
public class Config {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public CalcService calcService(List <Operation> oprations) {
        return new CalcService(oprations);
    }

        @Bean
        List <Operation> operations (){
            return new ArrayList<>();
        }

        @Bean
        HistoryController historyController (CalcService calcService){
        return new HistoryController(calcService);
        }

        @Bean
        CalcController calcController (CalcService calcService){
        return new CalcController(calcService);
        }

    }





