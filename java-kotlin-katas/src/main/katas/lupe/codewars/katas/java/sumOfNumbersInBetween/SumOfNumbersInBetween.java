package lupe.codewars.katas.java.sumOfNumbersInBetween;

public class SumOfNumbersInBetween {

    // Given two integers a and b, which can be positive or negative,
    // find the sum of all the integers between and including them and return it.
    // If the two numbers are equal return a or b.
    // Note: a and b are not ordered!

    public int getSum(int a, int b) {
        if(a < b) {
            return sum(a, b);
        } else if (b < a) {
            return sum(b, a);
        }
        return a;
    }

    private int sum(int smallest, int biggest) {
        int result = 0;
        while(smallest <= biggest) {
            result += smallest;
            smallest += 1;
        }
        return result;
    }
}


// BEST PRACTICE SOLUTION from Codewars //

/*
  public int GetSum(int a, int b) {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
*/
