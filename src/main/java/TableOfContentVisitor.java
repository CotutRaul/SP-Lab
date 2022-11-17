public class TableOfContentVisitor implements Visitor{
    int nrOfPages;
    TableOfContent tableOfContent;

    public TableOfContentVisitor() {
        nrOfPages = 0;
        tableOfContent = new TableOfContent();
    }

    @Override
    public void visitBook(Book book) {
        nrOfPages++;
    }

    @Override
    public void visitSection(Section section) {
        tableOfContent.addContent(section.getName(),nrOfPages);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        nrOfPages++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        nrOfPages++;
    }

    @Override
    public void visitImage(Image image) {
        nrOfPages++;
    }

    @Override
    public void visitTable(Table table) {
        nrOfPages++;
    }

    @Override
    public void visitContent(TableOfContent tableOfContent) {
        nrOfPages++;
    }

    public TableOfContent getToC(){
        return tableOfContent;
    }
}
