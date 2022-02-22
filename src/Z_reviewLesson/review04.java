package Z_reviewLesson;

import java.util.Arrays;

public class review04 {
    public static void main(String[] args){

        int[] a1 = new int[3];
        int[] a2;
        a2 = new int[3];

        int a3[] = new int[3];
        int a4[];
        a4 = new int[3];
        //----------------------------------------위 배열의 선언 방법

        System.out.println("1-----");
        int[] i = new int[3];
        i[0]= 1;
        i[1]= 2;
        i[2]= 3;
        System.out.print(i[0] + " " + i[1] + " " + i[2]);
        System.out.println();
        System.out.println();

        System.out.println("2-----");
        int[] j = new int[]{2,3,4};
        System.out.println(j[0] + " " + j[1] + " " + j[2]);
        System.out.println();

        System.out.println("3-----");
        int[] k = {3,4,5};
        System.out.println(k[0] + " " + k[1] + " " + k[2]);
        System.out.println();

        System.out.println("4-----");
        int[] b1 = new int[5];
        for(int b2 = 0; b2 < 5; b2++){
            b1 = new int[]{10,11,12,13,14};
            System.out.print(b1[b2]+ " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("5-----");
        System.out.println(k.length);
        System.out.println();
        int[] kkk = new int[]{10,20,30,40,50};
        for (int cc = 0; cc < 5; cc++){
            System.out.print(kkk[cc] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(kkk));
    }
}
