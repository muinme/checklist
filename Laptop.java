
public class Laptop implements Comparable<Laptop> {
    private String brand;
    private String cpu;
    private String hdd;
    private int ramgb;
    private double displayinch;
    private double pincell;
    private double weightkg;
    private String color;

    public Laptop(String brand, String cpu, String hdd, int ramgb, double displayinch, double pincell, double weightkg,
                  String color) {
        this.brand = brand;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ramgb = ramgb;
        this.displayinch = displayinch;
        this.pincell = pincell;
        this.weightkg = weightkg;
        this.color = color;
    }

    public String toString() {
        return "(" + brand + "," + cpu + ","+ color + "," + displayinch + ")";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getDisplayinch() {
        return displayinch;
    }

    public void setDisplayinch(double displayinch) {
        this.displayinch = displayinch;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public int getRamgb() {
        return ramgb;
    }

    public double getPincell() {
        return pincell;
    }

    public double getWeightkg() {
        return weightkg;
    }

    public String getColor() {
        return color;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setRamgb(int ramgb) {
        this.ramgb = ramgb;
    }

    public void setDisplay(double display) {
        this.displayinch = display;
    }

    public void setPincell(double pincell) {
        this.pincell = pincell;
    }

    public void setWeightkg(double weightkg) {
        this.weightkg = weightkg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(Laptop other) {
        return this.brand.compareTo(other.brand);
    }
}
