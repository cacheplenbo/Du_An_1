package ViewModel;

import java.sql.Date;

/**
 *
 * @author Xuan Truong
 */
public class NhanVienRespone {

    private String maNhanVien;
    private String tenNhanVien;
    private String tenChucVu;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String SDT;
    private String taiKhoan;
    private String matKhau;

    public NhanVienRespone() {
    }

    public NhanVienRespone(String maNhanVien, String tenNhanVien, String tenChucVu, boolean gioiTinh, Date ngaySinh, String diaChi, String SDT, String taiKhoan, String matKhau) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tenChucVu = tenChucVu;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Object[] toDataRow() {
        return new Object[]{maNhanVien, tenNhanVien, tenChucVu, gioiTinh == true ? "Nam" : "Nữ", ngaySinh, diaChi, SDT, taiKhoan, matKhau};
    }
}
