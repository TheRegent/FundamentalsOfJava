public class Main {

    public static void main(String[] args) {
        Salat salat = new Salat();
        salat.add(new Pumpkins("Огірок", 200.0, 26.0));
        salat.add(new Spicy("Кріп", 18.0, 5.0));
        salat.add(new Spicy("Петрушка", 20.0, 10.0));
        salat.add(new Onions("Цибуля ріпчата", 50.0, 21.0));
        salat.add(new Roots("Редиска", 200.0, 48.0));
        System.out.println("Не сортований список:\n\n" + salat + "===================================================\n");
        salat.sort();
        System.out.println("Відсортований по вазі список:\n\n" + salat + "===================================================\n");
        System.out.println("Овочі, калорійність яких в салаті від 25 до 50 kcal:\n");
        salat.caloricContentRange(25.0, 50.0);
        System.out.println("Калорійність салату -" + salat.getCaloricContent() + " kcal");
    }
}