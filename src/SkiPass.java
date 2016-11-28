import java.time.DayOfWeek;
import java.time.Month;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class SkiPass {
    static int ID = 0;
    private int id;
    private int endDay;
    private int endMonth;
    private boolean blocked = false;
    PartOfWeek partOfWeek;
    int allowedNumberOfLifts;
    int lifts;


    public SkiPass(PartOfWeek partOfWeek1) {
        id = ++ID;
        partOfWeek = partOfWeek1;
    }
    public int getID(){ return id;}
    public void setEndDay(DayOfWeek day) {
        endDay = day.getValue();
    }
    public void setEndMonth(Month month) {
        endDay = month.getValue();
    }
    public void block(){
        blocked = true;
    }
    public void setPartOfWeek(PartOfWeek partOfWeek1) {
        partOfWeek = partOfWeek1;
    }
    public PartOfWeek getPartOfWeek() {
        return partOfWeek;
    }
    public boolean dateIsValid(int currentDay, int currentMonth){
        if (currentMonth > endMonth) return false;
        if (currentMonth == endMonth && currentDay > endDay) return false;
        return true;
    }
    public void use(){}

}