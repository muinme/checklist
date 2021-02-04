
public class Book1 {
    private String title;

    private String author;

    private Integer year;

    public Integer code;

    public Book1(String title, String author, Integer year, Integer code) {

        this.title = title;

        this.year = year;

        this.author=author;

        this.code=code;

    }
    @Override
// hashCode
    public int hashCode(){

        int hash = (int) (author.charAt(0)+author.charAt(1));

        System.out.println("hashCode of key: " + author + " = " + hash);

        return hash;
//
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
}
