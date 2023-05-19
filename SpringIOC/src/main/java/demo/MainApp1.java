package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc=new Scanner(System.in);
        System.out.println("SELECT MACHINE TYPE");
        System.out.println("1:LAPTOP\n2:PROJECTOR");
        int choice= sc.nextInt();

        Machine m1=null;

        if(choice==1)
        {
            m1=c1.getBean("machine1",Machine.class);
        } else if (choice==2) {
            m1=c1.getBean("machine2",Machine.class);
        }
        if(m1!=null)
        {
            m1.getType();
            m1.getPrice();
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }
}
