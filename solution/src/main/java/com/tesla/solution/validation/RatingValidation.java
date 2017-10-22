package com.tesla.solution.validation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tesla.solution.model.Rating;
import com.tesla.solution.repository.RatingRepository;

@Component
public class RatingValidation {

	@Autowired
	private RatingRepository ratingRepository;

	public void validateRatingObj(Rating rating, Map<String, String> map) {

		validateRate(map, rating.getCost(), "cost", rating);
		validateRate(map, rating.getFood(), "food", rating);
		validateRate(map, rating.getCleanliness(), "cleanliness", rating);
		validateRate(map, rating.getService(), "service", rating);
		if (map.size() > 0)
			return;
	}

	public void ratedWithInAMonth(Rating rating, Map<String, String> map) {
		LocalDate date = LocalDate.now();
		date = date.minus(1, ChronoUnit.MONTHS);
		List<Rating> list = ratingRepository.findByUserIdAndRestaurantIdAndDateGreaterThan(rating.getUserId(),
				rating.getRestaurantId(), date);
		if (list.size() > 0) {
			map.put("Date", "You provided feedback to this restaurant within a month. So please try after 1 month.");
		}
	}

	public int getTotalScore(Rating rating, Map<String,String> map) {
		int rate = (int) Math
				.round((rating.getCost() + rating.getCleanliness() + rating.getFood() + rating.getService()) / 4);
		if(rate <= 1 && (rating.getComment() == null || rating.getComment().isEmpty()
					|| rating.getComment().trim().length() == 0)) {
				map.put("Commant", "must be provided");
		}
		return rate;
	}

	private void validateRate(Map<String, String> map, int rate, String cost, Rating rating) {
		if (rate < 1 || rate > 5) {
			map.put(cost, " rate should be between 1 to 5");
		} 
	}
}
