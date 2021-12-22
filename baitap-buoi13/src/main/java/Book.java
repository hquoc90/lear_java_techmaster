import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String author;
    private String[] category;
    private int publishingYear;
    private String publishingCompany;
    private int pageNumber;

    public Book(int id, String title, String author, String[] category, int publishingYear, String publishingCompany, int pageNumber) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishingYear = publishingYear;
        this.publishingCompany = publishingCompany;
        this.pageNumber = pageNumber;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + Arrays.toString(category) +
                ", publishingYear=" + publishingYear +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
