package com.example.form.controller;

import com.example.form.model.UserDetails;
import com.example.form.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserDetailsController {
  private final UserRepository userDetailsRepository;

  public UserDetailsController(UserRepository userDetailsRepository) {
    this.userDetailsRepository = userDetailsRepository;
  }

  @PostMapping("/insertUserDetails")
  public void insertUserDetails(@RequestBody UserDetails userDetails) throws IllegalStateException {
    UserDetails savedUserDetails = userDetailsRepository.save(userDetails);
  }

  @GetMapping("/user/getAll")
  public List<UserDetails> getAll() {
    return userDetailsRepository.findAll();
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<UserDetails> getById(@PathVariable Long id) {
    Optional<UserDetails> data = userDetailsRepository.findById(id);
    return ResponseEntity.of(data);
  }
}
