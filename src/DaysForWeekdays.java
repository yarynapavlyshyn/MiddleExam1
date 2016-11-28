/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum  DaysForWeekdays {
    ONE, TWO, FIVE;

    public int getDays() {
        switch(this) {
            case ONE: return 1;
            case TWO: return 2;
            case FIVE: return 5;
        }
        return 0;
    }
}
