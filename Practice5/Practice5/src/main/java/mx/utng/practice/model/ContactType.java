package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactType {
	@Id @GeneratedValue
	private Long id;
	@Column(length = 50)
	private String description;
	public ContactType(String description){
		super();
		this.description = description;
	}
	
	public ContactType(){
		this("");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result +((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass()!= obj.getClass())
			return false;
		ContactType other = (ContactType) obj;
		if (description == null){
			if(other.description != null)
				return false;
		}else if (!description.equals(other.description))
			return false;
		if(id == null){
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
