import java.util.Arrays;
import java.util.Comparator;


// ������ �����迭�� ���ο��� �����Ҽ� �ִ� ���� ū ���� ���� ����ϱ�.
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
