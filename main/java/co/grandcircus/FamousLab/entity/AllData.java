package co.grandcircus.FamousLab.entity;

import java.util.List;

public class AllData {

	private List<Tiny> tiny;
	private List<Complete> complete;
	
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	@Override
	public String toString() {
		return "AllData [tiny=" + tiny + ", complete=" + complete + "]";
	}

}
