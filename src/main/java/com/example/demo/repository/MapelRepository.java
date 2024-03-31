package com.example.demo.repository;

import com.example.demo.model.MapelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapelRepository extends JpaRepository<MapelModel, Long> {
    // Tambahkan metode khusus jika diperlukan
}
