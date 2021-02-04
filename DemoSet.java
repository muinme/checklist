import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.List;

public class DemoSet {


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
