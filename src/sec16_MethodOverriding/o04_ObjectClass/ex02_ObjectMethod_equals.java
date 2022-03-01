package sec16_MethodOverriding.o04_ObjectClass;

class AA {
    String name;
    AA(String name){
        this.name = name;
    }
}

class BB {
    String name;

    BB(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.name == ((BB) obj).name){
            return true;
        }else
            return false;
    }
}


public class ex02_ObjectMethod_equals {
    public static void main(String[] args){
        AA aa1 = new AA("HI");
        AA aa2 = new AA("HI");

        System.out.println(aa1 == aa2);
        System.out.println(aa1.equals(aa2));

        System.out.println();

        BB bb1 = new BB("BYE");
        BB bb2 = new BB("BYE");

        System.out.println(bb1 == bb2);         // 스택메모리에 위치값을 비교하는거니까 여전히 false야
        System.out.println(bb1.equals(bb2));
    }
}
