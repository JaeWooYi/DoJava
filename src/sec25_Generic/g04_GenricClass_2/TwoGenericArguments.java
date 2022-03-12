package sec25_Generic.g04_GenricClass_2;

class KeyValue<K,V>{
    private K key;
    private V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}

public class TwoGenericArguments {
    public static void main(String[] args){
        KeyValue<String, Integer> keyValue1 = new KeyValue<>();
        keyValue1.setKey("사과");
        keyValue1.setValue(1000);
        String key1 = keyValue1.getKey();
        Integer value1 = keyValue1.getValue();
        System.out.println(key1 + "는 " + value1 + "원");

        System.out.println();

        KeyValue<Integer, String> keyValue2 = new KeyValue<>();
        keyValue2.setKey(404);
        keyValue2.setValue("Not Found");
        int a = keyValue2.getKey();
        String b = keyValue2.getValue();
        System.out.println(a + " : " +b);

        System.out.println();

        KeyValue<String, Void> keyValue3 = new KeyValue<>();
        keyValue3.setKey("키값만 사용도 가능 Void를 통해서");
        String c = keyValue3.getKey();
        System.out.println(c);
    }
}
