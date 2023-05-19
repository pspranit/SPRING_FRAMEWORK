package Constructor_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("SELECT CAR TYPE");
        System.out.println("1:DIESEL CAR AND DIESEL ENGINE CAR\n2:PETROL CAR AND PETROL ENGINE CAR");
        int choice=sc.nextInt();
        Car r1=null;

        if(choice==1)
        {
          r1=c1.getBean("car2",Car.class);
        }
        else if (choice==2)
        {
             r1=c1.getBean("car1",Car.class);
        }
        if(r1!=null)
        {
            r1.getType();
            r1.getEngineInfo();
        }
        else {
            System.out.println("INVALID CHOICE");
        }

    }
}
