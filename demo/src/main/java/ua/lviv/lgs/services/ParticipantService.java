package ua.lviv.lgs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.model.Participant;
import ua.lviv.lgs.repositories.ParticipantRepository;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepository participantRepository;
	
	@Transactional
	public void create(Participant participant) {
		participantRepository.save(participant);
	}
	
	public Participant read(Long id) {
		return participantRepository.findById(id).get();
	}
	
	public void update(Participant participant) {
		participantRepository.save(participant);
	}
	
	public void delete(Participant participant) {
		participantRepository.delete(participant);
	}

	
	
}
