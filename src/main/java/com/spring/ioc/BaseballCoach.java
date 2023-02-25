package com.spring.ioc;

public class BaseballCoach implements Coach{
// using the constructor method for Dependency injection

    //define the private field for dependency
    private FortuneService fortuneService;

    // define the constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    public String getDailyWorkOut(){
        return "Spend 1 hour in batting practice";
    }

    @Override
    public String getDailyFortune() {

        //use fortuneservice to get fortune

        return fortuneService.getFortune();
    }
}
