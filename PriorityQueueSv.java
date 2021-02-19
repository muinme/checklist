import java.util.Comparator;
import java.util.*;
import java.lang.Double;
import java.util.PriorityQueue;
//CSDL Hàng đợi ưu tiên
public class PriorityQueueSv {
    public static class Sv implements Comparable<Sv>{
        private String hoten;
        private String ngaysinh;
        private String quequan;
        private String nganhhoc;
        private double dtb;
        private String ccE;
        public int compareTo(Sv sv) {
            return nganhhoc.compareTo(sv.nganhhoc);
        }
        public String getHoten() {
            return hoten;
        }
        public void setHoten(String hoten) {
            this.hoten = hoten;
        }
        public String getNgaysinh() {
            return ngaysinh;
        }
        public void setNgaysinh(String ngaysinh) {
            this.ngaysinh = ngaysinh;
        }
        public String getQuequan() {
            return quequan;
        }
        public void setQuequan(String quequan) {
            this.quequan = quequan;
        }
        public String getNganhhoc() {
            return nganhhoc;
        }
        public void setNganhhoc(String nganhhoc) {
            this.nganhhoc = nganhhoc;
        }
        public double getDtb() {
            return dtb;
        }
        public void setDtb(double dtb) {
            this.dtb = dtb;
        }
        public String getCcE() {
            return ccE;
        }
        public void setCcE(String ccE) {
            this.ccE = ccE;
        }
        public Sv(String hoten, String ngaysinh, String quequan, String nganhhoc, double dtb, String ccE) {
            this.hoten = hoten;
            this.ngaysinh = ngaysinh;
            this.quequan = quequan;
            this.nganhhoc = nganhhoc;
            this.dtb = dtb;
            this.ccE = ccE;
        }
        @Override
        public String toString()
        {
            return hoten +" "+ ngaysinh +" "+ nganhhoc + " " + dtb + " "+ ccE.toString();
        }
    }
    public static void main(String[] a) {
// theo nganh hoc
        PriorityQueue<Sv> pQS = new PriorityQueue<Sv>();
        pQS.add(new Sv("Phạm Quỳnh An", "22/09/1999", "Hà Nội", "Cntt", 3.0, "A2"));
        pQS.add(new Sv("Phạm Anh Tuấn", "29/07/1997", "Thái Bình", "Đtvt", 3.2, "B1"));
        pQS.add(new Sv("Lê Thu Hà", "17/01/1995", "Ninh Bình", "Đtvt", 2.9, "A2"));
        pQS.add(new Sv("Dương Khắc Tinh", "01/07/1999", "Hà Nội", "Cntt", 3.0, "C2"));
        pQS.add(new Sv("Chày Văn Cối", "09/06/1999", "Hà Nội", "Cntt", 4.0, "B1"));
        pQS.add(new Sv("Phan Bá Đạo", "19/10/1999", "Hà Nội", "Cntt", 3.7, "A2"));
        pQS.add(new Sv("Phạm Thị Dâng Hiến", "22/09/1999", "Thái Bình", "Cntt", 3.5, "B2"));
        pQS.add(new Sv("Quấn Văn Quít", "11/11/1999", "Hà Nội", "Đtvt", 2.0, "A2"));
        pQS.add(new Sv("Phình Văn Chướng", "08/05/1996", "Hà Nội", "Cntt", 3.3, "C1"));
        pQS.add(new Sv("Lục Phi", "27/03/1994", "Hà Nội", "Cntt", 3.0, "B2"));
        while (!pQS.isEmpty()) {
            System.out.println(pQS.remove().toString());
        }
// theo chứng chỉ tiếng anh
        PriorityQueue<Sv> pQS0 = new PriorityQueue<Sv>(100,
                new Comparator<Sv>() {
                    @Override
                    public int compare(Sv sv1, Sv sv2) {
                        return sv1.getCcE().compareTo(sv2.getCcE());
                    }
                });
        pQS0.add(new Sv("Phạm Quỳnh An", "22/09/1999", "Hà Nội", "Cntt", 3.0, "A2"));
        pQS0.add(new Sv("Phạm Anh Tuấn", "29/07/1997", "Thái Bình", "Đtvt", 3.2, "B1"));
        pQS0.add(new Sv("Lê Thu Hà", "17/01/1995", "Ninh Bình", "Đtvt", 2.9, "A2"));
        pQS0.add(new Sv("Dương Khắc Tinh", "01/07/1999", "Hà Nội", "Cntt", 3.0, "C2"));
        pQS0.add(new Sv("Chày Văn Cối", "09/06/1999", "Hà Nội", "Cntt", 4.0, "B1"));
        pQS0.add(new Sv("Phan Bá Đạo", "19/10/1999", "Hà Nội", "Cntt", 3.7, "A2"));
        pQS0.add(new Sv("Phạm Thị Dâng Hiến", "22/09/1999", "Thái Bình", "Cntt", 3.5, "B2"));
        pQS0.add(new Sv("Quấn Văn Quít", "11/11/1999", "Hà Nội", "Đtvt", 2.0, "A2"));
        pQS0.add(new Sv("Phình Văn Chướng", "08/05/1996", "Hà Nội", "Cntt", 3.3, "C1"));
        pQS0.add(new Sv("Lục Phi", "27/03/1994", "Hà Nội", "Cntt", 3.0, "B2"));
        System.out.println("Sap xep theo chung chi tieng anh");
        while (!pQS0.isEmpty()) {
            System.out.println("****" + pQS0.remove().toString());
        }
// theo điểm trung bình
        PriorityQueue<Sv> pQS1 = new PriorityQueue<Sv>(100,
                new Comparator<Sv>() {
                    @Override
                    public int compare(Sv sv1, Sv sv2) {
                        if (sv1.getDtb() > sv2.getDtb()) {
                            return 1;
                        } else
                            return -1;
                    }
                });
        pQS1.add(new Sv("Phạm Quỳnh An", "22/09/1999", "Hà Nội", "Cntt", 3.0, "A2"));
        pQS1.add(new Sv("Phạm Anh Tuấn", "29/07/1997", "Thái Bình", "Đtvt", 3.2, "B1"));
        pQS1.add(new Sv("Lê Thu Hà", "17/01/1995", "Ninh Bình", "Đtvt", 2.9, "A2"));
        pQS1.add(new Sv("Dương Khắc Tinh", "01/07/1999", "Hà Nội", "Cntt", 3.0, "C2"));
        pQS1.add(new Sv("Chày Văn Cối", "09/06/1999", "Hà Nội", "Cntt", 4.0, "B1"));
        pQS1.add(new Sv("Phan Bá Đạo", "19/10/1999", "Hà Nội", "Cntt", 3.7, "A2"));
        pQS1.add(new Sv("Phạm Thị Dâng Hiến", "22/09/1999", "Thái Bình", "Cntt", 3.5, "B2"));
        pQS1.add(new Sv("Quấn Văn Quít", "11/11/1999", "Hà Nội", "Đtvt", 2.0, "A2"));
        pQS1.add(new Sv("Phình Văn Chướng", "08/05/1996", "Hà Nội", "Cntt", 3.3, "C1"));
        pQS1.add(new Sv("Lục Phi", "27/03/1994", "Hà Nội", "Cntt", 3.0, "B2"));
        System.out.println("Sap xep theo diem trung binh");
        while (!pQS1.isEmpty()) {
            System.out.println("===" + pQS1.remove().toString());
        }
// theo họ tên
        PriorityQueue<Sv> pQS2 = new PriorityQueue<Sv>(100,
                new Comparator<Sv>() {
                    @Override
                    public int compare(Sv sv1, Sv sv2) {
                        String[] tmp = sv1.getHoten().split(" ");
                        String[] tmp2 = sv2.getHoten().split(" ");
                        int m = tmp.length;
                        int n = tmp2.length;
                        String s1, s2;
                        s1 = tmp[m - 1];
                        for (int k = 0; k < m - 1; k++)
                            s1 += tmp[k];
                        s2 = tmp2[n - 1];
                        for (int k = 0; k < n - 1; k++)
                            s2 += tmp2[k];
                        return s1.compareTo(s2);
                    }
                });
        pQS2.add(new Sv("Phạm Quỳnh An", "22/09/1999", "Hà Nội", "Cntt", 3.0, "A2"));
        pQS2.add(new Sv("Phạm Anh Tuấn", "29/07/1997", "Thái Bình", "Đtvt", 3.2, "B1"));
        pQS2.add(new Sv("Lê Thu Hà", "17/01/1995", "Ninh Bình", "Đtvt", 2.9, "A2"));
        pQS2.add(new Sv("Dương Khắc Tinh", "01/07/1999", "Hà Nội", "Cntt", 3.0, "C2"));
        pQS2.add(new Sv("Chày Văn Cối", "09/06/1999", "Hà Nội", "Cntt", 4.0, "B1"));
        pQS2.add(new Sv("Phan Bá Kiến", "19/10/1999", "Hà Nội", "Cntt", 3.7, "A2"));
        pQS2.add(new Sv("Phạm Thị Dâng Hiến", "22/09/1999", "Thái Bình", "Cntt", 3.5, "B2"));
        pQS2.add(new Sv("Quấn Văn Quít", "11/11/1999", "Hà Nội", "Đtvt", 2.0, "A2"));
        pQS2.add(new Sv("Phình Văn Chướng", "08/05/1996", "Hà Nội", "Cntt", 3.3, "C1"));
        pQS2.add(new Sv("Lục Phi", "27/03/1994", "Hà Nội", "Cntt", 3.0, "B2"));

        System.out.println("Sap xep theo ten");

        while (!pQS2.isEmpty()) {
            System.out.println("+++++" + pQS2.remove().toString());
        }
    }
}