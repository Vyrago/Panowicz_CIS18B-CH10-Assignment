package animal.carnivore;
import animal.*;

public class Lion implements Animal{


	private String name;
	private String type = "Lion";

	public Lion(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}


	public String getType() {
		return this.type;
	}
}
