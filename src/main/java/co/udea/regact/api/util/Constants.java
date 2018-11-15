package co.udea.regact.api.util;

public enum Constants {
	
	ESTADO_ACTIVO("ACTIVO");
	
	String value;
	
	private Constants(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

}
