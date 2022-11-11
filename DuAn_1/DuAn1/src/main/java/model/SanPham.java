package model;



import java.math.BigDecimal;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Xuan Truong
 */
@Table(name = "SanPham")
@Entity
public class SanPham {

    @Id
    @Column(name = "MaSanPham", nullable = false)
    private String maSanPham;
    @Column(name = "TenSanPham", nullable = false)
    private String tenSanPham;
    @ManyToOne
    @JoinColumn(name = "MaDanhMuc", nullable = false)
    private DanhMuc maDanhMuc;
    @ManyToOne
    @JoinColumn(name = "MaloaiSP", nullable = false)
    private LoaiSanPham maloaiSP;
    @ManyToOne
    @JoinColumn(name = "MaNPP", nullable = false)
    private NhaPhanPhoi maNPP;
    private BigDecimal giaBan;
    private Integer soLuong;
    private boolean trangThai;
    @OneToMany(mappedBy = "SanPham", fetch = FetchType.EAGER)
    private ArrayList<DoiTra> listDoiTra ;
    public SanPham() {
    }

    public ArrayList<DoiTra> getListDoiTra() {
        return listDoiTra;
    }

    public void setListDoiTra(ArrayList<DoiTra> listDoiTra) {
        this.listDoiTra = listDoiTra;
    }

    public SanPham(String maSanPham, String tenSanPham, DanhMuc maDanhMuc, LoaiSanPham maloaiSP, NhaPhanPhoi maNPP, BigDecimal giaBan, Integer soLuong, boolean trangThai) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.maDanhMuc = maDanhMuc;
        this.maloaiSP = maloaiSP;
        this.maNPP = maNPP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public DanhMuc getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(DanhMuc maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public LoaiSanPham getMaloaiSP() {
        return maloaiSP;
    }

    public void setMaloaiSP(LoaiSanPham maloaiSP) {
        this.maloaiSP = maloaiSP;
    }

    public NhaPhanPhoi getMaNPP() {
        return maNPP;
    }

    public void setMaNPP(NhaPhanPhoi maNPP) {
        this.maNPP = maNPP;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
