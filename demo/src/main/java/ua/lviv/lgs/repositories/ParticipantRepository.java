package ua.lviv.lgs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.Participant;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long>{

}
