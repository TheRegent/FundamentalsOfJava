import java.util.regex.Pattern;

public class Main {
    /*
        0510
        C3 = 0 -> StringBuilder
        C17 = 0 ->  ������ �������� ������� ������ �������� ������, � ���� � ������� �����.
        */

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("��������� ���� �� ����, �� ������ ����� ����, ���� �� ��������� ����? " +
                "���� �... ���, ����- ��� �� \"������� #��� ������ ��� ����, ����, ��������, � �� ���� ����. " +
                "������ � ��������- ������, �� \"�� ����� � ����, � ��� ���, ���� �����- �� ����� �� ���������� �����? " +
                "���� ����, �� �������� � �������� � ���������� �������� ���: ������������ ���?");

        //�������� ��� � ���� | ������� ������ | ���������� � ����� ������
        String text = s.toString().trim().toLowerCase();
        //�������� ������� ���� ������� � ������ | ��������� ����� �� �������
        text = text.replace("?", ".").replace("!", ".").replace("...", ".");
        String[] sentences = text.split("\\.");
        //��������� ����������
        String withoutpuct = text.replaceAll("\\p{P}", "");
        //��������� ������� �� �������(�� ������)
        String[] wordsplitted = withoutpuct.split(" ");
        StringBuilder SetofWords = new StringBuilder();


        for (String value : wordsplitted) {
            if (!SetofWords.toString().contains(value)) {
                SetofWords.append(",").append(value);
            }
        }

        //������� ���� �� ������ ��� | ��������� ����� ��������� | ���� ������� ��� ��������� | ����� ��� �����
        String[] Words = SetofWords.toString().split(",");
        int �ounter = 0;
        int MaxAmount = 0;
        String repetedword = new String();

        //���������� ����� � �������� � �������� ��������, ���� ��������� �����, �� �������
        for(int j = 1; j < Words.length; ++j) {
            for(int k = 0; k < sentences.length; ++k) {
                Pattern pattern = Pattern.compile(Words[j] + "\\b");
                if (pattern.matcher(sentences[k]).find()) {
                    ++�ounter;
                }
            }
        //������ �������, � ���� ����� ������ ��������
            if (�ounter > MaxAmount) {
                MaxAmount = �ounter;
                repetedword = Words[j];
            }

            �ounter = 0;
        }

        System.out.println("�������� ������� ������, � ���� � ������� �����: " + MaxAmount);
        System.out.println("����������� �����: " + repetedword);
    }
}
