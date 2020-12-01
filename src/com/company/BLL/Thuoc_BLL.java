package com.company.BLL;

import com.company.Entites.Thuoc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Thuoc_BLL {
    static Scanner scanner = new Scanner(System.in);
    static  Random random = new Random();
    public static void nhapThuoc(ArrayList<Thuoc>thuocs){
//        int mathuoc, String tenthuoc, String lopthuoc, String donvi, String thanhphan, String ghichu
        int mathuoc = thuocs.size()+100000;
        System.out.println("Nhập tên thuốc");
        String tenthuoc = scanner.nextLine();
        System.out.println("Nhập lớp thuốc");
        String lopthuoc = scanner.nextLine();
        System.out.println("Nhập đơn vị");
        String donvi = scanner.nextLine();
        System.out.println("Nhập thành phần");
        String thanhphan = scanner.nextLine();
        System.out.println("Nhập ghi chú");
        String ghichu = scanner.nextLine();
        thuocs.add(new Thuoc(mathuoc,tenthuoc,lopthuoc,donvi,thanhphan,ghichu));
    }
    public static void display(Thuoc thuoc){
        System.out.printf("|%-20s|%-30s|%-20s|%-20s|%-20s|%-20s|\n",thuoc.getMathuoc(),thuoc.getTenthuoc(),thuoc.getLopthuoc(),thuoc.getDonvi(),thuoc.getThanhphan(),thuoc.getGhichu());
    }
    public static void Hien(ArrayList<Thuoc>thuocs){
        System.out.printf("|%-20s|%-30s|%-20s|%-20s|%-20s|%-20s|\n","Mã thuốc","Tên thuốc","Lớp thuốc","Đơn vị","Thành phần","Ghi chú");
        for (Thuoc thuoc:thuocs
             ) {
            display(thuoc);
        }
    }
    public static Thuoc find(ArrayList<Thuoc>thuocs,String keyword){
        Thuoc result = null;
        for (Thuoc thuoc:thuocs
             ) {
            if(keyword.equalsIgnoreCase(String.valueOf(thuoc.getMathuoc()))||keyword.equalsIgnoreCase(thuoc.getTenthuoc())){
                result = thuoc;
            }
        }
        return result;
    }
    public static void timKiem(ArrayList<Thuoc>thuocs){
        System.out.println("Nhập tên hoặc mã thuốc");
        String keyword = scanner.nextLine();
        Thuoc thuoc = find(thuocs,keyword);
        if(thuoc==null){
            System.out.println("Không tìm thấy thuốc");
        }
        else {
            System.out.printf("|%-20s|%-30s|%-20s|%-20s|%-20s|%-20s|\n","Mã thuốc","Tên thuốc","Lớp thuốc","Đơn vị","Thành phần","Ghi chú");
            display(thuoc);
        }
    }
    public static void capNhat(ArrayList<Thuoc>thuocs){
        System.out.println("Nhập tên hoặc mã thuốc");
        String keyword = scanner.nextLine();
        Thuoc thuoc = find(thuocs,keyword);
        if(thuoc==null){
            System.out.println("Không tìm thấy thuốc");
        }
        else {
            System.out.println("Nhập tên thuốc");
            thuoc.setTenthuoc(scanner.nextLine());
            System.out.println("Nhập lớp thuốc");
            thuoc.setLopthuoc(scanner.nextLine());
            System.out.println("Nhập đơn vị");
            thuoc.setDonvi(scanner.nextLine());
            System.out.println("Nhập thành phần");
            thuoc.setThanhphan(scanner.nextLine());
            System.out.println("Nhập ghi chú");
            thuoc.setGhichu(scanner.nextLine());
            System.out.println("Cập nhật thành công");
        }
    }
    public static void xoa(ArrayList<Thuoc>thuocs){
        System.out.println("Nhập tên hoặc mã thuốc");
        String keyword = scanner.nextLine();
        Thuoc thuoc = find(thuocs,keyword);
        if(thuoc==null){
            System.out.println("Không tìm thấy thuốc");
        }
        else {
            thuocs.remove(thuoc);
            System.out.println("Xóa thành công");
        }
    }



}
