class encap
{
private int rollno;
private String name;
public void setrollno(int rollno)
{
this.rollno=rollno;
}
public void setname(String name)
{
this.name=name;
}
public int getrollno()
{
return rollno;
}
public String getname()
{
return name;
}
public static void main(String[]args)
{
encap e=new encap();
e.setrollno(45);
e.setname("suji");
System.out.println(e.getrollno());
System.out.println(e.getname());
}
}
