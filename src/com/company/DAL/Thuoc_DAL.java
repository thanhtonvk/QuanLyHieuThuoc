package com.company.DAL;

import com.company.Entites.Thuoc;

import java.io.*;
import java.util.ArrayList;

public class Thuoc_DAL {
    static File file = new File("thuoc.txt");

    public static void DocFile(ArrayList<Thuoc> thuocs) throws IOException {
//        int mathuoc, String tenthuoc, String lopthuoc, String donvi, String thanhphan, String ghichu
        if (file.exists()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int mathuoc = Integer.parseInt(line.split("#")[0]);
                String tenthuoc = line.split("#")[1];
                String lopthuoc = line.split("#")[2];
                String donvi = line.split("#")[3];
                String thanhphan = line.split("#")[4];
                String ghichu = line.split("#")[5];
                thuocs.add(new Thuoc(mathuoc, tenthuoc, lopthuoc, donvi, thanhphan, ghichu));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<Thuoc>thuocs) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (Thuoc thuoc:thuocs
             ) {
            fileWriter.write(thuoc.toString()+"\n");
        }
        fileWriter.close();
    }
}
