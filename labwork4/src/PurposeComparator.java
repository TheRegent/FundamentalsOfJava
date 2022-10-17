import java.util.Comparator;

public class PurposeComparator implements Comparator<Ship> {

    public int compare(Ship s1, Ship s2) {
        return s1.getPurpose().compareTo(s2.getPurpose());
    }
}