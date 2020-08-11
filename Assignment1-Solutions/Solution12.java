class Solution12{
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		switch(m){
			case 1: System.out.println("31");break;
			case 2: 
			      if(y%400==0)
                  	System.out.println("29");
                  else  if(y%100==0)
	    	        System.out.println("28");
                  else if(y%4==0)                    
	    		    System.out.println("29");
                  else 
	   		        System.out.println("28");
			      break;
			case 3: System.out.println("31");break;
			case 4: System.out.println("30");break;
			case 5: System.out.println("31");break;
			case 6: System.out.println("30");break;
			case 7: System.out.println("31");break;
			case 8: System.out.println("31");break;
			case 9: System.out.println("30");break;
			case 10: System.out.println("31");break;
			case 11: System.out.println("30");break;
			case 12: System.out.println("31");break;
		}
	}
}