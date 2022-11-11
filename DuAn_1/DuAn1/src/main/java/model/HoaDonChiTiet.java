package model;



import java.math.BigDecimal;
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
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {

    @Id
    @Column(name = "MaHoaDonChiTiet", nullable = false)
    private String maHoaDonChiTiet;
    @ManyToOne
    @JoinColumn(name = "MaHoaDon", nullable = false)
    private HoaDon maHoaDon;
    @ManyToOne
    @JoinColumn(name = "MaSanPham", nullable = false)
    private SanPham maSanPham;
    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;
    @Column(name = "thanhTien", nullable = false)
    private BigDecimal thanhTien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHoaDonChiTiet, HoaDon maHoaDon, SanPham maSanPham, Integer soLuong, BigDecimal thanhTien) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(String maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public HoaDon getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(HoaDon maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public SanPham getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(SanPham maSanPham) {
        this.maSanPham = maSanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }
    
}
