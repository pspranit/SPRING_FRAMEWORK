package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Master m=c1.getBean("m1",Master.class);
        Master2 mm=c1.getBean("m2",Master2.class);
        m.test();
        mm.display();

    }
}
