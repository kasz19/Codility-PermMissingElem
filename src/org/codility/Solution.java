package org.codility;

import java.util.Arrays;

public class Solution
{

public int solution(int[] A) {
	
	if(A.length < 1){
		 return 1;
	}
	else if(A.length == 1){
		if(A[0] == 1){
			return 2;
		}
		else return 1;
	}
    
    Arrays.sort(A);
    
    for(int i = 0; i < A.length - 1; i++){
    	if(i == 0 && A[i] != 1){
    		return 1;
    	}
    	int b = A[i];
    	int c = A[i + 1];
    	if(c - b > 1){
    		return b + 1;
    	}
    }
    
    return A[A.length - 1] + 1;
}

}
