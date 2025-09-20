import java.util.Scanner;
 class check {
    public String is_prime(int num){
        boolean is_prime=true;
        if(num<2){
            is_prime = false;
        }
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
               is_prime=false;
               break;
            }
        }
      String result= is_prime ? "prime":"not prime";
      return result;
    }
}
public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int n = sp.nextInt();
        check prime = new check();
        String result = prime.is_prime(n);
        System.out.println(result);
        sp.close();
    }
}

