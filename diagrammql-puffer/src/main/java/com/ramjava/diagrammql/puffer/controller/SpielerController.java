package com.ramjava.diagrammql.puffer.controller;

import com.ramjava.diagrammql.puffer.model.Spieler;
import com.ramjava.diagrammql.puffer.model.Team;
import com.ramjava.diagrammql.puffer.service.SpielerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class SpielerController {
    // Define GraphQL layer
    private final SpielerService spielerService;

    public SpielerController(SpielerService spielerService) {
        this.spielerService = spielerService;
    }

    @QueryMapping
    public List<Spieler> findAll() {
        return spielerService.findAll();
    }

    @QueryMapping
    public Optional<Spieler> findOne(@Argument Integer id) {
        return spielerService.findOne(id);
    }

    @MutationMapping
    public Spieler create(@Argument String name, @Argument Team team) {
        return spielerService.create(name, team);
    }

    @MutationMapping
    public Spieler update(@Argument Integer id, @Argument String name, @Argument Team team) {
        return spielerService.update(id, name, team);
    }

    @MutationMapping
    public Spieler delete(@Argument Integer id) {
        return spielerService.delete(id);
    }
}
