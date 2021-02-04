public class Animal {

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
