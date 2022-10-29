public class Word {
    public Letter[] letter;

    public Word(String str) {
        this.letter = new Letter[str.length()];

        for(int i = 0; i < this.letter.length; ++i) {
            this.letter[i] = new Letter(str.charAt(i));
        }

    }

    public StringBuilder collectWord() {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < this.letter.length; ++i) {
            str.append(this.letter[i].getLetter());
        }

        return str;
    }
}
