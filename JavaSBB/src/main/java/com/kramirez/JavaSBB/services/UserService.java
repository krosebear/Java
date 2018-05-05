package com.kramirez.JavaSBB.services;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.kramirez.JavaSBB.models.User;
import com.kramirez.JavaSBB.repositories.UserRepo;


@Service
public class UserService {
	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	public String createUser(User user, String cpass, HttpSession session) {
		if(!user.getPassword().equals(cpass)) {
			return "Passwords Don't Match!";
		}
		if(userRepo.findByEmail(user.getEmail()) == null) {
			user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(10)));
			userRepo.save(user);
			session.setAttribute("user_id", user.getId());
			return "User Successfully Created!";
		}else {
			return "User Already Exists!";
		}
	}
	public Boolean login(String email, String password, HttpSession httpSession) {
		User user = userRepo.findByEmail(email);
		if(user != null) {
			if(BCrypt.checkpw(password, user.getPassword())) {
			httpSession.setAttribute("user_id", user.getId());
			return true;
		}else {
			return false;
		}
	}
		return false;
	}

	public User findUser(Long id) {
		System.out.println(userRepo.findById(id));
		return userRepo.findById(id);
	}
	
}

