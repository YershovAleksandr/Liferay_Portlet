package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class State {
	private static Logger log = LoggerFactory.getLogger(State.class);	
	
	private static State instance = null;
	
	private boolean defaultState;
	
	private String orderByType;
	private String orderByCol;
	//private String 
	
	private State() {}
	
	public static State getInstance() {
		if(instance == null) {
			instance = new State();
			
			log.info("State()");
		}
		
		return instance;
	}

	public boolean isDefaultState() {
		return defaultState;
	}

	public void setDefaultState(boolean defaultState) {
		this.defaultState = defaultState;
		
		if (defaultState) {
			orderByType = null;
			orderByCol = null;
		}
	}
	
	public String getOrderByType() {
		return orderByType;
	}

	public void setOrderByType(String orderByType) {
		this.orderByType = orderByType;
	}

	public String getOrderByCol() {
		return orderByCol;
	}

	public void setOrderByCol(String orderByCol) {
		this.orderByCol = orderByCol;
	}

	@Override
	public String toString() {
		return "State [defaultState=" + defaultState + ", orderByType=" + orderByType + ", orderByCol=" + orderByCol
				+ "]";
	}
	
	//TODO WTF???
	public void reset() {
		setDefaultState(true);
		orderByType = null;
		orderByCol = null;

		log.info("Reset {}", toString());
	}
	
	public void reset2() {
		setDefaultState(true);
		orderByType = null;
		orderByCol = null;

		log.info("Reset2 {}", toString());
	}
	
	
}
