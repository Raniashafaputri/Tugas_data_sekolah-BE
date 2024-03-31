package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "data_kelas")
public class KelasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "namakelas")
    private String namaKelas;
    @Column(name = "jurusan")
    private String jurusan;
    // Tambahkan atribut lain sesuai kebutuhan

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
