public class Nto0 {
    public static void main(String[] args) {
      System.out.println(sum(5));
      sumReverse(5);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
       return sum(n-1);
    }

    static void sumReverse(int n){
        if (n == 0) {
            return ;
        }
        sum(n-1);
        System.out.println(n);
    }
}

