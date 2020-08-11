class Solution7{
public static void main(String[] args){
	float[] f1 = {11.1f, 22.2f, 33.3f};
float[] f2 = {12.1f, 13.1f, 14.3f};
for(int i=0;i<f1.length;i++)
System.out.println("float values of f1 = "+f1[i]);
for(int i=0;i<f2.length;i++)
System.out.println("float values of f2 before update = "+f2[i]);
for(int i=0;i<f1.length;i++){
	f2[i] = f1[i];
}	
for(int i=0;i<f2.length;i++)
System.out.println("f2 values after update = "+f2[i]);
}
}