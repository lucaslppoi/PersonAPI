package one.digitalinnovationone.PersonAPI.dto.mapper;

import one.digitalinnovationone.PersonAPI.dto.request.PersonDTO;
import one.digitalinnovationone.PersonAPI.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);

}
