package Exercise_2;

public class Calculator {
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }
    @Override
    public void multiply(double a, double b){
        System.out.println(a*b);
    }
}
