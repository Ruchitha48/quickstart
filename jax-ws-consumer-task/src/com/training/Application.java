package com.training;

public class Application {
public static void main(String[] args) {
	 NumberToTextService nts=new NumberToTextImplService() .getNumberToTextImplPort();
	 System.out.println("number to string: "+nts.numberToText(6));
}


}
