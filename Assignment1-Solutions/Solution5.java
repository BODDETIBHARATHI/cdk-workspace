import java.util.Arrays;
class Solution5{
public static void main(String[] args){
	int sum=0;
    for( String str:args){
		sum += str.length();
	}
	System.out.println("Average length of words = "+sum/args.length);
}
}