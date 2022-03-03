package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeService extends CrudService<PetType, Long> {
}
