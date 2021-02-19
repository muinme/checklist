import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.List;

public class DemoSet {
    public static class Book  implements Comparable<Book> {
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

    static class comparatorTitle implements Comparator<Book> {

        @Override

        public int compare(Book o1, Book o2) {

            return o1.getTitle().compareTo(o2.getTitle());

        }

    }

    static class comparatorYear implements Comparator<Book> {

        @Override

        public int compare(Book o1, Book o2) {

            return o1.getYear().compareTo(o2.getYear());

        }
    }


    public static void main(String[] args) {

        Set<Book> setBook = new HashSet<Book>();

        setBook.add(new Book("X", "Putin", 6));

        setBook.add(new Book("A", "Trump", 13));

        setBook.add(new Book("B", "Puroshenko", 19));

        setBook.add(new Book("D", "NPT", 17));

//        Các phần tử trong collection có thể được duyệt thông qua Iterator.
        Iterator<Book> iterator = setBook.iterator();

        while(iterator.hasNext()){

            Book b = iterator.next();

            System.out.println(b);

        }

        // O(1)// tìm kiếm theo contains

        boolean kt=setBook.contains( new Book("X...", "Putin", 6));

        if (kt) System.out.println("Found");


        List list = new ArrayList();
        list.addAll(setBook);
        Collections.sort(list, new comparatorTitle());
        Iterator<Book> iterator1 = list.iterator();
        while(iterator1.hasNext()){

            Book b = iterator1.next();

            System.out.println(b);
        }
    }
}
