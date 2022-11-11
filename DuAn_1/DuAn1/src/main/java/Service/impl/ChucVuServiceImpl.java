package Service.impl;

import java.util.ArrayList;
import model.ChucVu;
import Responsitory.ChucVuRepository;
import Service.ChucVuService;

/**
 *
 * @author Xuan Truong
 */
public class ChucVuServiceImpl implements ChucVuService {

    private ChucVuRepository repo = new ChucVuRepository();

    @Override
    public ArrayList<ChucVu> listChucVu() {
        return repo.getAllChucVu();
    }

    @Override
    public String themChucVu(ChucVu x) {
        boolean them = repo.themChucVu(x);
        if (them) {
            return "Thanh cong";
        }
        return "That bai";
    }

    @Override
    public String xoaChucVu(ChucVu x) {
        boolean xoa = repo.xoaChucVu(x);
        if (xoa) {
            return "Thanh cong";
        }
        return "That bai";
    }

    @Override
    public String suaChucVu(String maChucVu, ChucVu x) {
        boolean sua = repo.suaChucVu(maChucVu, x);
        if (sua) {
            return "Thanh cong";
        }
        return "That bai";
    }

}
