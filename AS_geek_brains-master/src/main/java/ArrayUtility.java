import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {

    private int [] data;

    public ArrayUtility(int[] data) {
        this.data = data;
    }

    //функция должна возвращать сумму элементов массива
    public long arraySum(){

        long sum = 0;

        for (int a: data) {
            sum += a;
        }
        return sum;
    }
    //функция должна возвращать среднее арифметическое
    //элементов массива
    public double avg(){

        double avg = (double) arraySum() / data.length;

        return avg;
    }

    //функция должна возвращать медиану массива
    //медиана - это элемент посередине в упорядоченном массиве для
    //нечетных длин массива
    //или среднее арифметическое двух соседних элементов посередине
    //для четных длин
    //1 2 3 4 5 - 3
    //1 2 3 4 - (2 + 3) / 2 = 2,5
    public double median(){

        double median;

        if (data.length % 2 != 0) {
            median = data[(data.length - 1) / 2];
        } else {
            median = (double) (data[data.length/ 2] + data[(data.length - 2) / 2]) / 2;
        }

        return median;
    }
}
