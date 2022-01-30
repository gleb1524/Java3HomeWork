import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,3,5,6};
        System.out.println(Arrays.toString(arr));
        slashElements(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(list(arr).get(3));

    }
    public static void slashElements(Object[] arr, int a, int b){
        Object c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
    public static<E> List<E> list(E[] arr){
        return Arrays.asList(arr);
    }

}

