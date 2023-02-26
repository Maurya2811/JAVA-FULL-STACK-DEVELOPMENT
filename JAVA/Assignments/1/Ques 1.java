class Calsi {
  public static void main(String[] Rahul) {
    if (Rahul.length != 3) {
      System.out.println("Please Enter in a Valid Format: 'Num1'_'Operator'_'Num2'   ");
      return;
    }

    int num1 = Integer.parseInt(Rahul[0]);
    int num2 = Integer.parseInt(Rahul[2]);

    char operator = Rahul[1].charAt(0);

    int result;

    if (operator == '+')
      result = num1 + num2;
    else if (operator == '-')
      result = num1 - num2;
    else if (operator == '*')
      result = num1 * num2;
    else if (operator == '/')
      result = num1 / num2;
    else {
      System.out.println("Error: Invalid operator");
      return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
