// while & for loop print the values 1  2  3  4  5  6  7  8  9  10
class Fibonacci_1{
 public static void main(String ar [])
{
  Fibonacci_1 obj=new Fibonacci_1();
  obj.add();
  obj.add_1();
} 

public void add()
 {
   int n=7;
   int f=0;
   int s=1;
   int sum=0;
for (int i=0; i<=n; i++){
//System.out.print(sum);   
    sum=f+s;
    f=s;
    s=sum;
}
System.out.println(sum);
}

public void add_1()
 {
  int n=7;
  int i=0;
  int f=0;
  int s=1;
  int sum=0;
while(i<=n){
  sum=f+s;
  f=s;
  s=sum;
   i++;
  }
System.out.println(sum);
 }
}

