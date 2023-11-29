//single inheritance :

 class A 
{
    int p=100;
    int t=2;
    void display()
    {
        System.out.println("p="+p);
        System.out.println("t="+t);
    }
}
class B extends A
{
    int r=2;

    int si;
    void interest()
    {
        si=(p*t*r)/100;
        System.out.println("si="+si);
    }
}
class AB
 {
    public static void main(String[] args)
 {
        B b = new B();
        b.display();
        b.interest();

    }
}

