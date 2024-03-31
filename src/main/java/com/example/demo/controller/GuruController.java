package com.example.demo.controller;

import com.example.demo.model.GuruModel;
import com.example.demo.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuruController {

    private final GuruService guruService;

    public GuruController(GuruService guruService) {
        this.guruService = guruService;
    }

    // Endpoint untuk mendapatkan semua guru
    @GetMapping
    public ResponseEntity<List<GuruModel>> getAllGuru() {
        List<GuruModel> guruList = guruService.getAllGuru();
        return new ResponseEntity<>(guruList, HttpStatus.OK);
    }

    // Endpoint untuk mendapatkan guru berdasarkan ID
    @GetMapping("/{id}")
    public ResponseEntity<GuruModel> getGuruById(@PathVariable("id") Long id) {
        GuruModel guru = guruService.getGuruById(id);
        if (guru != null) {
            return new ResponseEntity<>(guru, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guru")
    public ResponseEntity<GuruModel> addGuru(@RequestBody GuruModel guru) {
        GuruModel newGuru = guruService.createGuru(guru);
        return new ResponseEntity<>(newGuru, HttpStatus.CREATED);
    }

    // Endpoint untuk memperbarui informasi guru
    @PutMapping("/{id}")
    public ResponseEntity<GuruModel> updateGuru(@PathVariable("id") Long id, @RequestBody GuruModel guruDetails) {
        GuruModel updatedGuru = guruService.updateGuru(id, guruDetails);
        if (updatedGuru != null) {
            return new ResponseEntity<>(updatedGuru, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint untuk menghapus guru
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuru(@PathVariable("id") Long id) {
        guruService.deleteGuru(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
