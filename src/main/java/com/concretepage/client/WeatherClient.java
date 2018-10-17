package com.concretepage.client;

import org.springframework.stereotype.Component;

@Component
public class WeatherClient {
    public void requestData()
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello!");
        }

    }


}
