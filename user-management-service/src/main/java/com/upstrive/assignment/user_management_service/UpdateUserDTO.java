package com.upstrive.assignment.user_management_service;

import java.util.Set;

public record UpdateUserDTO(
	    String username,
	    String password,
	    String name,
	    String phoneNumber,
	    String email,
	    Set<String> roles
	) {
	}
