package qlbanhang;

/**
 *
 * @author TGDD
 */
public class DienThoai extends DienTu{

    public DienThoai() {
        super();
    }
    public DienThoai(String mh, String ma, String ten, String mau, String loai, int nam, int soLuong, int donGia) {
        super(mh, ma, ten, mau, loai, nam, soLuong, donGia);
    }
    public double giamGia(){
        if(soLuong>120) return soLuong*donGia*0.03;
        return 0;
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
    public String toString(){
        return super.toString();
    }
}
