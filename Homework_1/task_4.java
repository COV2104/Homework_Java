package Homework_1;

/**
 * task_4
 */
public class task_4 {

    public static void main(String[] args) {
        
        String userExpr = "5? + ?? = 76";
        System.out.println(userExpr);
        String[] expr = userExpr.split("=")[0].split(" ");
        Double result = Double.parseDouble(userExpr.split("=")[1]);
        String a = expr[0];
        char command = expr[1].charAt(0);
        String b = expr[2];
        int counter = 0;
        String testExpression;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                testExpression = a.replace("?", String.valueOf(i)) +
                        " " + command + " " +
                        b.replace("?", String.valueOf(j));
                String[] temp = testExpression.split(" ");
                int num1 = Integer.parseInt(temp[0]);
                int num2 = Integer.parseInt(temp[2]);        
                if ((num1 + num2) == result) {
                    System.out.println(testExpression + " = " + result);
                    counter++;
                }
            }
        }
        if (counter==0) System.out.println("Решений данного выражения нет");
        System.out.println();
    }
}