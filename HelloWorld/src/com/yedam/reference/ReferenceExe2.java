package com.yedam.reference;

public class ReferenceExe2 {
	public static void main(String[] args) {
		
		String[][] scores = {
				{"홍길동", "80"}, 
				{"김민수", "85"}, 
				{"박헌수", "88"}, 
				{"심상헌", "90"}, 
				{"최기동", "75"}
		}; 
		
		int sum = 0;
		int max = 0;
		String maxSt = "";
		for(int i = 0; i < scores.length; i++) {
			System.out.println("점수-> " + scores[i][1]);
			}
		for(int i = 0; i < scores.length; i++) {
			sum += Integer.parseInt(scores[i][1]);
		}
		System.out.println("합은"+sum);
		for(int i = 0; i < scores.length; i++) {
			if(max < Integer.parseInt(scores[i][1])) {
				max = Integer.parseInt(scores[i][1]);
				maxSt =scores[i][0];
			}
		
		}
		System.out.println("최고점은 " + max);
		System.out.printf("최고점인 학생은 "+maxSt);
		
	}
}
