package com.skan.hibernateresto.constant;


public enum Unit {
	SEC, MIN, HOUR;
	
	public static Unit findByName(String name) {
	    for (Unit unit : values()) {
	        if (unit.name().equalsIgnoreCase(name)) {
	            return unit;
	        }
	    }
	    return null;
	}
	
	public static Unit convertFromString(String value) {
		Unit data = null;
		System.out.println("Unit before try/catch is " + data);
		try {
			 data = Unit.valueOf(value.toUpperCase());
			 System.out.println("Unit into try is " + data);
		} catch(Exception e) {
			System.out.println("Exception catched on Unit enum, check followed message : " + e.getMessage());
		}
		return data;
	}
}
