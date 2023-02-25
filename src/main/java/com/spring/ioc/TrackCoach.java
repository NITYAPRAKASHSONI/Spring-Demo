package com.spring.ioc;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "run atleast 5km a day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
