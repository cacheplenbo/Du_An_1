package Service;

import java.util.ArrayList;
import model.ChucVu;

/**
 *
 * @author Xuan Truong
 */
public interface ChucVuService {

    ArrayList<ChucVu> listChucVu();

    String themChucVu(ChucVu x);

    String xoaChucVu(ChucVu x);

    String suaChucVu(String maChucVu, ChucVu x);
}
