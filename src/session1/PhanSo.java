package session1;

public class PhanSo {
    int tu;
    int mau;

    public PhanSo() {
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void inPhanSo(){
        System.out.println(getTu()+"/"+getMau());
    }
    public void rutGonPhanSo(){
        int ucln = 1;
        for (int i = Math.min(Math.abs(tu),Math.abs(mau)); i>1;i--){
            if (tu%i==0 && mau%i==0){
                ucln = i;
                break;
            }
        }
        setTu(tu/ucln);
        setMau(mau/ucln);
    }
    public void nghichDaoPhanSo(){
        int tmp = tu;
        tu = mau;
        mau = tmp;
    }
    public PhanSo add(PhanSo f){
        PhanSo ad = new PhanSo();
        ad.tu = this.tu * f.mau + this.mau * f.tu;
        ad.mau = this.mau * f.mau;
        return ad;
    }

}
