package com.example.demo.entity;
import lombok.AccessLevel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="product_sep_2022")
public class Product {
@Id	
int id;
@Column(name="product_name",length=40)
String productName;
@Column(name="rate_per_unit")
double ratePerUnit;

}
