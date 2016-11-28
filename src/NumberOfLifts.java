/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum NumberOfLifts {
    TEN, TWENTY, FIFTY, HUNDRED;

    public int getLifts() {
        switch(this) {
            case TEN: return 10;
            case TWENTY: return 20;
            case FIFTY: return 50;
            case HUNDRED: return 100;
        }
        return 0;
    }
}