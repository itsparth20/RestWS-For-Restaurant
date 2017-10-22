package com.tesla.solution;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tesla.solution.model.Rating;
import com.tesla.solution.model.Restaurant;
import com.tesla.solution.model.User;
import com.tesla.solution.repository.RatingRepository;
import com.tesla.solution.repository.RestaurantRepository;
import com.tesla.solution.repository.UserRepository;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("parth", "patel", "6506609514"));
		restaurantRepository.save(new Restaurant("Sweet Tomato", "Maxican", "123 street rd", "ca", "santa clara", "95051"));
		ratingRepository.save(new Rating(1L, 2L, LocalDate.now(), 5, 5, 5, 5, 5, "Very Good"));
	}

}
