package com.concretepage;
import com.concretepage.client.WeatherClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MyApplication.class, args);
        appContext.getBean(WeatherClient.class).requestData();

    }
}