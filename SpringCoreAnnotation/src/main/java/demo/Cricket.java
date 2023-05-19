package demo;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{
        @Override
        public void getName() {
            System.out.println("SPORT NAME IS CRICKET");
        }

        @Override
        public void getType() {
            System.out.println("SPORT TYPE IS OUTDOOR");
        }
}
