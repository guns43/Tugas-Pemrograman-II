/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.controller;

import com.app.model.Pengaduan;
import com.app.utils.FileUtils;
import java.util.List;



/**
 *
 * @author windows-11
 */
public class PengaduanController {
public void simpan(Pengaduan p) {
        FileUtils.simpanPengaduan(p);
    }

    public List<Pengaduan> getAll() {
        return FileUtils.bacaSemua();
    }

    public void update(int index, Pengaduan baru) {
        List<Pengaduan> list = FileUtils.bacaSemua();
        list.set(index, baru);
        FileUtils.tulisUlang(list);
    }

    public void delete(int index) {
        List<Pengaduan> list = FileUtils.bacaSemua();
        list.remove(index);
        FileUtils.tulisUlang(list);
    }
}
