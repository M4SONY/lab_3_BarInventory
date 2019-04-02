package ua.lviv.iot.barInventory.model;

public class Corkscrew extends BarInventory {

	private Type type;
	private int numberDetails;
	private String producer;

	public Corkscrew() {
	}

	public Corkscrew(double price, int guarantee, Dimensions dimensions, ProducingCountry country, int numberDetails,
			String producer) {
		super(price, guarantee, dimensions, country);
		this.numberDetails = numberDetails;
		this.producer = producer;
	}

	public String toString() {
		return super.toString() + " numberDetails " + numberDetails + "}";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getNumberDetails() {
		return numberDetails;
	}

	public void setNumberDetails(int numberDetails) {
		this.numberDetails = numberDetails;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

}