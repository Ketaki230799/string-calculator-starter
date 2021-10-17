package calculator;

class StringCalculator {

    public int add(String input) {
        return 0;
    }
    private int getSum(String[] numbers) {
        int sum = 0;
        for (String currentNumber:numbers) {
            if (stringToInt(currentNumber) > 1000) {
                continue;
            }
            sum += stringToInt(currentNumber);
        }
        return sum;
    }
    
     private int stringToInt(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative input!");
        } else {
            return num;
        }
    }


}
