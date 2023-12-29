package com.practice.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class OrderRequest {
	
	private long productId;
	private long totalAmount;
	private long quantity;
	private PaymentMode paymentMode;

}
