class book {
    String ISBN;
    String bookName;
    String author;
    String publisher;
    double price;

    public book(String ISBN, String bookName, String author, String publisher, double price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" + "ISBN=" + ISBN + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + ", price=" + price + '}';
    }

}