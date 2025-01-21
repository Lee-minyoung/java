package com.yedam;

public class Variable2 {
	public static void main(String[] args) {
		for(int j=1; j<=9; j++) {
			for(int i=1; i<=6; i++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
				//System.out.printf("%d * %d = %2d  ", i, j, i*j);
			}
		System.out.println();
		}
	}
}
