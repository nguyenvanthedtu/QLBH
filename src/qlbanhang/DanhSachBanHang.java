package qlbanhang;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author TGDD
 */
public class DanhSachBanHang {
    private ArrayList<DienTu> dt = new ArrayList<DienTu>();
    public void nhap(DienTu e){
        dt.add(e);
    }
    public void xoa(int i){
        dt.remove(i);
    }
    public void capNhat(int i, DienTu x){
        dt.set(i, x);
    }
    public int size(){
        return dt.size();
    }
    public DienTu get(int i){
        return dt.get(i);
    }
    public double tongTienGiam(){
        double s=0;
        for(int i=0;i<dt.size();i++){
            s=s+dt.get(i).giamGia();
        }
        return s;
    }
    public double tongSoLuong(){
        double s=0;
        for(int i=0;i<dt.size();i++){
            s=s+dt.get(i).getSoLuong();
        }
        return s;
    }
    public double tongTien(){
        double s=0;
        for(int i=0;i<dt.size();i++){
            s=s+dt.get(i).thanhTien();
        }
        return s;
    }
    public DienTu timKiem(String ma){
        for(DienTu a :  dt){
            if(a.getMa().equalsIgnoreCase(ma)){
                return a;
            }
        }
        return null;
    }    
    public void ghiFile(String tenFile){
        try {
            File fprint = new File(tenFile);
                PrintStream out = new PrintStream(fprint);
                for(int i=0;i<dt.size();i++){
                    out.println(dt.get(i).toString());
                }
                out.close();
        } catch (Exception e) {
        }
    }
    
    
}
