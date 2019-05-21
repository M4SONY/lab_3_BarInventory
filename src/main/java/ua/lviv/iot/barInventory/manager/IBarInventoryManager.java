package ua.lviv.iot.barInventory.manager;

import java.util.List;
import ua.lviv.iot.barInventory.model.BarInventory;

public interface IBarInventoryManager {

	List<BarInventory> findByPrice(List<BarInventory> inventory, double price);

	List<BarInventory> sortByWeight(List<BarInventory> inventory, boolean reverse);

	List<BarInventory> sortByPrice(List<BarInventory> inventory, boolean reverse);

}
