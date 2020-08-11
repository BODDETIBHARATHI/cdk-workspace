class Solution8{
	public static void main(String[] args){
		float f1 = Float.parseFloat(args[0]);
		float f2 = Float.parseFloat(args[2]);
		String ch = args[1];
		switch(ch){
			case "+" : System.out.println(f1 + f2);break;
			case "-" : System.out.println(f1 - f2);break;
			case "*" : System.out.println(f1 * f2);break;
			case "/" : System.out.println(f1 / f2);break;
			case "%" : System.out.println(f1 % f2);break;
		}
		System.out.println(f1 + ch + f2);
	}
}