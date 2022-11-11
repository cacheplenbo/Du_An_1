/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitory;

import model.KhachHang;
import ViewModel.QLKhachHang;
import java.util.List;


/**
 *
 * @author DELL 5515
 */
public interface IKhachHangResponsitory {
    List<QLKhachHang> getAll();
    Integer add(KhachHang kh);
    Integer delete(String maKH);
    Integer update(String maKH, KhachHang kh);
}
