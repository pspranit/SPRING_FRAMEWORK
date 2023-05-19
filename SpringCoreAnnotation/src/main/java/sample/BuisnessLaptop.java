package sample;

import org.springframework.stereotype.Component;

@Component("laptop2")
public class BuisnessLaptop implements Laptop{

    Processor pro;

    public BuisnessLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("LAPTOP TYPE IS BUISNESS");
    }

    @Override
    public void getProcessorInfo() {

        pro.getName();
    }
}
