package com.example.demo.controller;

import com.example.demo.model.MapelModel;
import com.example.demo.service.MapelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapel")
public class MapelController {

    private final MapelService mapelService;

    @Autowired
    public MapelController(MapelService mapelService) {
        this.mapelService = mapelService;
    }

    @GetMapping("/")
    public List<MapelModel> getAllMapel() {
        return mapelService.getAllMapel();
    }

    @GetMapping("/{id}")
    public MapelModel getMapelById(@PathVariable Long id) {
        return mapelService.getMapelById(id);
    }

    @PostMapping("/")
    public MapelModel createMapel(@RequestBody MapelModel mapel) {
        return mapelService.createMapel(mapel);
    }

    @PutMapping("/{id}")
    public MapelModel updateMapel(@PathVariable Long id, @RequestBody MapelModel mapel) {
        return mapelService.updateMapel(id, mapel);
    }

    @DeleteMapping("/{id}")
    public void deleteMapel(@PathVariable Long id) {
        mapelService.deleteMapel(id);
    }
}

