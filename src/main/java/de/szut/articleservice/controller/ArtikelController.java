package de.szut.articleservice.controller;

import de.szut.articleservice.model.Artikel;
import de.szut.articleservice.service.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myappdata/articles")
public class ArtikelController {

    private ArtikelService artikelService;

    public ArtikelController() {
        artikelService = new ArtikelService();
    }

    public ResponseEntity<List<Artikel>> getArtikel() {
        List<Artikel> artikelList = artikelService.read();
        return  new ResponseEntity<>(artikelList, HttpStatus.OK);

    }



}
