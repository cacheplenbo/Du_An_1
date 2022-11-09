package model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Xuan Truong
 */
@Entity
@Table(name = "HoaDon")
public class HoaDon {

    @Id
    @Column(name = "MaHoaDon", nullable = false)
    private String maHoaDon;
    @ManyToOne
    @JoinColumn(name = "MaKhachHang", nullable = false)
    private KhachHang maKhachHang;
    @ManyToOne
    @JoinColumn(name = "MaNhanVien", nullable = false)
    private NhanVien maNhanVien;
    private Date ngayTao;
    private Integer soLuong;
    private BigDecimal tongTien;
    private boolean trangThai;
    @OneToMany(mappedBy = "HoaDon", fetch = FetchType.EAGER)
    private ArrayList<HoaDonChiTiet> listHoaDonChiTiet;
    @OneToMany(mappedBy = "HoaDon", fetch = FetchType.EAGER)
    private ArrayList<TraHang> listTraHang;

    public ArrayList<TraHang> getListTraHang() {
        return listTraHang;
    }

    public void setListTraHang(ArrayList<TraHang> listTraHang) {
        this.listTraHang = listTraHang;
    }
    
    public ArrayList<HoaDonChiTiet> getListHoaDonChiTiet() {
        return listHoaDonChiTiet;
    }

    public void setListHoaDonChiTiet(ArrayList<HoaDonChiTiet> listHoaDonChiTiet) {
        this.listHoaDonChiTiet = listHoaDonChiTiet;
    }
    
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, KhachHang maKhachHang, NhanVien maNhanVien, Date ngayTao, Integer soLuong, BigDecimal tongTien, boolean trangThai) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
