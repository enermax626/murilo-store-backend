package com.murilo.project.projetomurilo.domain;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class OrderStatusConverter implements AttributeConverter<OrderStatus, Integer> {

	@Override
	public Integer convertToDatabaseColumn(OrderStatus orderStatus) {
		if(orderStatus == null)
			return null;
		return orderStatus.getCode();
	}

	@Override
	public OrderStatus convertToEntityAttribute(Integer orderStatus) {
		if(orderStatus == null)
			return null;
		
		return Stream.of(OrderStatus.values())
				.filter(p -> p.equals(orderStatus))
				.findFirst()
				.orElseThrow(IllegalArgumentException::new);
		
		
		
	}

}
