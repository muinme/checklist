import java.util.Iterator;
import java.util.TreeMap;

public class treeMap1 {
    public static class Book2 implements Comparable<Book2>

    {

        private String title;

        private String author;

        private Integer year;

        public Integer code;

        public Book2(String title, String author, Integer year, Integer code) {

            this.title = title;

            this.year = year;

            this.author=author;

            this.code=code;

        }

        public Book2(String title, String author, Integer year) {

            this.title = title;

            this.year = year;

            this.author=author;

        }

        @Override

        public int compareTo(Book2 o) {

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

    }

    public static void main(String args[]) {

// K, V

        TreeMap<Integer, Book2> tmap = new TreeMap<Integer, Book2>();

        tmap.put( 1, new Book2("Tutorial Java 1.1", "Anh", 1990,1));

        tmap.put( 23, new Book2("Tutorial Java 1.1", "Tu", 1990,12));

        tmap.put( 70, new Book2("Tutorial Java 1.1", "Vu", 1990,12));

        tmap.put( 4, new Book2("Tutorial Java 1.1", "Minh", 1990,12));

        tmap.put( 2, new Book2("Tutorial Java 1.1", "Phong", 1990,12));

        boolean kt = tmap.containsKey(23);// tim kiem nhi phan nhu tren cay NPTK

        if (kt) {System.out.println("The TreeMap containc key: 23");}

        else {System.out.println("The TreeMap not containc key: 23");}

        Book2 b=tmap.get(new Integer(4));

        if (b!=null ) System.out.println(b);

        else

            System.out.println("The TreeMap not containc key: 23");

        Iterator<Integer> iterator = tmap.keySet().iterator();

        while(iterator.hasNext()) {

            Integer key =iterator.next();

            System.out.print("key is: "+ key + " & Value is: ");

            System.out.println(tmap.get(key));

        }

    }

}