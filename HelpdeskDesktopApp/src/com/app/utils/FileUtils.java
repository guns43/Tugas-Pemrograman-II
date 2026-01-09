/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.utils;

import com.app.model.Pengaduan;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author windows-11
 */
public class FileUtils {
  private static final String FILE_NAME = "pengaduan.csv";

    // SIMPAN BARU (CREATE)
    public static void simpanPengaduan(Pengaduan p) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(p.getJudul() + "," +
                     p.getIsi().replace(",", " ") + "," +
                     p.getKategori() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BACA SEMUA DATA
    public static List<Pengaduan> bacaSemua() {
        List<Pengaduan> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    list.add(new Pengaduan(data[0], data[1], data[2]));
                }
            }
        } catch (IOException e) {
            // file belum ada → tidak masalah
        }
        return list;
    }

    // TULIS ULANG (UNTUK EDIT & HAPUS)
    public static void tulisUlang(List<Pengaduan> list) {
        try (FileWriter fw = new FileWriter(FILE_NAME, false)) {
            for (Pengaduan p : list) {
                fw.write(p.getJudul() + "," +
                         p.getIsi().replace(",", " ") + "," +
                         p.getKategori() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
