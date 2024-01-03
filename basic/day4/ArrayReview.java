package basic.day4;

/**
 * ArrayReview
 */
public class ArrayReview {

    public static void main(String[] args) {
        

        int[] iArray = { 1, 2, 3, 4, 5 };
        double[] dArray = new double[5];
        char[] cArray = new char[5];
        cArray[0] = 'j';
        cArray[1] = 'a';
        cArray[2] = 'v';    
        cArray[3] = 'a';
        cArray[4] = '!';

        System.out.print("1.  ");
        System.out.println(iArray);
        System.out.print("2.  ");
        System.out.println(dArray);
        System.out.print("3.  ");
        System.out.println(cArray);
        
        
        int[] temp;
        temp = iArray;
        System.out.print("4.  ");
        System.out.println(temp);
    }
}