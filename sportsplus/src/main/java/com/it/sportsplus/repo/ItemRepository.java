package com.it.sportsplus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.Items;

public interface ItemRepository extends JpaRepository<Items, Long> {

		List<Items> findAllByRestaurantId(Long restaurantId);
}
