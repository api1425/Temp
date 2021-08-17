import java.io.*;
class My{
  public static void main(String ars[]){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter value of n greater than 2");
    int n=Integer.parseInt(br.readLine());
    int arr[]=new int[n];
    arr[0]=0;
    arr[1]=1;
    arr[2]=1;
    
    for(int i=0;i<n;i++){
    {
      arr[i]=arr[i-1]+arr[i-2];
      System.out.print(arr[i]+" ");
    }
    
  }
}
