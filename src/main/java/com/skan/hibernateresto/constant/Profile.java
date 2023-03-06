package com.skan.hibernateresto.constant;

public enum Profile {
	ADMIN, USER;
	
	public static Profile findByName(String name) {
	    for (Profile profile : values()) {
	        if (profile.name().equalsIgnoreCase(name)) {
	            return profile;
	        }
	    }
	    return null;
	}
	
	public static Profile convertFromString(String value) {
		Profile data = null;
		System.out.println("Profile before try/catch is " + data);
		try {
			 data = Profile.valueOf(value.toUpperCase());
			 System.out.println("Profile into try is " + data);
		} catch(Exception e) {
			System.out.println("Exception catched on Profile enum, check followed message : " + e.getMessage());
		}
		return data;
	}
}
