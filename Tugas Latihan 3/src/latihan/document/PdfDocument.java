package latihan.document;

public class PdfDocument extends Document {

    public PdfDocument(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("Mencetak PDF: " + title);
    }
}