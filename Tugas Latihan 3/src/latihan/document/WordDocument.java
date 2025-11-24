package latihan.document;

public class WordDocument extends Document {

    public WordDocument(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("Mencetak Word: " + title);
    }
}