package com.ahasan.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahasan.rest.common.exceptions.RecordNotFoundException;
import com.ahasan.rest.entity.User;
import com.ahasan.rest.repo.UserDetailRepository;

/**
 *
 * @author Ahasan Habib
 * @since 03 06 20
 */

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDetailRepository userRepository;

	public User findUserByName(String name) {
		Optional<User> users = userRepository.findByUsername(name);
		return users.orElseThrow(() -> new RecordNotFoundException("No record found for given user name: " + name));
	}

	public List<User> findAllActiveUsers() {
		return userRepository.findAll();
	}

	public User findActiveUserInfo(int userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new RecordNotFoundException("No record found for given user name: " + userId));
	}

}
