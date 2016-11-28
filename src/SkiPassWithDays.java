/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class SkiPassWithDays extends SkiPass{
    DaysForWeekdays allowedDaysForWeekdays;

    public SkiPassWithDays(PartOfWeek partOfWeek1){
        super(partOfWeek1);
    }
    public boolean valid(int currentDay, int currentMonth){
        if (dateIsValid(currentDay, currentMonth) && true ) { // instead of true...
            return true;
        }
        return false;
    }
}
