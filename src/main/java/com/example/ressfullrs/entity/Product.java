package com.example.ressfullrs.entity;


import com.example.ressfullrs.annocation.Table;
import lombok.*;
import com.example.ressfullrs.annocation.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", type = "VARCHAR(250)")
    private String name;
    @Column(name = "price", type = "DOUBLE")
    private Double price;
}
