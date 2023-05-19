package beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext t1=new ClassPathXmlApplicationContext("applicationContext.xml");
       Demo d1= t1.getBean("d1",Demo.class);
       Demo d2=t1.getBean("d1",Demo.class);
        System.out.println(d1+"\n"+d2);
        System.out.println(d1==d2);

        Master m1=t1.getBean("m1",Master.class);
        Master m2=t1.getBean("m1",Master.class);
        System.out.println(m1+"\n"+m2);
        System.out.println(m1==m2);
    }
}
