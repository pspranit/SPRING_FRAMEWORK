package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class GamingLaptop implements Laptop{

    Processor pro=null;

    @Autowired      //After spring 4.0 are optional
    public GamingLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("LAPTOP TYPE IS GAMING");
    }

    @Override
    public void getProcessorInfo() {

    pro.getName();
    }
}
