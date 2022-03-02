package sec16_MethodOverriding.o04_ObjectClass;

import java.util.HashMap;

class AAA{
    String name;

    AAA(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.name == ((AAA) obj).name){
            return true;
        }else
            return false;
    }
    @Override
    public String toString(){
        return name;
    }
}

class BBB{
    String name;

    BBB(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.name == ((BBB) obj).name){
            return true;
        }else
            return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public String toString(){
        return name;
    }
}

public class ex03_ObjectMethod_hashcode {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();     // <Integer, String> -> <키, 값>
        hm1.put(1,"data1");
        hm1.put(1,"data2"); // 덮어쓰기해버렸내? 얘내는 같은 키값 넣지 못하는구나?
        hm1.put(2,"data3");
        System.out.println(hm1);

        System.out.println();

        HashMap<AAA, String> hm2 = new HashMap<>();
        hm2.put(new AAA("1st"),"data1");
        hm2.put(new AAA("1st"),"data2");
        hm2.put(new AAA("2st"),"data3");
        System.out.println(hm2);

        System.out.println();

        HashMap<BBB, String> hm3 = new HashMap<>();
        hm3.put(new BBB("1st"),"data1");
        hm3.put(new BBB("1st"),"data2");
        hm3.put(new BBB("2st"),"data3");
        System.out.println(hm3);

// hard day..
    }
}
