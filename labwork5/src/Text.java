public class Text {
    private Sentences[] sentence;

    public Sentences[] getSentences() {
        return this.sentence;
    }

    public void setSentences(Sentences[] sentence) {
        this.sentence = sentence;
    }

    public Text(String phase) {
        phase = phase.replaceAll("\\s+", " ");
        String[] splittedText = phase.split("[?!.]");
        this.sentence = new Sentences[splittedText.length];

        for(int i = 0; i < splittedText.length; ++i) {
            this.sentence[i] = new Sentences(splittedText[i]);
        }

    }

    public static void exercise(Text a, Word[] b) {
        for(int i = 0; i < b.length; ++i) {
            int counter = 0;

            for(int j = 0; j < a.getSentences().length; ++j) {
                boolean flag = true;

                for(int k = 0; k < a.getSentences()[j].getWord().length; ++k) {
                    if (b[i].collectWord().toString().toLowerCase().compareTo(a.getSentences()[j].getWord()[k].collectWord().toString().toLowerCase()) == 0) {
                        flag = false;
                    }
                }

                if (!flag) {
                    ++counter;
                }
            }
            System.out.println("Найбільша кількість речень, в яких є однакові слова: " + b[i].collectWord());
            System.out.println("Повторюване слово: " + counter);
        }

    }
}
