import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Data {

    public static void dataCollection(int[] array, int subArraySize){

        int[] subArray = new int[subArraySize];
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        for (Integer x: array) {
            listArr.add(x);
        }
        System.out.println(listArr);


        int[] arrHighest = new int[7];
        int counter = 0, index = 0;
        int tot1 = subArraySize;
        int arrCount = 0;
        int n = 0;
        while (n <= 21){
            n++;

            subArray[counter] = listArr.get(arrCount);
            counter++;
            arrCount++;

            if (counter == subArraySize){
                for (int j = 0; j < subArray.length; j++) {
                    System.out.print(subArray[j]+" ");
                }
                System.out.println("");

                for (int i = 0; i < subArray.length; i++) {
                    for (int j = i+1; j < subArray.length; j++) {
                        if (i == j || i != j){
                            tot1--;
                            if (i != j){
                                tot1 = 3;
                            }
                        }
                    }
                }
                arrHighest[index] = tot1;
                index++;
                counter = 0;
                arrCount = arrCount - 2;
            }

        }

        for (int i = 0; i < arrHighest.length; i++) {
            System.out.println(arrHighest[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {6,2,6,8,3,7,1,4,4};
        int subArraySize = 3;

        dataCollection(array, subArraySize);


    }
}

