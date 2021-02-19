public class Test {
    public static class Animal {

        // khai báo thuộc tính
        public String name;
        public String type;
        public int  age;

        //   Khởi tạo contructor ko tham số
        public Animal()
        {

        }
        //    Khoi tao contructor co tham so
        public Animal(String name, String type, int age) {
            this.name = name;
            this.type = type;
            this.age = age;
        }
        // Phuong thức get set
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //    Overriding
        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", age=" + age +
                    '}';
        }
        public void move(){
            System.out.println("Animals can move");
        }
    }
    public static class Chicken extends Animal {
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
    //Dog kế thừa Animal
    public static class Dog extends Animal
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

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        String bosung = "trung thanh";
        Dog dog = new Dog();
        dog.move(bosung);
        Animal animal1 = new Chicken();
        animal1.move();

    }
}
