package ua.lviv.lgs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.lviv.lgs.model.Level;
import ua.lviv.lgs.model.Participant;
import ua.lviv.lgs.services.ParticipantService;

@Controller
public class ApplicationController  {
	
	@Autowired
	ParticipantService participantSerivce;

	//Start
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(HttpServletRequest request) {
		
		return "EllenPage";
	}
	
	//READ
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(HttpServletRequest request) {
		
		request.setAttribute("id", null);
		request.setAttribute("type", "read");
		
		return "EllenPage";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.POST)
	public String readPost(HttpServletRequest request) {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Participant participant = participantSerivce.read(id);
		
		request.setAttribute("id", id.toString());
		request.setAttribute("name", participant.getName());
		request.setAttribute("email", participant.getEmail());
		request.setAttribute("level", participant.getLevel().toString());
		request.setAttribute("primarySkill", participant.getPrimarySkill());
		
		request.setAttribute("type", "read");
		
		return "EllenPage";
	}
	
	//CREATE
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(HttpServletRequest request) {
		
		request.setAttribute("type", "create");
		
		return "EllenPage";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPost(HttpServletRequest request) {
		
		Participant participant = new Participant();
		
		participant.setName((String) request.getParameter("name"));
		participant.setEmail((String) request.getParameter("email"));
		participant.setLevel(Level.valueOf((String) request.getParameter("level")));
		participant.setPrimarySkill((String) request.getParameter("primarySkill"));
		
		participantSerivce.create(participant);
		
		request.setAttribute("type", "create");
		
		return "EllenPage";
	}
	
	//DELETE
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request) {
		
		request.setAttribute("type", "delete");
		
		return "EllenPage";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletePost(HttpServletRequest request) {
		
		Participant participant = new Participant();
		
		participant.setId(Long.parseLong((String) request.getParameter("id")));
		participant.setName((String) request.getParameter("name"));
		participant.setEmail((String) request.getParameter("email"));
		participant.setLevel(Level.valueOf((String) request.getParameter("level")));
		participant.setPrimarySkill((String) request.getParameter("primarySkill"));
		
		participantSerivce.delete(participant);
		
		request.setAttribute("type", "delete");
		
		return "EllenPage";
	}
	
	//UPDATE
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(HttpServletRequest request) {
		
		request.setAttribute("type", "update");
		
		return "EllenPage";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePost(HttpServletRequest request) {
		
Participant participant = new Participant();
		
		participant.setId(Long.parseLong((String) request.getParameter("id")));
		participant.setName((String) request.getParameter("name"));
		participant.setEmail((String) request.getParameter("email"));
		participant.setLevel(Level.valueOf((String) request.getParameter("level")));
		participant.setPrimarySkill((String) request.getParameter("primarySkill"));
		
		participantSerivce.update(participant);
		
		request.setAttribute("type", "update");
		
		return "EllenPage";
	}
	
	
}
