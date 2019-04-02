package ua.lviv.iot.barInventory.manager;

import java.util.Collections;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.barInventory.model.BarInventory;
import ua.lviv.iot.barInventory.model.Price;

public class BarInventoryManager implements IBarInventoryManager {
	private List<BarInventory> inventory;

	public BarInventoryManager(List<BarInventory> inventory) {
		this.inventory = inventory;

	}

	public BarInventoryManager() {

	}

	@Override
	public List<BarInventory> findByPrice(List<BarInventory> inventory, double price) {
		return inventory.stream().filter(inventories -> inventories.getPrice() == price).collect(Collectors.toList());
	}
	

	@Override
	public List<BarInventory> sortByPrice(List<BarInventory> inventory, boolean reverse) {
		Comparator<BarInventory> comparator = (BarInventory b1, BarInventory b2) -> (int)(b1.getPrice() - b2.getPrice());
		if (reverse) {
			Collections.sort(inventory,comparator.reversed());
		} else {
			inventory.sort(comparator);
		}
		return inventory;
	}
	
	@Override
	  public List<BarInventory> sortByWeight(List<BarInventory> inventory, boolean reverse) {
	    if (reverse) {
	      Collections.sort(inventory, Comparator.comparing(BarInventory::getWeight).reversed());
	    } else {
	      Collections.sort(inventory, Comparator.comparing(BarInventory::getWeight));
	    }
	    return inventory;
	  }
	
	public List<BarInventory> getInventory() {
		return inventory;
	}
	
	public void setInventory(List<BarInventory> inventory) {
		
	}

}