public class Example1 {
    // if else loop for loop while
    public static void main(String args[]) {
        int a = 10;
        int m = 0;
        if (a < 2) {
            System.out.println("Ko la so nt");
        } else {
//            for (int i = 2; i < a - 1; i++) {
//                if (a % i == 0) {
//                    m++;
//                }
//            }
            int i = 2;
            while(i < a-1)
            {
                if (a % i == 0) {
                    m++;
                }
                i++;
            }
        }
        if (m == 0)
            System.out.println("La so nt");
        else
            System.out.println("Ko la so nt");
    }
}
