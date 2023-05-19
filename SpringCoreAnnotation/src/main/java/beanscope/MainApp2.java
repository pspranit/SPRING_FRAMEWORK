package beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext t1=new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanLifeCycleDemo b1=t1.getBean("b1",BeanLifeCycleDemo.class);
        b1.display();

        t1.close();
    }
}
