import java.util.Arrays;
import java.util.Comparator;


// 임의의 정수배열중 내부에서 조합할수 있는 가장 큰 수의 조합 출력하기.
public class MaxNumber {
	
	public String GetMaxNum(int[] arry)
	{
		String[] strArray = new String[arry.length];
		for(int i = 0; i< arry.length; i++)
		{
			strArray[i] = String.valueOf(arry[i]);			
		}
		
		Arrays.sort(strArray, new Comparator<String>() 
		{
			@Override
			public int compare(String a, String b) 
			{
				return (b+a).compareTo(a+b);
			}			
		});
		
		StringBuilder sb = new StringBuilder();
		for(String s : strArray)
		{
			sb.append(s);
		}
		
		return sb.toString();
	}

}
