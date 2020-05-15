package Application;

public class Test {
    public float calculate(float n1, float n2, String opr) {
        switch (opr){
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2==0) {
                    return 0;
                } else {
                    return n1 / n2;
                }

            default:
                return 0;
        }
    }

}
