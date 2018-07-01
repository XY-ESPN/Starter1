package com.it.sportsplus.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
