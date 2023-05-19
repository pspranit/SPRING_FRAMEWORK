package master;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ACCOUNT NUMBER");
        int accNo= sc.nextInt();

       Atm a1= c1.getBean("atm1",Atm.class);
       a1.getInfo(accNo);
    }
}
