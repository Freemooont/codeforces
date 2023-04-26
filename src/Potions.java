import java.util.PriorityQueue;
import java.util.Scanner;

public class Potions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        long[] a = new long[n];
        long[] oldA = new long[n];

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            a[i] = val;
            oldA[i] = val;
        }

        System.out.println(calculatePQ(n, 0, a));
    }

    private static int calculatePQ(int n, long health, long[] a) {
        if (a.length == 0) return 0;

        PriorityQueue priorityQueue = new PriorityQueue();

        boolean oncePositive = false;
        for (int i = 0; i < n; i++) {

            if (a[i] >= 0) {
                oncePositive = true;
            }

            if (oncePositive) {
                health += a[i];
                if (health >= 0) {
                    priorityQueue.offer(a[i]);
                } else {
                    health -= a[i];
                }
            }

        }

        while (health < 0) {
            Object poll = priorityQueue.poll();
            if (poll == null) {
                poll = 0;
            }
            health -= Long.parseLong(poll.toString());
        }

        return priorityQueue.size();
    }
}


