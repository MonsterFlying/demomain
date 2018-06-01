package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String userName;

    private Integer age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)

    @JsonIgnoreProperties(value = { "user" })
    private List<UserCity> cities=new ArrayList<>(0);

}
