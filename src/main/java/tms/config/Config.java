package tms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import tms.entity.Operation;
import java.util.ArrayList;
import java.util.List;


@Configuration
@ComponentScan(basePackages = "tms")
public class Config {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

        @Bean
        List <Operation> operations (){
            return new ArrayList<>();
        }



    }





