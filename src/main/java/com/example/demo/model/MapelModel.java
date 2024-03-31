package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "data_mapel")
public class MapelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_mapel")
    private String namaMapel;

    // Tambahkan atribut lain sesuai kebutuhan

    public MapelModel() {
        // Default constructor diperlukan oleh JPA
    }

    public MapelModel(String namaMapel, String deskripsi) {
        this.namaMapel = namaMapel;

        // Inisialisasi atribut lain jika ada
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }


}
