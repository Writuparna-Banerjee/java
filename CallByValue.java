class Test{
     void math (int i, int j)
        {
            int a,b;
            a=i*2;
            b=j/2;
            System.out.println("a and b after call" +a +b);
           
        }
 }
 class CallByValue
 {
    public static void main(String []args){
        Test ob = new Test();
        int a=15;
        int b=20;
        System.out.println("a and b before call" +a  +b );
        ob.math(15,20);
       
     }
}