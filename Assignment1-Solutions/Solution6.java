import java.util.Scanner;
class Solution6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and cols of 2D array");
		int rc = sc.nextInt();
		int[][] arr = new int[rc][rc];
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<rc;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<rc;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Total number of elements are "+arr.length*arr.length);
		for(int i=0;i<rc;i++){
		System.out.println("Number of elements at "+i+" row are "+arr[i].length);
		}
	}
}