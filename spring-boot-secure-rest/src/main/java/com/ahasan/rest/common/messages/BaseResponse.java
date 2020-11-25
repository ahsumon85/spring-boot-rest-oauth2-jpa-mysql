/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahasan.rest.common.messages;

public class BaseResponse {

	private String message;

	public BaseResponse(String message) {
		this.message = message;
	}

	BaseResponse() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
