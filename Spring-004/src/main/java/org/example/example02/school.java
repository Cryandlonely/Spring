package org.example.example02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class school {
    @Value("大学")
    private String name;
    @Value("666")
    private String amount;

    public school() {
        System.out.println("school无参构造");
    }

    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
