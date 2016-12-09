package mx.utng.practice.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.utng.practice.model.ContactType;
import mx.utng.practice.repository.ContactTypeRepository;


@Component
public class ContactTypeConverter implements Converter{

	@Autowired 
	private ContactTypeRepository contactTypeRepository;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value.isEmpty()){ return null;}
		try{
		ContactType contactType = contactTypeRepository.findOne(new Long(value));
		return contactType;
		}catch (Exception e){
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof ContactType){
			ContactType contactType = (ContactType) value;
			return contactType.getId().toString();
		}else{
			return null;
		}
	}
	
	
}

