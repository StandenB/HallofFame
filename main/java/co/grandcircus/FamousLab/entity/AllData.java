package co.grandcircus.FamousLab.entity;

import java.util.List;

public class AllData {

	private List<TinyScientists> tiny;
	private List<CompleteScientists> complete;
	
	public List<TinyScientists> getTinyscientists() {
		return tiny;
	}
	public void setTinyscientists(List<TinyScientists> tinyscientists) {
		this.tiny = tinyscientists;
	}
	public List<CompleteScientists> getCompletescientists() {
		return complete;
	}
	public void setCompletescientists(List<CompleteScientists> completescientists) {
		this.complete = completescientists;
	}
	@Override
	public String toString() {
		return "AllData [tinyscientists=" + tiny + ", completescientists=" + complete + "]";
	}
	
}
