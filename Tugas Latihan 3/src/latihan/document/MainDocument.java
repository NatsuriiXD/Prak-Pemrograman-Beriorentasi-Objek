package latihan.document;

public class MainDocument {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(new PdfDocument("Laporan PDF"));
        printer.print(new WordDocument("Surat Word"));
    }
}