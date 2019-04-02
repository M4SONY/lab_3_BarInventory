package ua.lviv.iot.barInventory.model;

public class BarInventory {

	private double price;
	private int guarantee;
	private Dimensions dimensions;
	private ProducingCountry country;
	private int weight;

	public BarInventory() {

	}

	public BarInventory(double price, int guarantee, Dimensions dimensions, ProducingCountry country) {
		super();
		this.price = price;
		this.guarantee = guarantee;
		this.dimensions = dimensions;
		this.country = country;
	}

	public String toString() {
		return "BarInventory{" + " Price " + price + "," + " Guarantee " + guarantee + "," + " Dimensions " + dimensions + "," + " ProducingCountry " + country;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public ProducingCountry getCountry() {
		return country;
	}

	public void setCountry(ProducingCountry country) {
		this.country = country;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
