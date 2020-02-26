package com.zhongxia.dynamic;

/**

* @author 作者 : 仲夏

* @version 创建时间：2020年2月1日 下午4:50:22 

*/
public class CoinChange322 {
	

	 public static int coinChange(int[] coins, int amount) {
      int[] dp=new int[amount+1];
      for(int i=0;i<=amount;i++)
      {
    	  dp[i]=-1;
      }
      dp[0]=0;
      for(int i=1;i<=amount;i++)
      {
    	  
    	  for(int j=0;j<coins.length;j++)
    	  {
    		  if(i-coins[j]>=0&&dp[i-coins[j]]!=-1)
    		  {
    			  if(dp[i]==-1||dp[i]>dp[i-coins[j]]+1)
    			  {
    				  dp[i]=dp[i-coins[j]]+1;
    			  }
    		  }
    	  }
      }
		 
	return dp[amount];	 
		 }

	public static void main(String[] args) {
		
     int amount=6249;
     int[] coins= {186,419,83,408};
     System.out.println(coinChange(coins,amount));
	}

}
