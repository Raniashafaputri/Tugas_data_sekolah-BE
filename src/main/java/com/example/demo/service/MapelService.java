package com.example.demo.service;

import com.example.demo.model.MapelModel;
import com.example.demo.repository.MapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MapelService {

    @Autowired
    private MapelRepository mapelRepository;

    public List<MapelModel> getAllMapel() {
        return mapelRepository.findAll();
    }

    public MapelModel getMapelById(Long id) {
        Optional<MapelModel> mapelOptional = mapelRepository.findById(id);
        return mapelOptional.orElse(null);
    }

    public MapelModel createMapel(MapelModel mapel) {
        return mapelRepository.save(mapel);
    }

    public MapelModel updateMapel(Long id, MapelModel updatedMapel) {
        Optional<MapelModel> mapelOptional = mapelRepository.findById(id);
        if (mapelOptional.isPresent()) {
            MapelModel mapel = mapelOptional.get();
            mapel.setNamaMapel(updatedMapel.getNamaMapel()); // Anda dapat menambahkan pembaruan lainnya di sini
            // Melakukan pembaruan pada atribut lainnya sesuai kebutuhan
            return mapelRepository.save(mapel);
        } else {
            return null;
        }
    }

    public void deleteMapel(Long id) {
        mapelRepository.deleteById(id);
    }
}
