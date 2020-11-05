package com.hcl.service;

public class EquationService {

	public Integer evaluateEquation(int a, int b) {
		// (a+b)+c+((max(a,b)*2 +(c+2))
		Integer c = 0;
		Integer result = 0;
		if ((a + b) > (a * b)) {
			c = a + b;
		} else {
			c = a * b;
		}
		result = a + b + c + ((Math.max(a, b) * 2) + (c + 2)); 
		System.out.println("The result of equation having "+a+" and "+b+" is "+result);
		return result;
	};

}
