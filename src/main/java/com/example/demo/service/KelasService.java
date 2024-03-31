package com.example.demo.service;

import com.example.demo.model.KelasModel;
import com.example.demo.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasService {

    @Autowired
    private KelasRepository kelasRepository;

    public List<KelasModel> getAllKelas() {
        return kelasRepository.findAll();
    }

    public KelasModel getKelasById(Long id) {
        Optional<KelasModel> kelasOptional = kelasRepository.findById(id);
        return kelasOptional.orElse(null);
    }

    public KelasModel createKelas(KelasModel kelas) {
        return kelasRepository.save(kelas);
    }

    public KelasModel updateKelas(Long id, KelasModel updatedKelas) {
        Optional<KelasModel> kelasOptional = kelasRepository.findById(id);
        if (kelasOptional.isPresent()) {
            KelasModel kelas = kelasOptional.get();
            kelas.setNamaKelas(updatedKelas.getNamaKelas()); // Anda dapat menambahkan pembaruan lainnya di sini
            kelas.setJurusan(updatedKelas.getJurusan());
            // Melakukan pembaruan pada atribut lainnya sesuai kebutuhan
            return kelasRepository.save(kelas);
        } else {
            return null;
        }
    }

    public void deleteKelas(Long id) {
        kelasRepository.deleteById(id);
    }
}
