import com.spring.ioc.BaseballCoach;
import com.spring.ioc.Coach;
import com.spring.ioc.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        //create the object
       // Coach coach=new BaseballCoach();
    Coach coach1=new TrackCoach();


        //use the object
     //   System.out.println(coach.getDailyWorkOut());
        System.out.println(coach1.getDailyWorkOut());
    }
}

