package sample;

import org.springframework.stereotype.Component;

public class Rayzen implements Processor{
    @Override
    public void getName() {
        System.out.println("PROCESSOR TYPE IS RAYZEN");
    }
}
