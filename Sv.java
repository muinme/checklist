public class Sv implements Comparable<Sv>{
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