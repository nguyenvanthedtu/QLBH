package qlbanhang;

/**
 *
 * @author TGDD
 */
public abstract class DienTu {
    protected String ma, ten, mau, loai,mh;
    protected int nam,soLuong, donGia;
    public DienTu(){
        mh=ma = ten =mau =loai=null;
        nam=soLuong=donGia =0;
    }
    public DienTu(String mh,String ma, String ten, String mau, String loai, int nam, int soLuong, int donGia) {
        this.mh=mh;
        this.ma = ma;
        this.ten = ten;
        this.mau = mau;
        this.loai = loai;
        this.nam = nam;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String mh) {
        this.mh = mh;
    }
    
    public abstract double giamGia();
    public double thanhTien(){
        return getSoLuong()*getDonGia()-giamGia();
    }
    public String toString(){
        return ma+" "+ten+" "+nam+" "+mau+" "+soLuong+" "+loai+" "+donGia+" "+mh;             
    }
}
