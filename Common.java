class Common{  //1,2,3,4,5,6,?
 public static void main(String ar [])
  {
    Common obj=new Common();
    obj.add();

}
 public void add()
 {
  int n=5;
  int first=1;
  int second=2;
  int sum=0;
for(int i=2; i<=n; i++){

  sum=second-first;
   first=second;
    second=(sum+first)+2;

  }//for
System.out.println(first);
 }//method
}
