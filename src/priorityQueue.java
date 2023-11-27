import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class priorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(5);
        pq.add(9);
        pq.add(1);
        pq.add(42);
        pq.add(41);
        pq.add(46);

        int n= pq.size();
        for(int i =0 ; i<n ; i++){
            System.out.println(pq.poll());
        }


        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

        pq1.add(2);
        pq1.add(5);
        pq1.add(55);
        pq1.add(52);
        pq1.add(28);
        pq1.add(31);

         n = pq1.size();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0 ; i<n;i++){
            System.out.println(pq1.poll());
        }


    }


}
