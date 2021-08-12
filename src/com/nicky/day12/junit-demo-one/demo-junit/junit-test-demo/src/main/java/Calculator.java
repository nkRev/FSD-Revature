public class Calculator {
    public int addNumber(int a, int b) {
        return a + b;
    }

    public int getMax(int[] myArr) {
        int max = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (max < myArr[i]) {
                max = myArr[i];
            }
        }
        return max;
    }

    public double getCube(int number) {
        return Math.pow(number, 3);
    }

    public int multiplyTwoNum(int a , int b){
        return a*b;
    }
}
