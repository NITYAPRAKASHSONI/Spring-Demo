package com.spring.ioc;

public class CricketCoach implements Coach {
    // using the getter and setter method for Dependency injection
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach:Inside setter method setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public CricketCoach(){
        System.out.println("Cricket Coach:Inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach:Inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Take  5 round of the ground and then practice bowling and batting for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
