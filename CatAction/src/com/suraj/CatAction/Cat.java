package com.suraj.CatAction;

public class Cat {
	public boolean isCatPlaying(boolean summer , int temperature) {
		if(temperature >= 25 && temperature <= 35 ) {
			return true;
		}else if(summer) {
			if(temperature >= 25  && temperature <= 45) {
				return true;
			}else {
				return false ;
			}
		
		}else {
			return false;
		}
	}
}
