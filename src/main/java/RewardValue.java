// Time to make your change - add a new class named RewardValue to the main.java package. Right-click on a directory in the project tab on the left, then highlight new to create a Java Class.
// This class must satisfy the following requirements:
// RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.

import java.lang.Math; 

public class RewardValue
{
    private int miles;
    private double cash;

    RewardValue(double cashValue)
    {
        cash=cashValue;
        miles= (int)Math.round(cashValue/0.0035);
    }
    RewardValue(int miles)
    {
        this.miles=miles;
        cash=miles*0.0035;
    }

    double getCashValue()
    {
        return cash;
    }

    int getMilesValue()
    {
        return miles;
    }
}