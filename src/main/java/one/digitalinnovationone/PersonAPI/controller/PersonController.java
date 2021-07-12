package one.digitalinnovationone.PersonAPI.controller;

import one.digitalinnovationone.PersonAPI.dto.request.PersonDTO;
import one.digitalinnovationone.PersonAPI.dto.response.MessageResponseDTO;
import one.digitalinnovationone.PersonAPI.entities.Person;
import one.digitalinnovationone.PersonAPI.repository.PersonRepository;
import one.digitalinnovationone.PersonAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> f2eea43d4d0fb6e7702d6eaf493e4e0fa37a5dfe

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

<<<<<<< HEAD
    private final PersonService personService;
=======
    private PersonService personService;
>>>>>>> f2eea43d4d0fb6e7702d6eaf493e4e0fa37a5dfe

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
<<<<<<< HEAD
    }

    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
=======
>>>>>>> f2eea43d4d0fb6e7702d6eaf493e4e0fa37a5dfe
    }

}
