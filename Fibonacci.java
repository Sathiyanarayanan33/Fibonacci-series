//print the values 1  2  3  4  5  6  7  8  9  10
class Fibonacci{
 public static void main(String ar [])
{
  Fibonacci obj=new Fibonacci();
  obj.fibo();
}
 public void fibo()
	{
	  int n=10;
	  int sum=0;
	  int first=0;
	  int second=10;
	  for(int i=1;i<=n;i++)
	  {
	  System.out.println(second);
	   sum=second-first;
	   first=second;
	   second=sum+first;	   
	  }
 }  

}
