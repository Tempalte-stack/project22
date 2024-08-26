package Model;

public class Quyen {
    private int IDQuyen;
    private String TenQuyen;

    public Quyen() {
    }

    public Quyen(int IDQuyen, String tenQuyen) {
        this.IDQuyen = IDQuyen;
        TenQuyen = tenQuyen;
    }

    public int getIDQuyen() {
        return IDQuyen;
    }

    public void setIDQuyen(int IDQuyen) {
        this.IDQuyen = IDQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        TenQuyen = tenQuyen;
    }
}
