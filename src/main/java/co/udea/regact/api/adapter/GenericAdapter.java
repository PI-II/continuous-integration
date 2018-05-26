package co.udea.regact.api.adapter;

import java.io.Serializable;

import co.udea.regact.api.exception.AdapterException;

public interface GenericAdapter<DTO extends Serializable,E> {
	
	
	public  DTO getDto() throws AdapterException ;
	
	public  E getEntity() throws AdapterException;

}
