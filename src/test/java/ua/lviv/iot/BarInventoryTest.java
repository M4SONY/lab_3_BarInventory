package ua.lviv.iot;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import ua.lviv.iot.barInventory.manager.BarInventoryManager;
import ua.lviv.iot.barInventory.manager.IBarInventoryManager;
import ua.lviv.iot.barInventory.model.BarInventory;
import ua.lviv.iot.barInventory.model.Corkscrew;
import ua.lviv.iot.barInventory.model.Dimensions;
import ua.lviv.iot.barInventory.model.IceBucket;
import ua.lviv.iot.barInventory.model.ProducingCountry;


public class BarInventoryTest {
	
	private List<BarInventory> lst;
	private IBarInventoryManager manager;

	@BeforeEach
	public void setUp() {
		lst = new ArrayList<>();
	    lst.add(new BarInventory());
	    lst.add(new IceBucket(100, 0, Dimensions.HIGHT, ProducingCountry.USA, 90, 897));
	    lst.add(new Corkscrew(200, 10, Dimensions.WEIGHT, ProducingCountry.INDIA, 50, 874, "Still"));
	    lst.add(new BarInventory(500, 25, Dimensions.WIDTH, ProducingCountry.CHINA, 75));
	    lst.add(new BarInventory(500, 55, Dimensions.WEIGHT, ProducingCountry.USA, 5));
	    manager = new BarInventoryManager(lst);
	}
	
	@Test
	public void testFindByPrice() {
		Assertions.assertEquals(0, manager.findByPrice(lst, 300).size());
		Assertions.assertEquals(1, manager.findByPrice(lst, 0).size());
		Assertions.assertEquals(1, manager.findByPrice(lst, 100).size());
		Assertions.assertEquals(1, manager.findByPrice(lst, 200).size());
		Assertions.assertEquals(2, manager.findByPrice(lst, 500).size());
	}
	
	@Test
	public void testSortByWeight() {
		Assertions.assertEquals(0, manager.sortByWeight(lst, false).get(0).getWeight());
		Assertions.assertEquals(90, manager.sortByWeight(lst, true).get(0).getWeight());
	}
	
	@Test
	public void testSortByPrice() {
		Assertions.assertEquals(0, manager.sortByPrice(lst, false).get(0).getPrice());
		Assertions.assertEquals(500, manager.sortByPrice(lst, true).get(0).getPrice());
	}
	

}
