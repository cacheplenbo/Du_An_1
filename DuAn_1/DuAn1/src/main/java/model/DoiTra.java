
package model;

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
@Table(name = "DoiTra")
public class DoiTra {
    @Id
    @Column(name = "maDoiTra", nullable = false)
    private String maDoiTra;
    @ManyToOne
    @JoinColumn(name = "MaSanPham", nullable = false)
    private SanPham maSanPham;
    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;
    @Column(name = "LyDoDoi", nullable = false)
    private String lyDoDoi;

    public DoiTra() {
    }

    public DoiTra(String maDoiTra, SanPham maSanPham, Integer soLuong, String lyDoDoi) {
        this.maDoiTra = maDoiTra;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.lyDoDoi = lyDoDoi;
    }

    public String getMaDoiTra() {
        return maDoiTra;
    }

    public void setMaDoiTra(String maDoiTra) {
        this.maDoiTra = maDoiTra;
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

    public String getLyDoDoi() {
        return lyDoDoi;
    }

    public void setLyDoDoi(String lyDoDoi) {
        this.lyDoDoi = lyDoDoi;
    }
    
}
