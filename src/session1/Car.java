package session1;

public class Car {
    public String brand = "BMW";
    public int year = 2002;

    static String color;// static là biến toàn cục có ô nhớ riêng và không liên quan gì đến project

    // phương thức method
    public void showInfor(){
        System.out.println(brand);
        System.out.println(year);
    }

}
