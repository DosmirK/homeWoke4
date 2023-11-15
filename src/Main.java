import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> boys = new ArrayList<>();
        while (boys.size() < 5) {
            System.out.println("Введите список мальчиков: ");
            Scanner scanner = new Scanner(System.in);
            String texts = scanner.nextLine();
            boys.add(texts);
            System.out.println(boys);
        }

        ArrayList<String> girls = new ArrayList<>();
        while (girls.size() < 5) {
            System.out.println("Введите список девочек: ");
            {
                Scanner scanner = new Scanner(System.in);
                String texts = scanner.nextLine();
                girls.add(texts);
                System.out.println(girls);
            }
        }
        ArrayList<String> general = new ArrayList<>();

        for (int i = 0; i < Math.max(boys.size(), girls.size()); i++) {
            if (i < boys.size()) {
                general.add(boys.get(i));
            }
            if (i < girls.size()) {
                general.add(girls.get(girls.size() - 1 - i));
            }
        }
        System.out.println("Объединенный список: " + "\n" + general);

        Collections.sort(general, Comparator.comparing(String::length));
        System.out.println("Отсортированный список: " + "\n" + general);
    }
}
