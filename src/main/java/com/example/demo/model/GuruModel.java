package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table (name = "data_guru")
public class GuruModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "email")
    private String email;
    @Column(name = "tanggal_lahir")
    private String tanggal_lahir;
    @Column(name = "no_telepon")
    private String no_telepon;
    @Column(name = "mata_pelajaran")
    private String mata_pelajaran;
    @ManyToOne
    @JoinColumn(name = "mapel_id")
    private MapelModel mapelModel;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getMata_pelajaran() {
        return mata_pelajaran;
    }

    public void setMata_pelajaran(String mata_pelajaran) {
        this.mata_pelajaran = mata_pelajaran;
    }

    public MapelModel getMapelModel() {
        return mapelModel;
    }

    public void setMapelModel(MapelModel mapelModel) {
        this.mapelModel = mapelModel;
    }
}
