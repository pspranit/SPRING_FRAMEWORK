package BothInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner scanner=new Scanner(System.in);
        System.out.println("SELECT LAPTOP");
        System.out.println("1:DELL\n2:HP");
        int choice=scanner.nextInt();

        Laptop l1=null;
        if(choice==1)
        {
            l1=c1.getBean("laptop1",Laptop.class);
        } else if (choice==2) {
            l1=c1.getBean("laptop2",Laptop.class);
        }
        if(l1!=null)
        {
            l1.getType();
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }
}
