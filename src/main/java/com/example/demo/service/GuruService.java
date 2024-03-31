package com.example.demo.service;

import com.example.demo.model.GuruModel;
import com.example.demo.repository.GuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuruService {

    @Autowired
    private GuruRepository guruRepository;

    public List<GuruModel> getAllGuru() {
        return guruRepository.findAll();
    }

    public GuruModel getGuruById(Long id) {
        Optional<GuruModel> guruOptional = guruRepository.findById(id);
        return guruOptional.orElse(null);
    }

    public GuruModel createGuru(GuruModel guru) {
        return guruRepository.save(guru);
    }

    public GuruModel updateGuru(Long id, GuruModel updatedGuru) {
        Optional<GuruModel> guruOptional = guruRepository.findById(id);
        if (guruOptional.isPresent()) {
            GuruModel guru = guruOptional.get();
            guru.setNama(updatedGuru.getNama()); // Anda dapat menambahkan pembaruan lainnya di sini
            guru.setAlamat(updatedGuru.getAlamat());
            // Melakukan pembaruan pada atribut lainnya sesuai kebutuhan
            return guruRepository.save(guru);
        } else {
            return null;
        }
    }

    public void deleteGuru(Long id) {
        guruRepository.deleteById(id);
    }
}
