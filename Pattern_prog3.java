package priti;

public class Pattern_prog3 {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            int num = i % 2;  

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                
                
                num = (num == 1) ? 0 : 1;
            }

            System.out.println();
        }
    }
}
