import java.util.Comparator;

public class Book  implements Comparable<Book> {
    private String title;

    private String author;

    private Integer year;

    public Book(String title, String author, Integer year) {

        this.title = title;

        this.year = year;

        this.author=author;

    }
    public int compareTo(Book o) {

        return author.compareTo(o.author);

    }

    public String getTitle() {

        return title;

    }

    public Integer getYear() {

        return year;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setYear(Integer year) {

        this.year = year;

    }

    @Override

    public String toString()

    {

        return author +","+ title +","+ year.toString();

    }
    @Override

    public int hashCode(){

        int hash = (int) (author.charAt(0)+author.charAt(1));

        System.out.println("hashCode of key: " + author + " = " + hash);

        return hash;
//
    }

    @Override

    public boolean equals(Object obj){

        return author.equals(((Book) obj).author);
    }

}

class comparatorTitle implements Comparator<Book> {

    @Override

    public int compare(Book o1, Book o2) {

        return o1.getTitle().compareTo(o2.getTitle());

    }

}

class comparatorYear implements Comparator<Book> {

    @Override

    public int compare(Book o1, Book o2) {

        return o1.getYear().compareTo(o2.getYear());

    }
}

