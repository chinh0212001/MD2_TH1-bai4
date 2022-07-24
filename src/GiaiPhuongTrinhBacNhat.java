import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Given a equation 'a*c +b =c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a!=0){//nếu a # 0
            double x = (c-b)/a;//phương trình có nghiệm duy nhất
            System.out.println("Equation pass with x = "+ x);
        }else {//a = 0
            if (b==c){//b = c phương trình có vô số nghiệm
                System.out.println("the solution is all x!");
            }else {//b # c phương trình vô nghiệm
                System.out.println("No solution !");
            }
        }
    }
}