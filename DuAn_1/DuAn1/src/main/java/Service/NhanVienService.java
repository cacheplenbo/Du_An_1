package Service;

import java.util.ArrayList;
import model.NhanVien;
import ViewModel.NhanVienRespone;

/**
 *
 * @author Xuan Truong
 */
public interface NhanVienService {

    ArrayList<NhanVienRespone> listNhanVien();

    String themNhanVien(NhanVien x);

    String xoaNhanVien(NhanVien x);

    String suaNhanVien(String maNhanVien, NhanVien x);
}
