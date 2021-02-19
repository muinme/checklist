public class MaxLength {
    public static void main(String args[]) {
        String fullname = "   Pham  Nguyen Anh  Tu Minnnhhh   vuuuuuuu  Nguyen  Huynh";
        fullname = fullname.trim();
        while (fullname.indexOf("  ") != -1)
            fullname = fullname.replaceAll("  ", " ");
        String[] tmp = fullname.split(" ");
        int max = 0;
        int m = 0;
        int vt[] = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            int k = tmp[i].toCharArray().length;
            if (k > max) {
                max = k;
                m = 1;
                vt[0] = i;
            } else if (k == max) {
                m++;
                vt[m - 1] = i;
            }
        }

        System.out.println(tmp[vt[0]]);
        System.out.println(vt[0]);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (tmp[vt[i]].equals(tmp[vt[j]])) {
                    break;
                }
                System.out.println(tmp[vt[i]]);
            }
        }
    }
}