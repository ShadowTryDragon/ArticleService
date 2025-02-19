package de.szut.articleservice.controller;

import de.szut.articleservice.model.Artikel;
import de.szut.articleservice.service.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ArtikelController {

    private ArtikelService artikelService;

    public ArtikelController() {
        artikelService = new ArtikelService();
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Artikel>> getArtikel(@PathVariable long id) {
        List<Artikel> artikelList = artikelService.readAll();
        return  new ResponseEntity<>(artikelList, HttpStatus.OK);

    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Artikel> delete(@PathVariable long id) {
  artikelService.delete(id);
        return  new ResponseEntity(HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Artikel> add(@RequestBody Artikel request) {
        Artikel artikel = artikelService.add(request);
        return  new ResponseEntity<>(artikel, HttpStatus.OK);

    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Artikel request) {
        artikelService.update(request);
        return  new ResponseEntity(HttpStatus.OK);

    }



}
