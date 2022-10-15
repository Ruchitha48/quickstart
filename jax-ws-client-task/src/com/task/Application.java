package com.task;

public class Application {
public static void main(String[]args) {
	CalculatorSoap calc=new Calculator().getCalculatorSoap();
    
    System.out.println("addResult "+calc.add(12, 12));
    System.out.println("divi "+calc.divide(12, 3));
    System.out.println("mul" +calc.multiply(2, 3));
    System.out.println("sub"+calc.subtract(5, 3));
    
	
}
}
