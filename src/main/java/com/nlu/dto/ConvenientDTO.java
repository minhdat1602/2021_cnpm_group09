package com.nlu.dto;

public class ConvenientDTO extends AbstractDTO<ConvenientDTO> {
	private String name;
	private String desciption;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "ConvenientDTO [name=" + name + ", desciption=" + desciption + "]";
	}

}
