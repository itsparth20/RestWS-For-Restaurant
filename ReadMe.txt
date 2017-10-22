Note: Application is working on port 8888

I am using Java, Spring boot, Spring Data and H2 Database. To run this project we need eclipse.
 
To import our project:
	Open eclipse - click on file -> import -> Existing Maven Project -> browse -> {Select the folder and click ok. and then click next It should import our project} 

To run our project:
	once project is imported we can click on Play (Green color) button and it should run our project.
	
Database Structure:
	3 Tables:
		user
		restaurant
		rating

To check the database:
	URL: localhost:8888/h2-console
	Driver Class: org.h2.Driver
	JDBC URL: jdbc:h2:mem:testdb
	User Name: sa
	Click on connect. 
	Note: We can only check our database when our application is running. When we stop our project all database changes will be deleted. 

Note: Our Application is running on port 8888

APIs : 
1. 
	DESCRIPTION: Create User 
	URL: http://localhost:8888/users
	HTTP Method: POST
	BODY: 
		{
			"firstName": "ravi",
			"lastName": "desai",
			"phoneNumber": "6506609513"
		}

2.
	DESCRIPTION: Update a User
	URL: http://localhost:8888/users/{id}
	HTTP Method: PUT
	BODY:
		{
			"firstName": "ravi",
		    "lastName": "desai",
		    "phoneNumber": "9998881234"
		}

3. 
	DESCRIPTION: Get a Single user info
	URL: http://localhost:8888/users/{id}
	HTTP Method: GET

4. 
	DESCRIPTION: Get All user info
	URL: http://localhost:8888/users
	HTTP Method: GET
	
5. 
	DESCRIPTION: Create a restaurant
	URL: http://localhost:8888/restaurants
	HTTP Method: POST
	BODY:
		{
			"name": "Chat Bhavan",
		    "category": "Indian",
		    "address": "999 street rd",
		    "state": "ca",
		    "city": "santa clara",
		    "zipcode": "95051"
		}	
	
6. 
	DESCRIPTION: Update a restaurant
	URL: http://localhost:8888/restaurants/{id}
	HTTP Method: PUT
	BODY:
		{
	    "name": "chat",
	    "category": "Indian",
	    "address": "555 street rd",
	    "state": "ca",
	    "city": "San Frnacisco",
    	"zipcode": "90000"
	}
	
7.
	DESCRIPTION: Get Restaurant by name/city/category
	URLs: http://localhost:8888/restaurants/search/findByName?name={resturantName}
		 http://localhost:8888/restaurants/search/findByCity?name={city}
		 http://localhost:8888/restaurants/search/findByCategory?category={categoryName}
		 http://localhost:8888/restaurants/search/findByNameAndCityAndCategory?name={name}&city={city}&category={category}
		 http://localhost:8888/restaurants/search/findByNameAndCity?name={name}&city={city}
		 http://localhost:8888/restaurants/search/findByCityAndCategory?city={city}&category={category}
		 http://localhost:8888/restaurants/search/findByNameAndCategory?name={name}&category={category}
	HTTP Method: GET
	
8. 
	DESCRIPTION: Provide rating to Restaurant
	URLs: http://localhost:8888/rating
	HTTP Method: POST
	BODY:
		{
			"userId": 1,
    	    "restaurantId": 2,
	        "cost": 1,
    	    "food": 5,
        	"cleanliness": 5,
	        "service": 5,
    	    "comment": "Very Good"
		}

9. 
	DESCRIPTION: Update rating of Restaurant
	URLs: http://localhost:8888/rating
	HTTP Method: PUT
	BODY:
		{
	        "id": 3,
    	    "userId": 1,
        	"restaurantId": 2,
	        "date": "2017-01-01",
    	    "cost": 5,
        	"food": 5,
	        "cleanliness": 5,
    	    "service": 5,
        	"totalScore": 5,
	        "comment": "Good Good"
		 }
	Note: "id" is the id of the rating. If that id Exist then It will update the particular rating record

10. 
	DESCRIPTION: Get rating by user
	URL: http://localhost:8888/rating/user/{userid}
	HTTP Method: GET
	
11. 
	DESCRIPTION: Get rating by Restaurant
	URL: http://localhost:8888/rating/restaurant/{restaurantID}
	HTTP Method: GET
	
12. 
	DESCRIPTION: Get rating by Score
	URL: http://localhost:8888/rating/score/{totalScore}
	HTTP Method: GET
	

If you have any question please email to ppatel.it20@gmail.com

Thank you,
Parth. 