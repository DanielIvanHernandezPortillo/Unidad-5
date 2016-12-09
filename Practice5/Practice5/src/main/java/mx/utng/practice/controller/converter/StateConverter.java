package mx.utng.practice.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.utng.practice.model.State;
import mx.utng.practice.repository.StateRepository;

@Component
public class StateConverter implements Converter{

	@Autowired 
	private StateRepository stateRepository;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value.isEmpty()){ return null;}
		try{
		State state = stateRepository.findOne(new Long(value));
		return state;
		}catch (Exception e){
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof State){
			State state = (State) value;
			return state.getId().toString();
		}else{
			return null;
		}
	}
	
	
}
