class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; // to track the number of $5 bills
        int ten = 0;  // to track the number of $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                five++;  // simply collect the $5 bill
            } else if (bill == 10) {
                if (five > 0) {  // need to give one $5 as change
                    five--;
                    ten++;
                } else {
                    return false; // no $5 bill to give change
                }
            } else {  // when the bill is $20
                if (ten > 0 && five > 0) {  // prefer to give one $10 and one $5 as change
                    ten--;
                    five--;
                } else if (five >= 3) {  // otherwise, give three $5 bills as change
                    five -= 3;
                } else {
                    return false; // not enough bills to give change
                }
            }
        }
        return true;  // all customers were able to get the correct change
    }
}
