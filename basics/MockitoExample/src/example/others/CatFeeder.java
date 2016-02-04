package example.others;

public class CatFeeder {

	private CatFoodContainer container;

	public String feed() {
		getContainer().openFoodContainer();
		return "Done";
	}

	public CatFoodContainer getContainer() {
		return container;
	}

	public void setContainer(CatFoodContainer container) {
		this.container = container;
	}

}
