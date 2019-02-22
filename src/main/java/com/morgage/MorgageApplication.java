package com.morgage;

import com.morgage.org.apache.olingo.odata2.sample.service.MyServiceFactory;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.processor.ODataContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MorgageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MorgageApplication.class, args);
        @Bean(name="MyServiceFactory")
        public ODataServiceFactory marioServiceFactory(){
            return new MyODataServiceFactory("com.mario.bean");
        }

}

}
