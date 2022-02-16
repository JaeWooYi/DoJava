package sec08_referencedatatype;

public class Ex02_ValueAssignment {
    public static void main(String[] args){
        // 1. 배열의 원소값 대입 방법1
        System.out.println("1. 배열의 원소값 대입 방법1");
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        int[] b;
        b = new int[3];
        b[0] = 3;
        b[1] = 4;
        b[2] = 5;
        System.out.println(b[0] + " " + b[1] + " " + b[2]);
        System.out.println();

        // 2. 배열의 원소값 대입 방법2
        System.out.println("2. 배열의 원소값 대입 방법2");
        int[] c = new int[] {1,2,3};
        System.out.println(c[0] + " " + c[1] + " " + c[2]);

        int[] d;
        d = new int[] {1,2,3};
        System.out.println(d[0] + " " + d[1] + " " + d[2]);
        System.out.println();

        // 3. 배열의 원소값 대입 방법3
        System.out.println("3. 배열의 원소값 대입 방법3");
        int[] e = {5,6,7};
        System.out.println(e[0] + " " + e[1] + " " + e[2]);

        // 3방법의 경우 나누는게 불가능능
//       int[] f;
//        f = {5,6,7};
    }
}
