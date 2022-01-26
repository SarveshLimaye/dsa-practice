//leetcode q - https://leetcode.com/problems/happy-number/

public class HappyNumbers {

    public static void main(String[] args) {
        System.out.println(isHappy(15));
    }
    public static boolean isHappy(int n) {
        int fast = n;
        int slow =n;

        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));

        }while(slow != fast);{
            if(slow == 1){
                return true;
            }

            return false;
        }

    }

    public static int findsquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem*rem;
            number = number/10;
        }
        return ans;
    }
}
