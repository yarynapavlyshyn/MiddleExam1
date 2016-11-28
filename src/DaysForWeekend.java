/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum  DaysForWeekend {
    ONE, TWO;

    public int getDays() {
        switch(this) {
            case ONE: return 1;
            case TWO: return 2;
        }
        return 0;
    }
}
