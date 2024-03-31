package com.example.demo.service;

import com.example.demo.model.SiswaModel;
import com.example.demo.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    public List<SiswaModel> getAllSiswa() {
        return siswaRepository.findAll();
    }

    public SiswaModel getSiswaById(Long id) {
        Optional<SiswaModel> siswaOptional = siswaRepository.findById(id);
        return siswaOptional.orElse(null);
    }

    public SiswaModel createSiswa(SiswaModel siswa) {
        return siswaRepository.save(siswa);
    }

    public SiswaModel updateSiswa(Long id, SiswaModel updatedSiswa) {
        Optional<SiswaModel> siswaOptional = siswaRepository.findById(id);
        if (siswaOptional.isPresent()) {
            SiswaModel siswa = siswaOptional.get();
            siswa.setNama(updatedSiswa.getNama()); // Anda dapat menambahkan pembaruan lainnya di sini
            siswa.setAlamat(updatedSiswa.getAlamat());
            siswa.setKelas(updatedSiswa.getKelas());
            // Melakukan pembaruan pada atribut lainnya sesuai kebutuhan
            return siswaRepository.save(siswa);
        } else {
            return null;
        }
    }

    public void deleteSiswa(Long id) {
        siswaRepository.deleteById(id);
    }
}
