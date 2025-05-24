package Others;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(8);
        pattern2(8);

//        System.out.println("* * * * *");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("* * * * *");
//        System.out.println("        *");
//        System.out.println("        *");
//        System.out.println("        *");
//        System.out.println("        *");
//        System.out.println("* * * * *");
//        System.out.println();
//        System.out.println();
//
//        System.out.println("*          *");
//        System.out.println("*        *");
//        System.out.println("*     *   ");
//        System.out.println("*  *      ");
//        System.out.println("**        ");
//        System.out.println("*  *     ");
//        System.out.println("*     *   ");
//        System.out.println("*        *");
//        System.out.println("*           *");



    }

    private static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int k=0;k<i-1;k++){
                System.out.print("  ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
