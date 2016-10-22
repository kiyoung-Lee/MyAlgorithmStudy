/*
 * 두개의 문자열을 받았을때 기준문자열로부터 1개의 단어가 (추가/삭제/변경) 된 문자열인지의
 * 여부를 출력하는 함수를 작성하시오.
 */
 
public class CompareString {
	public boolean SameTest(String s1, String s2)
	{
		String big = s1.length() >= s2.length() ? s1 : s2;
		String small = s1.length() >= s2.length() ? s2 : s1;

		int bigCount = big.length();
		int smallCount = small.length();
		boolean isChange = false;
	    int changeIdx = 0;
		int matchCount = 0;

		for(int i = 0; i < smallCount; i++)
		{
		    changeIdx = i;
		    if(isChange)
		        changeIdx = i + 1;

		    if(big.charAt(changeIdx) == small.charAt(i))
		    {
		        matchCount ++;
		    }
		    else if((bigCount != smallCount) && (!isChange))
		    {
		        isChange = true;
		        changeIdx = i + 1;

		        if(big.charAt(changeIdx) == small.charAt(i))
		            matchCount ++;
		    }
		}

		if(bigCount > smallCount)
		    return (matchCount == smallCount);
		else if (bigCount == smallCount)
		    return (matchCount >= smallCount - 1);
		else
		    return false;
	}
}
