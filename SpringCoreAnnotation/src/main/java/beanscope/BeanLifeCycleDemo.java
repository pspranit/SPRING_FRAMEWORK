package beanscope;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("b1")
public class BeanLifeCycleDemo {

    @PostConstruct  //custom init() method
    void startUp()
    {
        System.out.println("INITIALIZE RESOURCES");
    }

    void display()
    {
        System.out.println("DISPLAY METHOD");
    }

    @PreDestroy
    void shutDown()
    {
        System.out.println("CLOSE");
    }
}
