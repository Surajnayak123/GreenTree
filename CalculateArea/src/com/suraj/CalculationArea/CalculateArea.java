package com.suraj.CalculationArea;

public class CalculateArea {
	double result;
	public double area(double radius) {
		if(radius > 0) {
			result = 3.14 * radius * radius; 
			return result;
		}else {
			
			System.out.print("Invalid Value : ");
			return radius;
		}
		
	}
	public double area(double length , double width) {
		if((length > 0 )&&(width > 0) ) {
			result =  length * width; 
			return result;
		}else if((length < 0) && (width < 0)){
			result = length * width;
			return result;
			
		}else {
			if(length < 0) {
				System.out.print("Invalid Value : length ");
				return length;
			}else {
				System.out.print("Invalid Value : width ");
				return width;
			}
		}
		
	}
	

}
