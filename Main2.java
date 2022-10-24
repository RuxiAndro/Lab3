import java.util.*;

public class Main2 {
    static ArrayList<Integer> nr_prime=new ArrayList<Integer>();
    static int m;
    static void prim()
    {
        boolean[] marked=new boolean[m/2+100];
        for(int i=1;i<=(Math.sqrt(m)-1)/2;i++)
            for(int j=(i*(i+1))<<1;j<=m/2;j=j+2*i+1)
                marked[j]=true;
        nr_prime.add(2);
        for(int i=1;i<=m/2;i++)
            if(marked[i]==false)
                nr_prime.add(2*i+1);
    }

    static void verif(int n)
    {
        if(n<=2 || n%2!=0) {
            System.out.println("nu sunt prime");
            return;
        }
        for(int i=0;nr_prime.get(i)<n/2;i++)
        {
            int dif=n-nr_prime.get(i);
            if(nr_prime.contains(dif))
            {
                System.out.println(nr_prime.get(i) + "+" +dif + "=" +n);
                return;
            }
        }
    }
    /*public static boolean nr_prim(int x)
    {
        if(x<2)
            return false;
        if(x%2==0 && x!=2)
            return false;
        for(int d=3;d*d<=x;d=d+2)
            if(x%d==0)
                return false;
        return true;
    }*/

    public static void main(String[] args) {
        int x;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
       // n=in.nextInt();
        m=in.nextInt();
        prim();
        verif(x);
        //System.out.println("Hello world!");
    }
}