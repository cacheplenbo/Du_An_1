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
@Table(name = "NhaPhanPhoi")
public class NhaPhanPhoi {
    @Id
    @Column(name = "MaNhaPhanPhoi", nullable = false)
    private String maNhaPhanPhoi;
    @Column(name = "tenNhaPhanPhoi", nullable = false)
    private String tenNhaPhanPhoi;
    @OneToMany(mappedBy = "NhaPhanPhoi", fetch = FetchType.EAGER)
    private ArrayList<SanPham> listSanPham ;
    
    public NhaPhanPhoi() {
    }

    public ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }

    public NhaPhanPhoi(String maNhaPhanPhoi, String tenNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }

    public String getMaNhaPhanPhoi() {
        return maNhaPhanPhoi;
    }

    public void setMaNhaPhanPhoi(String maNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
    }

    public String getTenNhaPhanPhoi() {
        return tenNhaPhanPhoi;
    }

    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }
    
}
