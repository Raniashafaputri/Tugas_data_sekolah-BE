package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "data_siswa")
public class SiswaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "kelas")
    private String kelas;
    // Tambahkan atribut lain sesuai kebutuhan

    @ManyToOne
    @JoinColumn(name = "kelas_id")
    private KelasModel kelasModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public KelasModel getKelasModel() {
        return kelasModel;
    }

    public void setKelasModel(KelasModel kelasModel) {
        this.kelasModel = kelasModel;
    }
}
