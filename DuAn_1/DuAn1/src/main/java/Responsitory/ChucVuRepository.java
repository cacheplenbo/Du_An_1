package Responsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ChucVu;
import Utilities.DBConection;

/**
 *
 * @author Xuan Truong
 */
public class ChucVuRepository {

    public ArrayList<ChucVu> getAllChucVu() {
        String query = "SELECT [MaChucVu],[TenChucVu] FROM [dbo].[ChucVu]";
        ArrayList<ChucVu> listChucVu = new ArrayList<>();
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listChucVu.add(new ChucVu(rs.getString(1), rs.getString(2)));
            }
            return listChucVu;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean themChucVu(ChucVu x) {
        String query = "INSERT INTO [dbo].[ChucVu]([MaChucVu],[TenChucVu])VALUES(?,?)";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getMaChucVu());
            ps.setObject(2, x.getTenChucVu());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoaChucVu(ChucVu x) {
        String query = "DELETE FROM [dbo].[ChucVu] WHERE [MaChucVu] = ?";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getMaChucVu());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean suaChucVu(String maChucVu, ChucVu x) {
        String query = "DELETE FROM [dbo].[ChucVu] WHERE [MaChucVu] = ?";
        int check = 0;
        try ( Connection con = DBConection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, x.getMaChucVu());
            ps.setObject(2, x.getTenChucVu());
            ps.setObject(3, maChucVu);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

}
