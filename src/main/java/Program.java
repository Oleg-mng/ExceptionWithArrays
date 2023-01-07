import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен частному элементов
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
 * как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class Program {

    public static void main(String[] args) {
        int len = 4;
        int[] array1 = {2, 4, 5, 8};
        int[] array2 = {2, 1, 2, 1, 8};
        treatExceptionOnLength(array1, array2);
        buildArray3(array1, array2);
        printArray(buildArray3(array1, array2));
        }

    public static int[] buildArray3(int[] array1, int[] array2) {
        int [] array3= new int [array1.length];
        for (int i=0; i < array1.length; i++) {
            array3[i] = array1[i] / array2[i];
        }
        return array3;
    }
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void treatExceptionOnLength (int[] array1, int[] array2){
            if (array1.length != array2.length) {
//                System.out.println("RuntimeException: Длины массивов не равны - Скорректируйте");
                throw new RuntimeException("Arrays not equals");
//                System.exit(0);
            }
        }
    }
