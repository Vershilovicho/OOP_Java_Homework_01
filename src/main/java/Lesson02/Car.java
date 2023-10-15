package Lesson02;
public class Car implements Moving, RemoteControl{
    @Override
    public void move() {
        System.out.println("car is moving");
    }

    public Car() {
        System.out.println("car");
    }
}
//    @Override
//    public void use() {
//        System.out.println("car is ingited");





