public class TipeDataArray {
    public static void main(String[] args) {
        // tipe data array
        String[] names;
        names = new String[3];

        names[0] = "Tonni";
        names[1] = "Asep";
        names[2] = "Aep";

        for (String name : names) {
            System.out.println(name);
        }

    }
}
