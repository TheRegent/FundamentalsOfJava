public class Onions implements Comparable<Onions> {
    private String name;
    private double mass;
    private double caloricContent;

    public Onions(String name, double mass, double caloricContent) {
        this.setName(name);
        this.setMass(mass);
        this.setCaloricContent(caloricContent);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getCaloricContent() {
        return this.caloricContent;
    }

    public void setCaloricContent(double caloricContent) {
        this.caloricContent = caloricContent;
    }

    public int compareTo(Onions o) {
        return Double.compare(this.getMass(), o.getMass());
    }

    public String toString() {
        return this.name + " - " + this.mass + " грам , " + this.caloricContent + " kcal";
    }
}