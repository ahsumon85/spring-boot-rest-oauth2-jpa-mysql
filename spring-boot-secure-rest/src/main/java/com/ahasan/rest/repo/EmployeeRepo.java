package com.ahasan.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahasan.rest.entity.EmployeeEntity;

/**
 *
 * @author Ahasan Habib
 * @since 03 06 20
 */

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

	public EmployeeEntity findByEmployeeId(Long empId);

}
