package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguo
 */
@Entity
@Setter
@Getter
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue
    private Integer id;

    private String cityName;

    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = { "city" })
    private List<UserCity> cities=new ArrayList<>(0);
}
