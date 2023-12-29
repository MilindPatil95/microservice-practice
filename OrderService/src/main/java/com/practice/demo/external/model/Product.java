package com.practice.demo.external.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product{
	private long productId;
	private String productName;
	private long price;
	private long quantity;

}
