package com.tesla.solution.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long userId;
	private Long restaurantId;
	private LocalDate date;
	@Min(1)
	@Max(5)
	private int cost;
	@Min(1)
	@Max(5)
	private int food;
	@Min(1)
	@Max(5)
	private int cleanliness;
	@Min(1)
	@Max(5)
	private int service;
	private int totalScore;
	private String comment;
	
	protected Rating(){}
	public Rating(Long userId, Long restaurantId, LocalDate date, int cost, int food, int cleanliness, int service,
			int totalScore, String comment) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.date = date;
		this.cost = cost;
		this.food = food;
		this.cleanliness = cleanliness;
		this.service = service;
		this.totalScore = totalScore;
		this.comment = comment;
	}



	@Override
	public String toString() {
		return "Rating [id=" + id + ", userId=" + userId + ", restaurantId=" + restaurantId + ", date=" + date
				+ ", cost=" + cost + ", food=" + food + ", cleanliness=" + cleanliness + ", service=" + service
				+ ", totalScore=" + totalScore + "]";
	}
	public Long getId() {
		return id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getCleanliness() {
		return cleanliness;
	}
	public void setCleanliness(int cleanliness) {
		this.cleanliness = cleanliness;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
