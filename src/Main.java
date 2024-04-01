public class Main {
    public static void main(String[] args) {
        MyCollection<String> strings = new MyArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Thee");
        strings.add("Four");

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.delete(1);

        System.out.println(strings.get(1));
        System.out.println(strings.size());

    }
}