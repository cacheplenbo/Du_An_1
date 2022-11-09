package model;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Xuan Truong
 */
@Entity
@Table(name = "TraHang")
public class TraHang {

    @Id
    @Column(name = "MaPhieuTraHang", nullable = false)
    private String maPhieuTraHang;
    @ManyToOne
    @JoinColumn(name = "maHoaDon", nullable = false)
    private HoaDon maHoaDon;
    @ManyToOne
    @JoinColumn(name = "MaNhanVien", nullable = false)
    private NhanVien maNhanVien;
    @ManyToOne
    @JoinColumn(name = "MaKhachHang", nullable = false)
    private KhachHang maKhachHang;
    @Column(name = "NgayTra", nullable = false)
    private Date ngayTra;
    @Column(name = "SoTienTra", nullable = false)
    private BigDecimal soTienTra;
    @Column(name = "LyDoDoiTra", nullable = false)
    private String lyDoDoiTra;

    public TraHang() {
    }

    public TraHang(String maPhieuTraHang, HoaDon maHoaDon, NhanVien maNhanVien, KhachHang maKhachHang, Date ngayTra, BigDecimal soTienTra, String lyDoDoiTra) {
        this.maPhieuTraHang = maPhieuTraHang;
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.ngayTra = ngayTra;
        this.soTienTra = soTienTra;
        this.lyDoDoiTra = lyDoDoiTra;
    }

    public String getMaPhieuTraHang() {
        return maPhieuTraHang;
    }

    public void setMaPhieuTraHang(String maPhieuTraHang) {
        this.maPhieuTraHang = maPhieuTraHang;
    }

    public HoaDon getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(HoaDon maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public BigDecimal getSoTienTra() {
        return soTienTra;
    }

    public void setSoTienTra(BigDecimal soTienTra) {
        this.soTienTra = soTienTra;
    }

    public String getLyDoDoiTra() {
        return lyDoDoiTra;
    }

    public void setLyDoDoiTra(String lyDoDoiTra) {
        this.lyDoDoiTra = lyDoDoiTra;
    }
    
}
