import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// sử lí bắt ngoại lệ Try...Catch
//Throw, Throws

public class CheckFile {
    // khai bao kha nag tung ngoai le
    public static void main(String[] args) throws IOException {
        String name = "F:\\Bangdiem.txt";
        String name2 = "F:\\Bangdiem1.txt";
        File file = new File(name);
        File file2 = new File(name2);
        BufferedReader br = null;
        BufferedWriter bw = null;
        String tmp = "";
        try {
            br = new BufferedReader(new FileReader(file));
            bw = new BufferedWriter(new FileWriter(file2));
            String textInALine = br.readLine();
            while (textInALine != null) {
                bw.write(textInALine + "\n");
                textInALine = textInALine.trim();
                while (textInALine.indexOf("  ") != -1)
                    textInALine = textInALine.replaceAll("  ", " ");
                String tmp2[] = textInALine.split(" ");
                for(int i = 0; i < tmp2.length; i++)
                {
                    tmp += tmp2[i] + " ";
                }
                textInALine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Khong dọc đc file
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        MaxTu(tmp);

    }
    public static void MaxTu(String a)
    {
        String[] tmp = a.split(" ");
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


