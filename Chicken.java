public class Chicken extends Animal{
    private int sochan;

    public Chicken() {
        super();
    }

    public Chicken(String name, String type, int age, int sochan) {
        super(name, type, age);
        this.sochan = sochan;
    }

    @Override
    public void move() {
        System.out.println("Chicken co the bay");
    }
}
