package javaTest1.dp.linear_DP;

/**
 * a->1 b->2..z->26
 * 12->（a、b）,l
 */
public class Test3
{
	public static void main(String[] args)
	{
		System.out.println(getCount("123"));
	}

	public static int getCount(String s){
		char[] charArray = s.toCharArray();
		int dp[] = new int[100];//存着拆解的数目
		for(int i=0; i<charArray.length; i++){
			dp[i] = 0;//每次的都初始化为0
			if(i==0){
				dp[i] = charArray[i]=='0'?0:1;
			}else{
				if(charArray[i]!='0')
				{
					dp[i] += dp[i - 1]; //拿到之前的统计值
				}
				if(i>=1&&(charArray[i-1]=='1'||charArray[i-1]=='2')){
					int val = (charArray[i-1]-'0')*10+charArray[i]-'0';
					if(val<=26){
						if(i==1){
							dp[i]++;
						}else{
							dp[i]+=dp[i-2];
						}
					}
			    }
			}
		}

		return dp[s.length()-1];
	}
}
