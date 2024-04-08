package de.szut.articleservice.repository;

import de.szut.articleservice.model.Artikel;

import java.util.List;
import java.util.Map;

public class ArtikelDao {
    Map<Long, Artikel> artikelListe;

    public ArtikelDao() {

    }
    public void initHashMap() {

    }
    public void insert(Artikel artikel) {
        artikelListe.put(artikel.getId(),artikel);

    }
    public Artikel findbyId(long id) {
        return artikelListe.get(id);
    }

    public List<Artikel> findAll() {
        return artikelListe.values().stream().toList();
    }

    public void update(Artikel artikel) {
        artikelListe.replace(artikel.getId(),artikel);

    }

    public void delete(long id) {
        artikelListe.remove(id);

    }
}
