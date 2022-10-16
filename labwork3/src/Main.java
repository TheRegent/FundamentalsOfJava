import java.util.regex.Pattern;

public class Main {
    /*
        0510
        C3 = 0 -> StringBuilder
        C17 = 0 ->  Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
        */

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Погляньте коли на кота, що сидить перед вами, коли він куражніший коли? " +
                "Коли ж... Тоді, коли- всю ніч \"бродить #або сидить біля нори, хоча, зловивши, й не їсть миші. " +
                "Замкни в достатку- бджолу, чи \"не помре з туги, в той час, коли можна- їй літати по квітоносних лугах? " +
                "Коли гірше, ніж купатися в достатку і смертельно каратися без: природженого діла?");

        //Зберігаємо дані у потік | обрізаємо пробіли | переводимо в нижній регістр
        String text = s.toString().trim().toLowerCase();
        //замінюємо символи кінця речення в крапку | розділяємо текст на речення
        text = text.replace("?", ".").replace("!", ".").replace("...", ".");
        String[] sentences = text.split("\\.");
        //Видаляємо пунктуацію
        String withoutpuct = text.replaceAll("\\p{P}", "");
        //розбиваємо речення на підрядки(по словам)
        String[] wordsplitted = withoutpuct.split(" ");
        StringBuilder SetofWords = new StringBuilder();


        for (String value : wordsplitted) {
            if (!SetofWords.toString().contains(value)) {
                SetofWords.append(",").append(value);
            }
        }

        //розбили потік на список слів | створюємо змінну лічильника | його аналога для порівняння | рядок для слова
        String[] Words = SetofWords.toString().split(",");
        int сounter = 0;
        int MaxAmount = 0;
        String repetedword = new String();

        //Перебираємо слова в реченнях і збільшуємо лічильник, коли знаходимо слово, що співпало
        for(int j = 1; j < Words.length; ++j) {
            for(int k = 0; k < sentences.length; ++k) {
                Pattern pattern = Pattern.compile(Words[j] + "\\b");
                if (pattern.matcher(sentences[k]).find()) {
                    ++сounter;
                }
            }
        //Шукаємо речення, в яких більше всього співпадінь
            if (сounter > MaxAmount) {
                MaxAmount = сounter;
                repetedword = Words[j];
            }

            сounter = 0;
        }

        System.out.println("Найбільша кількість речень, в яких є однакові слова: " + MaxAmount);
        System.out.println("Повторюване слово: " + repetedword);
    }
}
