package com.tesla.solution.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tesla.solution.model.User;

public class BeforeCreateUserValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return User.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("xxxxxxxx");
		errors.rejectValue("firstName", "firstName.empty");
//		errors.rejectValue("firstName", "firstName.empty");
//		User user = (User) obj;
//		if (checkFirstLastName(user.getFirstName())) {
//			errors.rejectValue("firstName", "firstName.empty");
//		}
	}

	/*private boolean checkFirstLastName(String name) {
		return (name == null || name.trim().length() == 0);
	}*/
	
/*	@Bean
	public UserValidator beforeCreateUserValidator() {
	    return new UserValidator();
	}*/

}
