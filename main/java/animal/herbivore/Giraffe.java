package animal.herbivore;
import animal.*;


public class Giraffe implements Animal{

	private String name;
	private String type = "Giraffe";

	public Giraffe(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}

  
	public String getType() {
		return this.type;
	}
}
