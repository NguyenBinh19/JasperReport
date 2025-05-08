package com.jasperLe.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "firstname")
    String firstname;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "street")
    String street;
    @Column(name = "city")
    String city;
}
