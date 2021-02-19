import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class hashMap1 {
    public static void main(String args[]) {

        // K, V

        Map<Integer, Book1> hmap = new HashMap<Integer, Book1>();

        hmap.put(12, new Book1("Tutorial Java 1.1", "BB", 1990,12));

        hmap.put(12, new Book1("Tutorial Java 1.1", "AA", 1990,2));

        hmap.put(7, new Book1("Tutorial Java 1.1", "CC", 1990,7));

        hmap.put(49, new Book1("Tutorial Java 1.1", "DD", 1990,49));

        hmap.put(3,new Book1("Tutorial Java 1.1", "EE", 1990,3));

        // Liet ke cac doi tuong

        Iterator<Integer> iterator = hmap.keySet().iterator();

        while(iterator.hasNext()) {

            Integer key = iterator.next();

            System.out.print("key is: "+ key + " & Value is: ");

            System.out.println(hmap.get(key));

        }

        Book1 var= hmap.get(2);// tim book theo key O(1);// Tim theo ham bam va bang bam

        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/

        hmap.remove(3);

        System.out.println("Map key and values after removal 3:");

        Iterator<Integer> iterator2 = hmap.keySet().iterator();

        while(iterator2.hasNext()) {

            Integer key = iterator2.next();

            System.out.print("Key is: "+key + " & Value is: ");

            System.out.println(hmap.get(key));

        }
    }
    public static class Book1 {
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

}

