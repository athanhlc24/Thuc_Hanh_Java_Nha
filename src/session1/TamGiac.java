package session1;

public class TamGiac {
    int canh1;
    int canh2;
    int canh3;
    // contructor tên của nó phải giống tên class
    public TamGiac(){
        System.out.println("vừa tạo xong đối tượng chạy vào đây luôn mặc định chạy và k viết return vào hàm này");
    }
    // phương thức gét và sét để k làm việc trực tiếp với dữ liệu mà thông qua get và set để đảm bảo tính an toàn về mặt dữ liệu


    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public boolean ktTamGiac(){
        return canh1+canh2>canh3 && canh1 + canh3 >canh2 && canh2 +canh3 >canh1;

    }
    public int tinhChuVi(){
        if (!ktTamGiac()) return 0;
        return canh1 + canh2 + canh3;
    }
    public double tinhDienTich() {
        if (!ktTamGiac()) return 0;
        double cv = tinhChuVi() / 2.0;
        return Math.sqrt(cv * (cv - canh1) * (cv - canh2) * (cv - canh3));
    }

}
