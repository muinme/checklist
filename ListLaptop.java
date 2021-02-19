import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

public class ListLaptop {
    public static class Laptop implements Comparable<Laptop> {
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
    public static void main(String[] args) {
        List<Laptop> lp = new ArrayList<Laptop>();
        lp.add(new Laptop("DELL", "Corei5", "1TB", 8, 15.6, 4, 1.99, "black"));
        lp.add(new Laptop("HP", "Corei3", "1TB", 4, 14, 3, 1.5, "white"));
        lp.add(new Laptop("ACER", "Corei5", "1TB", 8, 15.6, 3, 1.99, "black"));
        lp.add(new Laptop("LENOVO", "Corei5", "1TB", 4, 15, 3, 1.6, "black"));
        lp.add(new Laptop("ASUS", "Corei5", "1TB", 4, 15, 3, 1.83, "white"));
        lp.add(new Laptop("MSI", "Corei5", "1TB", 8, 15.6, 4, 1.99, "white"));
        lp.add(new Laptop("MACBOOK", "Corei7", "1TB", 16, 15.4, 3.5, 1.83, "white"));
        lp.add(new Laptop("ASUS", "Corei7", "1TB", 8, 17, 4, 1.34, "white"));
        lp.add(new Laptop("ASUS", "Corei5", "1TB", 8, 15.6, 4, 1.99, "black"));
        lp.add(new Laptop("DELL", "Corei5", "1TB", 16, 15.6, 4, 1.99, "black"));

        // Sắp xếp theo Nhãn hiệu

        Collections.sort(lp);
        Laptop lp1 = new Laptop("ASUS", "Corei5", "1TB", 4, 15, 3, 1.83, "white");
        int i = Collections.binarySearch(lp, lp1);
//		System.out.println("index="+i);
        if (i >= 0) {

            System.out.println("Found by name");
            int j = i;
            while (j < lp.size() && lp.get(j).getBrand().equals("ASUS")) {
                System.out.println(lp.get(j));
                j++;
            }
            int k = i - 1;
            while (j>=0 && lp.get(k).getBrand().equals("ASUS")) {
                System.out.println(lp.get(k));
                j--;
            }
        }
        System.out.println("=========================================================");
        // Sắp xếp theo CPU
        Collections.sort(lp, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {

                return a.getCpu().compareTo(b.getCpu());
            }
        });
//		System.out.println(lp);
        i = Collections.binarySearch(lp, lp1, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {

                return a.getCpu().compareTo(b.getCpu());
            }
        });

        if (i >= 0) {
            System.out.println("Found by CPU");
            int j = i;
            while (j < lp.size() && lp.get(j).getCpu().equals("Corei5")) {
                System.out.println(lp.get(j));
                j++;
            }
            ;
            j = i - 1;
            while (j >= 0 && lp.get(j).getCpu().equals("Corei5")) {
                System.out.println(lp.get(j));
                j--;
            }
            ;
        }
        System.out.println("=========================================================");
        // Sắp xếp theo màu
        Collections.sort(lp, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {
                return a.getColor().compareTo(b.getColor());
            }
        });
//		System.out.println(lp);
        i = Collections.binarySearch(lp, lp1, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {
                return a.getColor().compareTo(b.getColor());
            }
        });

        if (i >= 0) {

            System.out.println("Found by Color");
            int j = i;
            while (j < lp.size() && lp.get(j).getColor().equals("white")) {
                System.out.println(lp.get(j));
                j++;
            }
            j = i - 1;
            while (j >= 0 && lp.get(j).getColor().equals("white")) {
                System.out.println(lp.get(j));
                j--;
            }
        }
        System.out.println("=========================================================");
        // Sắp xếp theo display
        Collections.sort(lp, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {
                if (a.getDisplayinch() > b.getDisplayinch()) {
                    return 1;
                } else
                    return -1;
            }
        });
        i = Collections.binarySearch(lp, lp1, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {
                if (a.getDisplayinch() > b.getDisplayinch()) {
                    return 1;
                } else
                    return -1;
            }
        });
//		System.out.println("index="+i);
        int m = Math.abs(i);
        if (m >= 0) {
            System.out.println("Found by display");
            int j = m;
            while (j < lp.size() && lp.get(j).getDisplayinch() == 15.6) {
                System.out.println(lp.get(j));
                j++;
            }
            ;
            j = m - 1;
            while (j >= 0 && lp.get(j).getDisplayinch() == 15.6) {
                System.out.println(lp.get(j));
                j--;
            }
            ;
        }
    }

}
