package model;

import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Xuan Truong
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang {

    @Id
    @Column(name = "maKhachHang")
    private String maKhachHang;
    @Column(name = "TenKhachHang")
    private String tenKhachHang;
    @Column(name = "GioiTinh")
    private boolean gioiTinh;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "SDT")
    private String SDT;
    @Column(name = "DiemTichLuy")
    private Integer diemTichLuy;
    @OneToMany(mappedBy = "KhachHang",fetch = FetchType.EAGER)
    private ArrayList<HoaDon> listHoaDon;
    @OneToMany(mappedBy = "KhachHang",fetch = FetchType.EAGER)
    private ArrayList<TraHang> listTraHang;

    public ArrayList<TraHang> getListTraHang() {
        return listTraHang;
    }

    public void setListTraHang(ArrayList<TraHang> listTraHang) {
        this.listTraHang = listTraHang;
    }
    
    public ArrayList<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }
    
    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, boolean gioiTinh, Date ngaySinh, String diaChi, String SDT, Integer diemTichLuy) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.diemTichLuy = diemTichLuy;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public Integer getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(Integer diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    
    
}
