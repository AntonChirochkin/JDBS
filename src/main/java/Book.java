public class Book {
    private int id;
    private String title;
    private int authorId;
    private int amount;

    public Book(int id, String title, int authorId, int amount) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.amount = amount;
    }

    // Геттеры и сеттеры для полей класса
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}