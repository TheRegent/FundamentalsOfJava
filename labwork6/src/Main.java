public class Main {

    public static void main(String[] args) {
        Salat salat = new Salat();
        salat.add(new Pumpkins("�����", 200.0, 26.0));
        salat.add(new Spicy("���", 18.0, 5.0));
        salat.add(new Spicy("��������", 20.0, 10.0));
        salat.add(new Onions("������ ������", 50.0, 21.0));
        salat.add(new Roots("�������", 200.0, 48.0));
        System.out.println("�� ���������� ������:\n\n" + salat + "===================================================\n");
        salat.sort();
        System.out.println("³����������� �� ��� ������:\n\n" + salat + "===================================================\n");
        System.out.println("�����, ���������� ���� � ����� �� 25 �� 50 kcal:\n");
        salat.caloricContentRange(25.0, 50.0);
        System.out.println("���������� ������ -" + salat.getCaloricContent() + " kcal");
    }
}