import java.util.Scanner;

public class baisic  {

    public void fibw()
    {
        System.out.print("HI enter number for fibonaci :");
        Scanner fbn = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, n;
        int i = 0;
        // import int n to my project
        n = fbn.nextInt();
        if (n <=2)  {
            System.out.println("\n" + 0 + "\n" + 1);
        }
        else {

        while (i < n - 2)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;


            System.out.println("\n" + 0 + "\n" + 1);
            System.out.println(n3);
            i++;
        }}

    }
    // print adad aval
    public void AdadAval() {
        boolean p = false;
        for (int i = 3; i < 200; i += 2) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    p = true;
                }
            }
            if (p == true) {
                System.out.print("");
            } else System.out.println("this is adad aval :"  + i);
            p = false;
        }
    }
    public void Yekan() {
        System.out.print("enter number ");
        Scanner t = new Scanner(System.in);
        int s = t.nextInt();
        int r = 0;
        int x = s;
        while (x != 0) {
            int z = r = r * 10;
            r = r + (x % 10);
            x /= 10;
        }
        System.out.println(r);


    }
    public int    Tekeh() {
        Scanner f = new Scanner(System.in);
        int t = f.nextInt();
        int j = t;
        int give;
        while (j != 0) {
            give = j % 10;
            j /= 10;

            give=t;        }

        return t;

    }
    // factoril
    public int fact() {
        System.out.println("test start ");
        Scanner give = new Scanner(System.in);
        int n = give.nextInt();
        int w = 1;
        for (int q = 2; q <= n; q++) {
            // we need a new number for factoril
            w = w * q;
        }
        return w;

    }


}





