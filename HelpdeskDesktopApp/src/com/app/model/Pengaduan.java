/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author windows-11
 */
public class Pengaduan {
    private String judul;
    private String isi;
    private String kategori;

    public Pengaduan(String judul, String isi, String kategori) {
        this.judul = judul;
        this.isi = isi;
        this.kategori = kategori;
    }

    public String getJudul() { return judul; }
    public String getIsi() { return isi; }
    public String getKategori() { return kategori; }

    public void setJudul(String judul) { this.judul = judul; }
    public void setIsi(String isi) { this.isi = isi; }
    public void setKategori(String kategori) { this.kategori = kategori; }
}