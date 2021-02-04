import java.util.Iterator;
import java.util.TreeMap;

public class treeMap1 {

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