//Dog kế thừa Animal
public class Dog extends  Animal
{

    private int sochan;

    public Dog() {
        super();
    }

    public Dog(String name, String type, int age, int sochan) {
        super(name, type, age);
        this.sochan = sochan;
    }

    @Override
    public void move() {
        System.out.println("Dogs co the chay");
    }


//    overloading
    public void move(String bosung) {
        System.out.println("Dogs co the chay " + bosung);
    }
}
