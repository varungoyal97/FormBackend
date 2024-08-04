package com.example.form.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
@Entity
public class UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long tokenNumber;
  private String name;
  private String fatherName;
  private String designation;
  private String address;
  private String category;
  private String vehicleNumber;
  private String contactNumber;
}
