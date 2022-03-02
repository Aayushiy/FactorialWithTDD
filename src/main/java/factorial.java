public class factorial {
    private final int number;

    public factorial(int number){
        this.number=number;

    }
    public int calcFactorial(){
        if(number<0)
            return -1;
        if(number==0 ||number==1)
            return 1;
        else{
            int p;
            int prod=1;
            for(p=2;p<=number;p++)
                prod*=p;
            return prod;
        }
    }
}
