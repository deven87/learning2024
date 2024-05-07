public class test {

    public static void main(String[] args) {

        String r = "\"$123.123\"";

        System.out.println(r);

        System.out.println(r.replaceAll("[^.,^0-9]", ""));


    }
}
