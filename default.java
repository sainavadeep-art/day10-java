class a{
    int c;
    String b;
    a()
    {
        this.c=345;
        this.b="Hello World";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
class Main{
    public static void main(String args[]){
        a s= new a();
        s.display();}
}