package cz.czechitas.java2webapps.lekce3.controller;
import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {


    @GetMapping("/")
    public ModelAndView vratOsobniUdaje() {
//      vytvořím instanci třídy Person (entity)
        Person osoba = new Person("Dana", "Holubová", LocalDate.of(1983,3,20));
        //      nastavím údaje, je lepší to udělat v konstruktoru
//        person.setGivenName("Jan");
//        person.setSurname("Palach");
//        person.setBirthDate(LocalDate.of(1948,8,11));
//        person.setAge(72);

//      vytvořím instanci třídy Address (entity)
        Address adresa = new Address("Jánošíkova 44","64300","Brno");

        ModelAndView card = new ModelAndView("card");
//        do modelu se předá celý objekt Person
            card.addObject("osoba", osoba);
//        do modelu se předá celý objekt Address
        card.addObject("adresa", adresa);
            return card;
            }
}
