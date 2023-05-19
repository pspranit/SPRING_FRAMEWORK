package beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("m1")
@Scope("singleton") //by default
public class Master {
    void info()
    {
        System.out.println("INFO METHOD");
    }
}
