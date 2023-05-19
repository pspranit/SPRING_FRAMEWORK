package beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("d1")
@Scope("prototype")
public class Demo {
    void test()
    {
        System.out.println("TEST METHOD");
    }
}
