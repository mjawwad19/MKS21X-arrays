public class ArrayDemo {
//0a. Make a function to print a 1D array of ints.
  public static void printArray(int[]ary){
    String arry = "";
    for (int i = 0; i < ary.length; i++){
      if (i != ary.length - 1) {
        arry += ary[i] + ", ";
      }
      else {arry += ary[i];};
    }
    System.out.print("["+arry + "]");
  }
// 0b. Make a function to print a 2d array of ints.
  public static void printArray(int[][]ary){
    String arry = "";
    int row;
    int column;
    for (row = 0; row < ary.length; row++){
      for (column = 0; column < ary[row].length; column ++) {
        if (column == 0) {arry += "[";}
        if (column != ary[row].length - 1) {arry += ary[row][column] + ", ";}
        else {arry += ary[row][column] + "]";}
      }
        if (row != ary.length - 1) {arry += ", ";}
        else {arry += "]";}
      }
    System.out.print(arry);
  }
//1. Calculate and return how many zeros are in the parameter
//(a rectangular 2D array of integers)
public static int countZeros2D(int[][] nums){
  int count = 0;
  for (int row = 0; row < nums.length; row++){
    for (int column = 0; column < nums[row].length; column ++) {
      if (nums[row][column] == 0) {count ++;}
    }
  }
  return count;
}
/*2a. Modify a given 2D array of integer as follows:
Fill the of integers with 1's
EXCEPT when the row number is the same as the column number:

you must fill those with 3's instead.
*/
public static void fill2D(int[][] vals){
  for (int row = 0; row < vals.length; row++){
    for (int column = 0; column < vals[row].length; column ++) {
      if (row == column) {vals[row][column] = 3;}
      else {vals[row][column] = 1;}
    }
  }
  printArray(vals);
}
/*2b. Make a new 2d array the same dimensions as the given parameter.
Fill that array with with 1's, except where the value of the original array is negative:
you must fill those with 3's instead.

//You may NOT modify the parameter vals.
*/
public static int[][] fill2DCopy(int[][] vals){
  int[][] valsCopy = new int[vals.length][vals[vals.length -1].length];
  for (int row = 0; row < vals.length; row++){
    for (int column = 0; column < vals[row].length; column ++) {
      if (vals[row][column] >= 0) {valsCopy[row][column] = 1;}
      else {valsCopy[row][column] = 3;}
    }
  }
  return valsCopy;
}
  public static void main(String[] args) {
    int [] test1 = {100,3952,34,1,6};
    //int [][] test2 = {{100,3952},{34,1},{6}};
    int [][] test3 = {{0,0,-2,0},{32,0},{-4}};
    printArray(test1);
    System.out.print("\n");
    printArray(test3);
    System.out.print("\n");
    System.out.print(countZeros2D(test3));
    System.out.print("\n");
    fill2D(test3);
    System.out.print("\n");
    printArray(fill2DCopy(test3));
  }
}
