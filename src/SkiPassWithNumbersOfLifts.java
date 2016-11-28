/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class SkiPassWithNumbersOfLifts extends SkiPass{
    DaysForWeekdays allowedDaysForWeekdays;

    public SkiPassWithNumbersOfLifts(PartOfWeek partOfWeek1){
        super(partOfWeek1);
    }
    public boolean valid(int currentDay, int currentMonth){
        if (dateIsValid(currentDay, currentMonth) && allowedNumberOfLifts > 0) {
            return true;
        }
        return false;
    }
    public void setAllowedDaysForWeekdays(){

    }
    public void use(){
        allowedNumberOfLifts--;
        lifts++;
    }
}

