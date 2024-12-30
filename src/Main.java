public class Main {
    public static void main(String[] args) {
        int n =19;
        int limit = 100;
        boolean isHappy = false;
        for(int i =0; i<limit; i++){
            int sum = 0;
            while (n>0){
                int digit = n%10;
                sum += digit*digit;
                n/=10;
            }
            n=sum;
            if(n==1){
            isHappy = true;
            break;
            }
        }
        if(isHappy){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
