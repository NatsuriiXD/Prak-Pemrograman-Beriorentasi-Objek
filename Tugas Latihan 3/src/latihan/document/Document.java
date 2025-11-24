package latihan.document;

public abstract class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public abstract void print();
}