import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /*
        0510
        C11 = 4 -> ��������� ���� �������� �����, ���� ���������� �� ����� � 5-� ����.
        */
    public static void main(String[] args) {
        Ship[] ships = new Ship[]{
                new Ship("Civil", 4, 2007, "Australia", 22),
                new Ship("Military", 7, 1987, "USA", 29),
                new Ship("Transport", 15, 2004, "India", 13),
                new Ship("Sport", 1, 1999, "United Kingdom", 34),
                new Ship("Fishing", 3, 1996, "China", 10)
        };

        System.out.println("������� ��������� ����:");
        Ship[] construction_param = ships;
        int construction_len = ships.length;

        int variable;
        Ship ship;
        for(variable = 0; variable < construction_len; ++variable) {
            ship = construction_param[variable];
            System.out.println(ship);
        }

        System.out.println("\n===========================================================================================================\n");
        System.out.println("���������� � ����������� ������� �� ����� ������������ �������:");
        Arrays.sort(ships, Comparator.comparingInt(Ship::getReleaseDate));

        for(variable = 0; variable < construction_len; ++variable) {
            ship = construction_param[variable];
            System.out.println(ship);
        }

        System.out.println("\n===========================================================================================================\n");
        System.out.println("���������� � ���������� ������� �� ������������ �������(�� �������):");
        Arrays.sort(ships, (new PurposeComparator()).reversed());

        for (Ship value : ships) {
            System.out.println(value);
        }

    }
}