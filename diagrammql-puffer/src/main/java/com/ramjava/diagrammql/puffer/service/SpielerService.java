package com.ramjava.diagrammql.puffer.service;

import com.ramjava.diagrammql.puffer.model.Spieler;
import com.ramjava.diagrammql.puffer.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SpielerService {
    private List<Spieler> spielers = new ArrayList<>();
    // Generate the Ids
    AtomicInteger id = new AtomicInteger(0);

    public List<Spieler> findAll() {
        return spielers;
    }

    public Optional<Spieler> findOne(Integer id) {
        return spielers.stream()
                .filter(spieler -> spieler.id() == id)
                .findFirst();
    }

    public Spieler create(String name, Team team) {
        var spieler = new Spieler(id.incrementAndGet(), name, team);
        spielers.add(spieler);
        return spieler;

    }

    public Spieler update(Integer id, String name, Team team) {
        var updateSpieler = new Spieler(id, name, team);
        Optional<Spieler> optional = spielers.stream()
                .filter(c -> c.id() == id)
                .findFirst();
        if (optional.isPresent()) {
            Spieler spieler = optional.get();
            int index = spielers.indexOf(spieler);
            spielers.set(index, updateSpieler);
        } else {
            throw new IllegalArgumentException("Ungültiger Spieler");
        }
        return updateSpieler;
    }

    public Spieler delete(Integer id) {
        Spieler spieler = spielers.stream()
                .filter(c -> c.id() == id)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Ungültiger Spieler"));
        spielers.remove(spieler);
        return spieler;
    }

    // Initialize the list of players with some initial data
    @PostConstruct
    private void  init() {
        spielers.add(new Spieler(id.incrementAndGet(), "Reinhard Heydrich", Team.HEER));
        spielers.add(new Spieler(id.incrementAndGet(), "Adolf Hitler", Team.LUFTWAFFE));
        spielers.add(new Spieler(id.incrementAndGet(), "Heinrich Himmler", Team.KRIEGSMARINE));
    }
}
