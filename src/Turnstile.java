import java.time.DayOfWeek;
import java.time.Month;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class Turnstile {
    int day, month;
    public Turnstile(DayOfWeek dday, Month mmonth) {
        day = dday.getValue();
        month = mmonth.getValue();
    }
    public boolean passIsValide(SkiPass skiPass){
        // return skiPass.valid();
        return true;
    }
    public void use(SkiPass skiPass){
        if (passIsValide(skiPass)){
            skiPass.use();
        }
    }
}
