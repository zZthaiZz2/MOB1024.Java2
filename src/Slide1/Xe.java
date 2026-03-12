package Slide1;

public class Xe {
    private String hangXe;
    private int namSanXuat;

    public String gethangXe() {
        return this.hangXe;
    }

    public void sethangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getnamSanXuat() {
        return this.namSanXuat;
    }

    public void setnamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void xuat() {
        System.out.println("Hang xe: " + this.hangXe + " Nam san xuat: " + this.namSanXuat);
    }
}
