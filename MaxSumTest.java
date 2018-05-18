class MaxSumTest{
public static void findMaxSumSequence (int inputArray[])
{
    if (inputArray == null || inputArray.length == 0)
        throw new IllegalArgumentException("Array is empty");
 
    int size = inputArray.length;
 
    int maxSum = inputArray[0];
    int maxStartIndex = 0;
    int maxEndIndex = 0;
 
    int curSum = inputArray[0];
    int curStartIndex = 0;
 
 
    for (int i = 1; i < size; i++)
    {
        if (curSum < 0)
        {
            curSum = 0;
            curStartIndex = i;
        }
 
        curSum = curSum + inputArray[i];
 
        if (curSum > maxSum)
        {
            maxSum = curSum;
            maxStartIndex = curStartIndex;
            maxEndIndex = i;
        }
    } 
  
    //System.out.print(inputArray[i+maxStartIndex]+ " ");
System.out.println("start index is : ' maxStartIndex);
System.out.println("end index is : ' maxEndIndex);
System.out.println("sum is = " + maxSum);


}



public static void main(String args[])
{
int a[]={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};

findMaxSumSequence(a);
}
}
