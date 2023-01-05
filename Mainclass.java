class Demo
{
int  a=10;
}
class Test extends Demo
{
void test(){
System.out.println("*******testing is done*********");
}
}
class Mainclass
{
public static void main(String[]args)
{
Test a1= new Test();
System.out.println(a1.a);
a1.test();
}
}
