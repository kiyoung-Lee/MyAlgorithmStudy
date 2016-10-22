/*
 * 두개의 문자열을 받았을때 기준문자열로부터 1개의 단어가 (추가/삭제/변경) 된 문자열인지의
 * 여부를 출력하는 함수를 작성하시오.
 */
 
public class CompareString {
	public boolean SameTest(String s1, String s2)
	{
		String big = s1.length() > s2.length() ? s1 : s2;
		String small = s1.length() < s2.length() ? s1 : s2;
		
		int originCount = big.length();
		int changeCount = 0;
		
		String[] splitArray = small.split("");
		
		for(int i = 0; i < splitArray.length; i++)
		{
			if(big.contains(splitArray[i]))
				changeCount ++;
		}
		
		if(Math.abs(originCount - changeCount) == 1)
			return true;
		else
			return false;
	}
}
