package com.ahasan.rest.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahasan.rest.entity.User;

/**
*
* @author Ahasan Habib
* @since 03 06 20
*/

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);

	boolean existsByUsername(String name);

}
