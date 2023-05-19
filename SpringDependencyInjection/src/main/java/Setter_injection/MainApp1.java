package Setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("SELECT MOBILE TYPE");
        System.out.println("1:SMARTPHONE\n2:FEATUREPHONE");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Mobile m1=null;
        if(choice==1)
        {
            m1=c1.getBean("mobile1",Mobile.class);
        } else if (choice==2) {
            m1=c1.getBean("mobile2",Mobile.class);
        }
        if(m1!=null)
        {
           m1.getType();
           m1.getSim();
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }
}
