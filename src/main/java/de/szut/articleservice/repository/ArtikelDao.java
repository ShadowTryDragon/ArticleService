package de.szut.articleservice.repository;

import de.szut.articleservice.model.Artikel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArtikelDao {
    Map<Long, Artikel> artikelListe;

    public ArtikelDao() {
        initHashMap();
    }
    public void initHashMap() {
        artikelListe = new HashMap<>();
        insert(new Artikel(1,"Marques", "Ein Spiezelles Objekt",80.99,99.99));
    }
    public void insert(Artikel artikel) {
        artikelListe.put(artikel.getId(),artikel);
    }
    public Artikel findById(long id) {
        return artikelListe.get(id);
    }

    public List<Artikel> findAll() {
        return new ArrayList<Artikel>(artikelListe.values());
    }

    public void update(Artikel artikel) {
        artikelListe.replace(artikel.getId(),artikel);

    }

    public void delete(long id) {
        artikelListe.remove(id);

    }
}
