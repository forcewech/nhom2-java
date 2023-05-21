 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IT SUP
 */
public class BaoCao {
    private String maBaoCao;
    private NguoiDung nguoiKiemKe = new NguoiDung();
    private String ngayThucHien, loaiKiemKe;

    public BaoCao() {
    }

    public BaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public BaoCao(String maBaoCao, String ngayThucHien, String loaiKiemKe) {
        this.maBaoCao = maBaoCao;
        this.ngayThucHien = ngayThucHien;
        this.loaiKiemKe = loaiKiemKe;
    }

    public String getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public NguoiDung getNguoiKiemKe() {
        return nguoiKiemKe;
    }

    public void setNguoiKiemKe(NguoiDung nguoiKiemKe) {
        this.nguoiKiemKe = nguoiKiemKe;
    }

    
    public String getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(String ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public String getLoaiKiemKe() {
        return loaiKiemKe;
    }

    public void setLoaiKiemKe(String loaiKiemKe) {
        this.loaiKiemKe = loaiKiemKe;
    }

    @Override
    public String toString() {
        return "BaoCao{" + "maBaoCao=" + maBaoCao + ", nguoiKiemKe=" + nguoiKiemKe + ", ngayThucHien=" + ngayThucHien + ", loaiKiemKe=" + loaiKiemKe + '}';
    }
       
}
