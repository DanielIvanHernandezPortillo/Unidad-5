package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.ContactType;
import mx.utng.practice.repository.ContactTypeRepository;

@Named
@ViewScoped
public class ContactTypeController {

	@Autowired
	private ContactTypeRepository contactTypeRepository;
	
	private List<ContactType> contactTypes;
	
	@PostConstruct
	public void init(){
		setContactTypes(contactTypeRepository.findAll());
	}
	
	public List<ContactType> getContactTypes(){
		return contactTypes;
	}
	
	public void setContactTypes(List<ContactType> contactTypes){
		this.contactTypes=contactTypes;
	}
}
