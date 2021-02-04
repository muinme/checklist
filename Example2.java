public class Example2 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 9, 4, 5, 6, 7, 9 };
        int max = arr[0];
        int vitri[] = new int[20];
        int m = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                m = 1;
                vitri[0] = i;
            } else if (arr[i] == max) {
                m++;
                vitri[m - 1] = i;
            }
            i++;
        }
        System.out.print("Max = " + max + "; ");
        if (m >= 2) {
            System.out.print("Soluong = " + m + "; ");
            System.out.print("Cac vi tri = ");
            int k = 0;
            while (k < m) {
                if (k == m - 1) {
                    System.out.print(vitri[k] + ". ");
                } else {
                    System.out.print(vitri[k] + ", ");
                }
                k++;
            }
        }
    }

}
