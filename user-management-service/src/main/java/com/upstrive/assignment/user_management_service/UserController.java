package com.upstrive.assignment.user_management_service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest createUserDTO) {
        // Logic to create a new user
        // Convert CreateUserDTO to User entity and save it
        UserDTO createdUser = new UserDTO(/* parameters */);
        return ResponseEntity.ok(createdUser); // Return the created user
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        // Logic to retrieve user by id
        UserDTO retrievedUser = new UserDTO(/* parameters */);
        return ResponseEntity.ok(retrievedUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UpdateUserDTO updateUserDTO) {
        // Logic to update user
        UserDTO updatedUser = new UserDTO(/* parameters */);
        return ResponseEntity.ok(updatedUser); // Return the updated user
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        // Logic to delete user
        return ResponseEntity.noContent().build();
    }
}