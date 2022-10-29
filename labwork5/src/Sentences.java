import java.util.ArrayList;

public class Sentences {
    private Word[] word;
    public ArrayList<Punctuation> punct = new ArrayList();

    public Word[] getWord() {
        return this.word;
    }

    public ArrayList<Punctuation> getP() {
        return new ArrayList(this.punct);
    }

    public void setP(ArrayList<Punctuation> punct) {
        this.punct = new ArrayList(punct);
    }

    public Sentences(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == ':') {
                this.punct.add(new Punctuation(str.charAt(i)));
            }
        }

        this.punct.add(new Punctuation(str.length()));
        String[] dopArray = str.split("\\p{Punct}\\s|\\s\\p{Punct}|\\s|\\p{Punct}");
        this.word = new Word[dopArray.length];

        for(int i = 0; i < dopArray.length; ++i) {
            this.word[i] = new Word(dopArray[i]);
        }

    }

    public int[] sentence(Sentences mysent) {
        int[] wordList = new int[mysent.getWord().length];

        for(int i = 0; i < wordList.length; ++i) {
            for(int j = 0; j < this.getWord().length; ++j) {
                if (mysent.getWord()[i].collectWord().toString().toLowerCase().compareTo(this.getWord()[j].collectWord().toString().toLowerCase()) == 0) {
                    wordList[i] = 1;
                }
            }
        }

        return wordList;
    }
}