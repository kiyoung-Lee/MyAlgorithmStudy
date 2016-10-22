/*
 * �ΰ��� ���ڿ��� �޾����� ���ع��ڿ��κ��� 1���� �ܾ (�߰�/����/����) �� ���ڿ�������
 * ���θ� ����ϴ� �Լ��� �ۼ��Ͻÿ�.
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
