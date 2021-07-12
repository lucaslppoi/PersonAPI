package one.digitalinnovationone.PersonAPI.service;

import one.digitalinnovationone.PersonAPI.dto.mapper.PersonMapper;
import one.digitalinnovationone.PersonAPI.dto.request.PersonDTO;
import one.digitalinnovationone.PersonAPI.dto.response.MessageResponseDTO;
import one.digitalinnovationone.PersonAPI.entities.Person;
import one.digitalinnovationone.PersonAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created Person With ID " + savedPerson.getId())
                .build();

    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream().map(personMapper::toDTO)
                .collect(Collectors.toList());
    }
}
