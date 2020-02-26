package com.zhongxia.dynamic;

import java.util.Arrays;

public class FindContentChildren455 {
	//gÎ¸¿Ú£¬s±ý¸É
	 public static int findContentChildren(int[] g, int[] s) {
	     Arrays.sort(g);
	     Arrays.sort(s);
	     int child=0;
	     int biscuit=0;
		 while(child<g.length&&biscuit<s.length)
		 {
			if(g[child]<=s[biscuit])
			{
				child++;
				biscuit++;
			}
			else
			{
				biscuit++;
			}
		 }
		 return child;
	    }

	public static void main(String[] args) {
		int[] g= {1,2};
		int[] s= {1,2,3};
		System.out.println(findContentChildren(g, s));

	}

}
