package com.tesla.solution.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesla.solution.model.Rating;
import com.tesla.solution.services.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping("/rating")
	public Map<String,String> saveRating(@RequestBody Rating rating){
		return ratingService.saveRating(rating);
	}
	
	@PutMapping("/rating")
	public Map<String,String> UpdateRating(@RequestBody Rating rating){
		return ratingService.UpdateRating(rating);
	}
	
	@GetMapping("rating/user/{userId}")
	public List<Rating> getRatingByUser(@PathVariable String userId){
		return ratingService.findRatingByUserId(userId);
	}
	
	@GetMapping("rating/restaurant/{restaurantId}")
	public List<Rating> getRatingByRestaurantId(@PathVariable String restaurantId){
		return ratingService.findRatingByRestaurantId(restaurantId);
	}
	
	@GetMapping("rating/score/{totalScore}")
	public List<Rating> getRatingByScore(@PathVariable String totalScore){
		return ratingService.findRatingByTotalScore(totalScore);
	}

}
