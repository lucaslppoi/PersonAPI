package one.digitalinnovationone.PersonAPI.controller;

import one.digitalinnovationone.PersonAPI.dto.response.MessageResponseDTO;
import one.digitalinnovationone.PersonAPI.entities.Person;
import one.digitalinnovationone.PersonAPI.repository.PersonRepository;
import one.digitalinnovationone.PersonAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
    }

}
