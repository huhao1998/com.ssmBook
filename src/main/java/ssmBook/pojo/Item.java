package ssmBook.pojo;


/**
 * 订单项目实体类
 * 记录订单详细信息
 * @GimmciK 2020.7.8
 */
public class Item {
    private int id;
    private float price;
    private int amount;
    private int bookId;
    private Book book;
    private int indentId;
    private float total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getIndentId() {
        return indentId;
    }

    public void setIndentId(int indentId) {
        this.indentId = indentId;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
