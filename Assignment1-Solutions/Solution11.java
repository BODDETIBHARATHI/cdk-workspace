class Solution11{
	public static void main(String[] args){
		int dc=0,charc=0;
			for(String str:args){
				System.out.println("str = "+str);
				char[] ch = str.toCharArray();
				for(int j=0;j<str.length();j++){
				if(Character.isDigit(ch[j]))
				{
					System.out.println("digit "+ch[j]);
					dc++;
				}
				if(Character.isLetter(ch[j]))
				{
					System.out.println(ch[j]);
					charc++;
				}
				}
			}
		System.out.println("Number of digits are "+dc+" and number of characters are "+charc);
	}
}