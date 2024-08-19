package AutomationPractice;

public class GenericPractice <T>{

//    private K key;
//    private V value;
//    public GenericPractice(K key,V value)
//    {
//       this.key=key;
//       this.value=value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public V getValue() {
//        return value;
//    }
    T type;
    public void setType(T type) {
        this.type = type;
    }
    public  T getType()
    {
         return type;
    }
}
