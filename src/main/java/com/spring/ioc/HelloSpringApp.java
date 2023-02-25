package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve the bean from spring container

        Coach coach=context.getBean("myCoach",Coach.class);
        Coach coach1=context.getBean("myCricketCoach",CricketCoach.class);

        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //call the method on bean
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach1.getDailyWorkOut());
        //let's call the new fortune method
        System.out.println(coach.getDailyFortune()  );
        System.out.println(coach1.getDailyFortune());
       System.out.println(theCricketCoach.getEmailAddress());
        System.out.println(theCricketCoach.getTeam());
        //close the context
        context.close();
    }
}
