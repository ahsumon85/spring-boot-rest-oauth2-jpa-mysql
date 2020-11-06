package com.spring.rest;

import org.hibernate.query.criteria.internal.expression.SearchedCaseExpression.WhenClause;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ahasan.rest.controller.EmployeeController;
import com.ahasan.rest.dto.EmployeeDTO;
import com.ahasan.rest.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
class ApplicationTester {

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	EmployeeService employeeService;

	@Test
	public void contextLoads() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
//		when(employeeService.createOrUpdateEmployee(any(EmployeeDTO.class))).thenReturn(true);
	}

}
