package com.andre.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerBigDecimal {

	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("0.03");
		BigDecimal b = new BigDecimal("0.04");
		BigDecimal c = b.subtract(a);
		System.out.println(c);
		
		BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
		BigDecimal bd2 = new BigDecimal("987654321.9876543210");
		System.out.println(bd1.add(bd2));
		
		System.out.println(bd1.multiply(bd2));
		
		System.out.println(bd1.divide(new BigDecimal(2)));
		
		BigInteger bi = new BigInteger("100000000000000000");
		System.out.println(bi);

	}

}
