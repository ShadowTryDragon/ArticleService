package de.szut.articleservice.service;

import de.szut.articleservice.model.Artikel;
import de.szut.articleservice.repository.ArtikelDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtikelService {
    private ArtikelDao artikelDao;

    public ArtikelService() {
        artikelDao = new ArtikelDao();
    }

    public Artikel add(Artikel artikel) {
        artikelDao.insert(artikel);
        return artikelDao.findbyId(artikel.getId());
    }

    public Artikel update(Artikel artikel) {
        return null;
    }

    public void delete(long id){

    }

    public Artikel read(long id) {
        return null;
    }

    public List<Artikel> readAll() {
        return null;
    }
}
