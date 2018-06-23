package pl.edu.agh.mwo.lazyminds.model;

import java.util.List;
import java.util.Objects;

public class User {

	private String name;
	private String surname;

	private List<WorkUnit> workUnits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<WorkUnit> getWorkUnits() {
		return workUnits;
	}

	public void setWorkUnits(List<WorkUnit> workUnits) {
		this.workUnits = workUnits;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,surname); 
	}

	@Override
	public boolean equals(Object user) {
		if (this.getName().equals(((User) user).getName()) && this.getSurname().equals(((User) user).getSurname()))
			return true;
		else {
			return false;
		}

	}

}