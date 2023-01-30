package web.model;

public class Car {
    private String brand;
    private int price;
    private int age;

    public Car() {

    }

    public Car(String brand, int price, int age) {
        this.brand = brand;
        this.price = price;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }
}
