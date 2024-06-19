package com.interviewPrep.leetcode.easy.containsduplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SecondApproach {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};

		SecondApproach sa = new SecondApproach();
		boolean flag = sa.containsDuplicate(nums);
		
		System.out.println(flag);
	}
	
	
	public boolean containsDuplicate(int[] nums) {
		
		
		boolean flag = false;
		
		// initialize a HashSet
		Set numsSet = new HashSet<>();
		
		// insert the array integers in it
		for(int i=0; i<nums.length; i++) {
			
			// check if integer already exists in Hashset
			if(!numsSet.contains(nums[i]   ) ) {
				
				numsSet.add(nums[i]);
			}
			else {
				
				// if it exists then return with true
				flag = true;
				return flag;
			}
			
		}
		
		return flag;
	
	}

	
}
