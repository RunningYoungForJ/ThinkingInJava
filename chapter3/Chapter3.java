public class Chapter3{
  public static void main(String args[]){
    Integer n1=new Integer(50);
    Integer n2=new Integer(50);
    System.out.println(n1==n2);
    System.out.println(n1!=n2);
    System.out.println(n1.equals(n2));
    Value v1=new Value();
    Value v2=new Value();
    v1.i=v2.i=100;
    System.out.println(v1.equals(v2));
    int a=4<<34;
    int b=4<<2;
    System.out.println(a==b);
  }
}

class Value{
  int i;
  public boolean equals(Value v){
    if(this.i==v.i){
      return true;
    }
    return false;
  }
}