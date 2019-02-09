package com.practice.knapsack;

public class knapsack {

	public static void main(String[] args) {
		
		int [] weight = {20,10,9,4,2,1};
		int [] value = {4000,3500,1800,400,1000,200};
		int len = value.length;
		int [] chosen = new int[len];
		int [] result = new int[len];
		int numOfIterations = (int)Math.pow(2, 6);
		int maxWeight = 20;
		int currentWeight = 0;
		int currentValue = 0;
		int maxValue = 0;
		
		for (int i = 0;i<numOfIterations;i++) {
			
			for(int j=len-1;j>=0;j--) {
				
				if(chosen[j]==1) {
					chosen[j] = 0;
				}
				else {
					chosen[j] = 1;
					break;
				}
			}
			currentValue = 0;
			currentWeight = 0;
			for (int ele=0;ele<chosen.length;ele++) {
				
				if(chosen[ele]==1) {
					currentValue += value[ele];
					currentWeight += weight[ele];
					
				}
			}
			if ((currentValue>maxValue) && (currentWeight<=maxWeight)) {
				maxValue = currentValue;
				for(int x = 0; x<chosen.length;x++) {
					result[x] = chosen[x];
				}
				
			}
		}
		
		for (int i=0; i<result.length;i++) {
			if(result[i] == 1) {
				result[i] = weight[i];
			}
		}
		System.out.println("The best combination of weights by which we get the max. value is:-");
		for(int k : result) {
			if(k != 0) {
				System.out.print(k+"kg ");
			}
		}
		System.out.println();
		System.out.println("The max. value is:"+maxValue);
		

	}

}
