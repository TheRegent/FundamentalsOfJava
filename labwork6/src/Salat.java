import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Salat {
    private ArrayList<Onions> onions = new ArrayList();
    private double caloricContent = 0.0;

    public Salat() {
    }

    public void add(Onions onion) {
        this.onions.add(onion);
        this.caloricContent += onion.getCaloricContent();
    }

    public double getCaloricContent() {
        return this.caloricContent;
    }

    public void sort() {
        Collections.sort(this.onions);
    }

    public void caloricContentRange(double start, double end) {
        StringBuilder sb = new StringBuilder();

        for (Onions onion : this.onions) {
            if (onion.getCaloricContent() >= start && onion.getCaloricContent() <= end) {
                sb.append(onion).append("\n");
            }
        }

        System.out.println(sb);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Onions onion : this.onions) {
            sb.append(onion).append("\n");
        }

        return sb.toString();
    }
}