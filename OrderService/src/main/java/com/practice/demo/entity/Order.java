package com.practice.demo.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name ="Order_details")
@ToString
public class Order {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="PRODUCT_ID")
	private long productId;
	@Column(name="QUANTITY")
	private long quantity;
	@Column(name="ORDER_DATE")
	private Instant orderdate;
	@Column(name="STATUS")
	private String orderStatus;
	@Column(name="AMOUNT")
	private long amount;
	
	
	
}
