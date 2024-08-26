package Model;

import java.util.Date;

public class NguoiDung {
    private int IDNguoiDung;
    private String HoTen;
    private Date NgaySinh;
    private String DiaChi;
    private int SDT;
    private String Email;
    private String MatKhau;

    public NguoiDung() {
    }

    public NguoiDung(int IDNguoiDung, String hoTen, Date ngaySinh, String diaChi, int SDT, String email, String matKhau) {
        this.IDNguoiDung = IDNguoiDung;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        this.SDT = SDT;
        Email = email;
        MatKhau = matKhau;
    }

    public int getIDNguoiDung() {
        return IDNguoiDung;
    }

    public void setIDNguoiDung(int IDNguoiDung) {
        this.IDNguoiDung = IDNguoiDung;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }
}
