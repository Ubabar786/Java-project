package review5;

public class E1Arrays {
    public static void main(String[] args) {

        int a = 10;

        int[] array = {10, 11, 12, 13, 14};

        int numOfElement = array.length;

        System.out.println(numOfElement); //how many element in the array

        System.out.println(array[3]); //getting 1 element form an array

        /* when to use loops - when we want to repeat a block of code

        when we do not know the exact number of iterations - while or do while

        when we know how many times we want to repeat or iterate the code - for loop or enhanced for loop

        we use enhanced for loop ONLY with arrays or collections with multiple items stored inside

         */

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

        /*   Enhanced for/for each/advanced for loop syntax
        for(DataTypeOfElement anyVariableName : NameOfTheDataStructure){
        }

         */
        // // int[] array = {10, 11, 12, 13, 14};

        for(int all:array){
            System.out.print(all+" ");
        }
    }
}
