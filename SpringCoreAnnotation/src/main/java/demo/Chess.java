package demo;

import org.springframework.stereotype.Component;

@Component("sport2")
public class Chess implements Sport {

    @Override
    public void getName() {
        System.out.println("SPORT NAME IS CHESS");
    }

    @Override
    public void getType() {
        System.out.println("SPORT TYPE IS INDOOR");
    }
}
