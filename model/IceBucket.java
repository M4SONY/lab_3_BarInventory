package ua.lviv.iot.barInventory.model;

public class IceBucket extends BarInventory {

	private int completeSet;
	private Specifics specifics;
	private Material material;

	public IceBucket() {

	}

	public IceBucket(double price, int guarantee, Dimensions dimensions, ProducingCountry country, int completeSet) {
		super(price, guarantee, dimensions, country);
		this.completeSet = completeSet;
	}

	public int getCompleteSet() {
		return completeSet;
	}

	public void setCompleteSet(int completeSet) {
		this.completeSet = completeSet;
	}

	public Specifics getSpecifics() {
		return specifics;
	}

	public void setSpecifics(Specifics specifics) {
		this.specifics = specifics;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}
