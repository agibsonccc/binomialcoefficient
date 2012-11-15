package com.ccc.dynamicprogramming;

import java.util.Arrays;

public class BinomialCoefficient {

	
	
	public static void main(String[] args) {
		binomial(10,2);
	}
	
	
	public static void binomial(int N,int K) {

        long[][] binomial = new long[N+1][K+1];

        // base cases
        for (int k = 1; k <= K; k++) binomial[0][k] = 0;
        for (int n = 0; n <= N; n++) binomial[n][0] = 1;

        // bottom-up dynamic programming
        for (int n = 1; n <= N; n++)
            for (int k = 1; k <= K; k++)
                binomial[n][k] = binomial[n-1][k-1] + binomial[n-1][k];
        StringBuffer sb = new StringBuffer();
        sb.append("n\\k");
        for(int i=0;i<N;i++)
        	 sb.append(" " + i + " ");
        sb.append("=========================\n");
        for(int j=0;j<N;j++) {
        	sb.append(" " + j + " ");
        	for(int k=0;k<K;k++) {
        		sb.append(" " + binomial[j][k] + " ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
	
}
