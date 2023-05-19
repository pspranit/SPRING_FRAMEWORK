package demo;

import org.springframework.stereotype.Component;

@Component("sport1")
public class Hocky implements Sport {
    @Override
    public void getName() {
        System.out.println("SPORT NAME IS HOCKY");
    }

    @Override
    public void getType() {
        System.out.println("SPORT TYPE IS OUTDOOR");
    }
}
