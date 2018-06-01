package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "user_city")
public class UserCity {

    @Id
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = City.class)
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

}