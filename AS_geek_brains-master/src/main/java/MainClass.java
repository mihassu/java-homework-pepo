public class MainClass {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11};
        ArrayUtility arr = new ArrayUtility(array);

        System.out.println("Сумма элементов: " + arr.arraySum());
        System.out.println("Среднее арифметическое: " + arr.avg());
        System.out.println("Медиана: " + arr.median());
    }


}
