
package com.it.sportsplus.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Items;
import com.it.sportsplus.models.Restaurant;
import com.it.sportsplus.models.User;
import com.it.sportsplus.repo.ItemRepository;
import com.it.sportsplus.repo.RestaurantRepository;
import com.it.sportsplus.repo.UserRepository;

@RestController
@RequestMapping("/restuarant")
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant persistedRestaurant=restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}
	@GetMapping("/getAll")
	public List<Restaurant> getAll()
	{
		List<Restaurant> restaurants=restaurantRepository.findAll();
		return restaurants;
	}
	
	@PostMapping("/addItems")
	public Items addItem(@RequestBody Items item)
	{
		Items persistedItem=itemRepository.save(item);
		return persistedItem;
		
	}
	
	@GetMapping("/getAllItemsByRestaurant")
	public List<Items> getAllItemsByRestaurant(@RequestParam Long restaurantId)
	{
		List<Items> persistedItemList=itemRepository.findAllByRestaurantId(restaurantId);
		return persistedItemList;
	}
}		
 



