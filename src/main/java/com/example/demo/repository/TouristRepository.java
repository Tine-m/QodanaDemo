package com.example.demo.repository;


import com.example.demo.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> attractions =
            new ArrayList<>(List.of(
                    new TouristAttraction("SMK", "Museum for Kunst", "København", 145, List.of("Kunst", "Museum")),
                    new TouristAttraction("Odense Zoo", "Europas bedste zoo", "Odense", 95, List.of("Børnevenlig")),
                    new TouristAttraction("Dyrehaven", "Naturpark med skovområder", "Kongens Lyngby", 0, List.of("Natur", "Gratis")),
                    new TouristAttraction("Tivoli.", "Forlystelsespark i København centrum", "København", 175, List.of("Børnevenlig"))
            ));

    public List<TouristAttraction> findAll() {
        return attractions;
    }

    public TouristAttraction findByName(String name) {
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                return attraction;
            }
        }
        return null;
    }

    public void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }

    public void updateAttraction(TouristAttraction attraction) {
        for (int i = 0; i < attractions.size(); i++) {
            TouristAttraction a = attractions.get(i);
            if (a.getName().equalsIgnoreCase(attraction.getName())) {
                attractions.remove(i);
                attractions.add(i, attraction);
                //attractions.set(i, attraction);
            }
        }
    }

    public void deleteAttraction(TouristAttraction attraction) {
        for (int i = 0; i < attractions.size(); i++) {
            TouristAttraction a = attractions.get(i);
            if (a.getName().equalsIgnoreCase(attraction.getName())) {
                attractions.remove(i);
                //break; //NEW
            }
        }
    }
}