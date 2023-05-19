package sample;

import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor{
    @Override
    public void getName() {
        System.out.println("PROCESSOR TYPE IS INTEL");
    }
}
