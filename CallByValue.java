class Test{
     void math (int i, int j)
        {
            
            i=i*2;
            j=j/2;
           
        }
 }
 class CallByValue
 {
    public static void main(String []args){
        Test ob = new Test();
        int a=15;
        int b=20;
        System.out.println("a and b before call" +a  +b );
        ob.math(a,b);
       	System.out.println("a and b after call" +a +b);
           
     }
}