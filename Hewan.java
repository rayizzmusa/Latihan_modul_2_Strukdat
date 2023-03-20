import java.util.ArrayList;

public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan Yang DiTambahakan : " + hewan);


        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        ArrayList<String> deletedData = new ArrayList<>();

        for (String hahaha : deleteHewan) {
            hewan.removeIf(h -> h.equals(hahaha));
            deletedData.add(hahaha);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(deletedData);
        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}
