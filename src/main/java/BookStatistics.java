public class BookStatistics implements Visitor{
    private int books;
    private int sections;
    private int paragraphs;
    private int imageProxies;
    private int images;
    private int tables;

    public BookStatistics() {
        books = sections = paragraphs = imageProxies = images = tables = 0;
    }


    @Override
    public void visitBook(Book book) {
        books++;
    }

    @Override
    public void visitSection(Section section) {
        sections++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxies++;
    }

    @Override
    public void visitImage(Image image) {
        images++;
    }

    @Override
    public void visitTable(Table table) {
        tables++;
    }

    @Override
    public void visitContent(TableOfContent tableOfContent) {

    }


    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of books: " + books);
        System.out.println("*** Number of sections: " + sections);
        System.out.println("*** Number of paragraphs: " + paragraphs);
        System.out.println("*** Number of imageProxies: " + imageProxies);
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
    }
}
