package model;




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
@Table(name = "LoaiSanPham")
public class LoaiSanPham {
    @Id
    @Column(name = "MaLoaiSanPham")
    private String maLoaiSanPham;
    @Column(name = "TenLoaiSanPham")
    private String tenLoaiSanPham;
    @OneToMany(mappedBy = "LoaiSanPham", fetch = FetchType.EAGER)
    private ArrayList<SanPham> listSanPham ;
    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoaiSanPham, String tenLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public String getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(String maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }
    
}
