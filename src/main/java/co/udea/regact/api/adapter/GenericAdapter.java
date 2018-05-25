package co.udea.regact.api.adapter;

import java.io.Serializable;

public interface GenericAdapter<DTO extends Serializable,E> {
	
	
	public abstract DTO getDto();
	
	public abstract E getEntity();

}
