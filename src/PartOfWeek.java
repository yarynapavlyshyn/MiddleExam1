/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum  PartOfWeek {
    WEEKDAYS, WEEKEND, SEASON;

    public String toString() {
        switch(this) {
            case WEEKDAYS: return "weekdays";
            case WEEKEND: return "weekend";
            case SEASON: return "all season";
        }
        return null;
    }
}
