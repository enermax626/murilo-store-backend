package com.murilo.project.projetomurilo.domain;

public enum OrderStatus {

	    INCOMPLETE(0), DELIVERY(1), DONE(2);

	    private Integer code;

	    private OrderStatus(Integer code) {
	        this.code = code;
	    }

	    public Integer getCode() {
	        return code;
	    }
	
}
