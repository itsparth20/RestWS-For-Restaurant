package com.tesla.solution.repository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tesla.solution.model.Rating;

public interface RatingRepository extends CrudRepository<Rating, Long> {
	
	/*@Query("select count(*) from rating r where r.userId = ?1 and r.restaurantId = ?2 and r.date >= ?3")
    public int countRating(@Param("uid") Long uid, @Param("rid") Long rid, @Param("date") LocalDate date);*/
	
	List<Rating> findByUserIdAndRestaurantIdAndDateGreaterThan(Long uid, Long rid, LocalDate date);
	List<Rating> findByUserId(Long userId);
	List<Rating> findByRestaurantId(Long valueOf);
	List<Rating> findByTotalScore(int score);
}
