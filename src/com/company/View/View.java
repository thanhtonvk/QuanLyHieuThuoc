package com.company.View;

import com.company.BLL.Thuoc_BLL;
import com.company.DAL.Thuoc_DAL;
import com.company.Entites.Thuoc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private static void Menu(){
        System.out.println("==========================================================");
        System.out.println("|          QUẢN LÝ DANH MỤC THUỐC HIỆU THUỐC              |");
        System.out.println("|                      BẠCH MAI                           |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|              1. Nhập thông tin thuốc                    |");
        System.out.println("|              2. Hiện thông tin                          |");
        System.out.println("|              3. Cập nhật thông tin                      |");
        System.out.println("|              4. Xóa thông tin                           |");
        System.out.println("|              5. Tìm kiếm                                |");
        System.out.println("|              0. Thoát                                   |");
        System.out.println("-----------------------------------------------------------");
    }
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Thuoc>thuocs = new ArrayList<>();
    public static void run() throws IOException {
        Thuoc_DAL.DocFile(thuocs);
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner. nextLine());
            if(chon == 0)break;
            switch (chon){
                case 1:
                    Thuoc_BLL.nhapThuoc(thuocs);
                    Thuoc_DAL.GhiFile(thuocs);
                    break;
                case 2:
                    Thuoc_BLL.Hien(thuocs);
                    break;
                case 3:
                    Thuoc_BLL.capNhat(thuocs);
                    Thuoc_DAL.GhiFile(thuocs);
                    break;
                case 4:
                    Thuoc_BLL.xoa(thuocs);
                    Thuoc_DAL.GhiFile(thuocs);
                    break;
                case 5:
                    Thuoc_BLL.timKiem(thuocs);
                    break;
                default:break;
            }
        }
    }
}

