package com.example.demo.controller;

import com.example.demo.model.KelasModel;
import com.example.demo.service.KelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelas")
public class KelasController {

    private final KelasService kelasService;

    @Autowired
    public KelasController(KelasService kelasService) {
        this.kelasService = kelasService;
    }

    @GetMapping("/")
    public List<KelasModel> getAllKelas() {
        return kelasService.getAllKelas();
    }

    @GetMapping("/{id}")
    public KelasModel getKelasById(@PathVariable Long id) {
        return kelasService.getKelasById(id);
    }

    @PostMapping("/")
    public KelasModel createKelas(@RequestBody KelasModel kelas) {
        return kelasService.createKelas(kelas);
    }

    @PutMapping("/{id}")
    public KelasModel updateKelas(@PathVariable Long id, @RequestBody KelasModel kelas) {
        return kelasService.updateKelas(id, kelas);
    }

    @DeleteMapping("/{id}")
    public void deleteKelas(@PathVariable Long id) {
        kelasService.deleteKelas(id);
    }
}
