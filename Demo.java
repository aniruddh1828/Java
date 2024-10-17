class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

public class Demo {
    public static void main(String[] args) {
       

        Calculator calc = new Calculator();
        int result = calc.add(9, 4);
        int result1 = calc.sub(9,4);
        System.out.println(result);
        System.out.println(result1);
    }
    
}
