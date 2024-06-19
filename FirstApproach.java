package com.interviewPrep.leetcode.easy.containsduplicate;

public class FirstApproach {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		
		FirstApproach fa = new FirstApproach();
		boolean flag = fa.containsDuplicate(nums);
		
		System.out.println(flag);
	}

	public boolean containsDuplicate(int[] nums) {
		
		boolean flag = false;
		
		// iterate the array for each integer
		for(int i=0; i<nums.length-1; i++) {
			
			int curNum = nums[i];
			
			// check if it occurs again
			for(int j=i+1; j<nums.length; j++) {
				
				// if yes then set the flag to true and return
				if(curNum == nums[j]) {
					
					flag = true;
					return flag;
				}
			}
		}
		
		// else return false
		return flag;
	}
}
