package com.example.demo.controller;

import com.example.demo.model.SiswaModel;
import com.example.demo.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/siswa")
public class SiswaController {

    private final SiswaService siswaService;

    @Autowired
    public SiswaController(SiswaService siswaService) {
        this.siswaService = siswaService;
    }

    @GetMapping("/")
    public List<SiswaModel> getAllSiswa() {
        return siswaService.getAllSiswa();
    }

    @GetMapping("/{id}")
    public SiswaModel getSiswaById(@PathVariable Long id) {
        return siswaService.getSiswaById(id);
    }

    @PostMapping("/")
    public SiswaModel createSiswa(@RequestBody SiswaModel siswa) {
        return siswaService.createSiswa(siswa);
    }

    @PutMapping("/{id}")
    public SiswaModel updateSiswa(@PathVariable Long id, @RequestBody SiswaModel siswa) {
        return siswaService.updateSiswa(id, new SiswaModel());
    }

    @DeleteMapping("/{id}")
    public void deleteSiswa(@PathVariable Long id) {
        siswaService.deleteSiswa(id);
    }
}
