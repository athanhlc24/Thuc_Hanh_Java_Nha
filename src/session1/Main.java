package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Hello world");
        int x =10;
        System.out.println("x = "+x);
        String str = "Hello worl";
        if (x>10)
            System.out.println(str);
        else
            System.out.println("Not found");
        for(int i =0;i<x;i++){
            System.out.println("i = "+i);
        }

        Car car = new Car();
        car.showInfor();
        car.brand = "TOYOTA";
        System.out.println(car.brand);
        System.out.println(car.year);

        Car.color = "red";// static là biến toàn cục và có ô nhớ riêng k liên quan gì đến project

        System.out.println(Car.color);

        Car car2 = new Car();
        car2.showInfor();

        Bike bike = new Bike();
        bike.run();
        System.out.println(Car.color);



        TamGiac tamGiac = new TamGiac();
        tamGiac.setCanh1(8);
        tamGiac.setCanh2(4);
        tamGiac.setCanh3(5);
        System.out.println("chu vi = "+tamGiac.tinhChuVi());
        System.out.println("dien tich = "+tamGiac.tinhDienTich());

        Scanner sc = new Scanner(System.in);
        PhanSo phanSo = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        System.out.println("Nhập tử số: ");
        phanSo2.setTu(sc.nextInt());
        System.out.println("Nhập mẫu số: ");
        phanSo2.setMau(sc.nextInt());
        phanSo.setTu(9);
        phanSo.setMau(15);
        System.out.println("Phan so la: ");
        phanSo.inPhanSo();
        System.out.println("Rut gon phan so la: ");
        phanSo.rutGonPhanSo();
        System.out.println(phanSo.getTu()+"/"+ phanSo.getMau());
        System.out.println("Nghich dao phan so la: ");
        phanSo.nghichDaoPhanSo();
        System.out.println(phanSo.getTu()+"/"+ phanSo.getMau());
        System.out.println("Cong phan so la: ");
        PhanSo ad = phanSo.add(phanSo2);
        ad.rutGonPhanSo();
        ad.inPhanSo();
    }
}
