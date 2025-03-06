/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
        //creating the array with n values
        int[] num = new int[args.length];
        //creating the same array to compare with
        //int[] num2 = new int[args.length];
        //initializing boolean variable
        boolean b = false;
        //adds the values of the args into first array
        for (int i = 0; i< args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }
       
        //gets a value from array
        for (int i = 0; i< args.length; i++){
            //compares to values after i
            for (int j = i+1; j < args.length; j++)
            {if (num[i] == num[j]){
                    b = true;
                }
            }
            //compares to values before i
            for (int k = i-1; k>= 0; k--)
            {if (num[i] == num[k]){
                    b = true;
                }
                }

        }

        System.out.println(b);
            }
        }


		//WRITE YOUR CODE HERE

