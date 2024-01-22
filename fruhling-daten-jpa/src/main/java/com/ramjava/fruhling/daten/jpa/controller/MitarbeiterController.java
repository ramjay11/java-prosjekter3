package com.ramjava.fruhling.daten.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
* @Controller class return a view name, and the view is rendered using a template engine (e.g., JSP, Thymeleaf) to generate HTML responses.
* The @Controller annotation is suitable for applications where both the data and the view need to be returned in the response.
* @RestController annotation is a specialized version of @Controller designed for building RESTful web services.
    Controllers annotated with @RestController are responsible for handling HTTP requests and returning data (not views).
    Methods in a @RestController class are annotated with @RequestMapping or other HTTP method-specific annotations, and they typically return data directly
    (e.g., JSON or XML).
    The @RestController annotation is suitable for applications that primarily expose RESTful APIs and return data in a format like JSON.
* */
//@Controller
@RestController
public class MitarbeiterController {

    // Handler method
    //@RequestMapping(value = "/mitarbeiter", method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/mitarbeiter")
    public String getMitarbeiter() {
        return "Rückgabe der Mitarbeiterliste";
    }

    @GetMapping("/mitarbeiter/{id}")
    public String getMitarbeiterById(@PathVariable Long id) {
        return "Die Mitarbeiterdetails für die ID werden abgerufen = " + id;
    }

    // http://localhost:8082/mitarbeiter?id=3
    // Browser only supports the GetRequest, use postman to test delete requests
    @DeleteMapping("/mitarbeiter")
    public String deleteMitarbeiter(@RequestParam Long id) {
        return "Die Mitarbeiterdetails für die ID werden gelöscht = " + id;
    }


}
