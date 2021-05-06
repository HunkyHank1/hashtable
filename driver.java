public class driver {
    public static void main(String[] args) {
        hashTable h = new hashTable();
        h.put("key", "value");
        h.put("two", "three");
        System.out.println(h.get("key"));
        System.out.println(h.get("not"));
        System.out.println(h.put("key", "62a"));
        System.out.println(h.get("two"));
    }
}
