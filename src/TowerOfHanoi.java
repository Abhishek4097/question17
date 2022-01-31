import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();
        towerofhanoi(n, t1d, t2d, t3d);
        sc.close();
    }

    public static void towerofhanoi(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }
        else {
            towerofhanoi(n-1, t1id, t3id, t2id);
            System.out.println(n + t1id + "->" + t2id );
            towerofhanoi(n-1, t3id, t2id, t1id);
        }
    }
}
