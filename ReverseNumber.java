public class ReverseNumber{
    int Revnum(int number){
       return(reversedHelper(number,0));
    }
    int reversedHelper(int number,int acc){

        if (number ==0){
            return acc;
        }
        int digit= number%10;
        int newAcc= acc*10+digit;
        return reversedHelper(number/10,newAcc);
    }

    public void main(String[] args){
        System.out.println(Revnum(12000));
    }

}