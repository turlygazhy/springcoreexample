import bean.Race;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Race race = context.getBean("race", Race.class);
        System.out.println(race);


//        On start-up application shows the information about upcoming race.
//                User is offered to choose his horse (make a bet) with searching by name, breed, rider’s name
//        After that a race emulation starts
//        Winner announcement is displayed
//        (Nothing super-fancy in UI, just console application)
    }
}
