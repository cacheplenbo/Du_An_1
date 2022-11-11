package Service.impl;

import java.util.ArrayList;
import model.NhanVien;
import Responsitory.NhanVienRepository;
import Service.NhanVienService;
import ViewModel.NhanVienRespone;

/**
 *
 * @author Xuan Truong
 */
public class NhanVienServiceImpl implements NhanVienService {

    private final NhanVienRepository repo = new NhanVienRepository();

    @Override
    public ArrayList<NhanVienRespone> listNhanVien() {
        return repo.listNhanVien();
    }

    @Override
    public String themNhanVien(NhanVien x) {
        boolean themNhanVien = repo.themNhanVien(x);
        if (themNhanVien) {
            return "Thanh cong";
        }
        return "That bai";
    }

    @Override
    public String xoaNhanVien(NhanVien x) {
        boolean xoaNhanVien = repo.xoaNhanVien(x);
        if (xoaNhanVien) {
            return "Thanh cong";
        }
        return "That bai";
    }

    @Override
    public String suaNhanVien(String maNhanVien, NhanVien x) {
        boolean suaNhanVien = repo.suaNhanVien(maNhanVien, x);
        if (suaNhanVien) {
            return "Thanh cong";
        }
        return "That bai";
    }
}
