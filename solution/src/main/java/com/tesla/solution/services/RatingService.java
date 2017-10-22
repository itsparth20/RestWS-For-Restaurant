package com.tesla.solution.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tesla.solution.model.Rating;
import com.tesla.solution.repository.RatingRepository;
import com.tesla.solution.validation.RatingValidation;

@Service
public class RatingService {
	
	@Autowired
	RatingRepository ratingRepository;
	
	@Autowired
	RatingValidation ratingValidation;
	
	public Map<String,String> saveRating(Rating rating){
		Map<String, String> map = new HashMap<>();
		ratingValidation.validateRatingObj(rating, map);
		ratingValidation.ratedWithInAMonth(rating, map);
		rating.setTotalScore(ratingValidation.getTotalScore(rating, map));
		if(map.size() > 0) return map;
		ratingRepository.save(rating);
		map.put("Done", "Thank you for feedback");
		return map;
	}

	public Map<String, String> UpdateRating(Rating rating) {
		Map<String, String> map = new HashMap<>();
		ratingValidation.validateRatingObj(rating, map);
		if(map.size() > 0) return map;
		rating.setTotalScore(ratingValidation.getTotalScore(rating, map));
		if(map.size() > 0) return map;
		ratingRepository.save(rating);
		map.put("Done", "Feedback updated");
		return map;
	}

	public List<Rating> findRatingByUserId(String userId) {
		return ratingRepository.findByUserId(Long.valueOf(userId.trim()));
	}

	public List<Rating> findRatingByRestaurantId(String restaurantId) {
		return ratingRepository.findByRestaurantId(Long.valueOf(restaurantId.trim()));
	}
	
	public List<Rating> findRatingByTotalScore(String score) {
		return ratingRepository.findByTotalScore(Integer.valueOf(score.trim()));
	}

	
}
