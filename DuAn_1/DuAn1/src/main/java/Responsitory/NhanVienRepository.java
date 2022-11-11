package Responsitory;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.ChucVu;
import Utilities.DBConection;
import ViewModel.NhanVienRespone;

/**
 *
 * @author Xuan Truong
 */
public class NhanVienRepository {

    public ArrayList<NhanVienRespone> listNhanVien() {
        String query = "SELECT NHANVIEN.MaNhanVien, NHANVIEN.TenNV, ChucVu.TenChucVu, NHANVIEN.GioiTinh, NHANVIEN.NgaySinh, NHANVIEN.DiaChi, NHANVIEN.SDT, NHANVIEN.TaiKhoan, NHANVIEN.MatKhau\n"
                + "FROM ChucVu INNER JOIN\n"
                + "NHANVIEN ON ChucVu.MaChucVu = NHANVIEN.MaCV";
        ArrayList<NhanVienRespone> listNhanVien = new ArrayList<>();
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNhanVien.add(new NhanVienRespone(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
            return listNhanVien;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean themNhanVien(NhanVien x) {
        String query = "INSERT INTO [dbo].[NHANVIEN]([MaNhanVien],[TenNV],[MaCV],[GioiTinh],[NgaySinh],[DiaChi],[SDT],[TaiKhoan],[MatKhau])\n"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getMaNhanVien());
            ps.setObject(2, x.getTenNhanVien());
            ps.setObject(3, x.getMaChucVu().getMaChucVu());
            ps.setObject(4, x.isGioiTinh());
            ps.setObject(5, x.getNgaySinh());
            ps.setObject(6, x.getDiaChi());
            ps.setObject(7, x.getSDT());
            ps.setObject(8, x.getTaiKhoan());
            ps.setObject(9, x.getMatKhau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean suaNhanVien(String maNhanVien, NhanVien x) {
        String query = "INSERT INTO [dbo].[NHANVIEN]([MaNhanVien],[TenNV],[MaCV],[GioiTinh],[NgaySinh],[DiaChi],[SDT],[TaiKhoan],[MatKhau])\n"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getTenNhanVien());
            ps.setObject(2, x.getMaChucVu().getMaChucVu());
            ps.setObject(3, x.isGioiTinh());
            ps.setObject(4, x.getNgaySinh());
            ps.setObject(5, x.getDiaChi());
            ps.setObject(6, x.getSDT());
            ps.setObject(7, x.getTaiKhoan());
            ps.setObject(8, x.getMatKhau());
            ps.setObject(9, maNhanVien);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoaNhanVien(NhanVien x) {
        String query = "DELETE FROM [dbo].[NHANVIEN] WHERE [MaNhanVien] = ?";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getMaNhanVien());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
