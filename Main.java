package ua.lviv.iot.barInventory;

import java.util.ArrayList;

import java.util.List;

import ua.lviv.iot.barInventory.manager.BarInventoryManager;
import ua.lviv.iot.barInventory.model.IceBucket;
import ua.lviv.iot.barInventory.model.ProducingCountry;
import ua.lviv.iot.barInventory.model.BarInventory;
import ua.lviv.iot.barInventory.model.Corkscrew;
import ua.lviv.iot.barInventory.model.Dimensions;


public class Main {
	public static void main(String[] args) {

		BarInventoryManager manager = new BarInventoryManager();
		
		IceBucket iceBucket = new IceBucket(100, 10, Dimensions.HIGHT, ProducingCountry.INDIA, 5);
		Corkscrew corkscrew = new Corkscrew(50, 6, Dimensions.WIDTH, ProducingCountry.CHINA, 3, "Cork");
		
		List<BarInventory> listInventory = new ArrayList();
		listInventory.add(corkscrew);
		listInventory.add(iceBucket);
		
		System.out.println(manager.findByPrice(listInventory, 500).toString());
		System.out.println("");
		System.out.println(manager.sortByPrice(listInventory, true).toString());
		System.out.println("");
		System.out.println(manager.sortByWeight(listInventory, true).toString());
		
		}

}
