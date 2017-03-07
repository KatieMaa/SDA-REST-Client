package sda.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        String message = "Hello World";
        File file = new File("C:\\Users\\RENT\\Desktop\\test.txt");
//        readFromFile(file);
        List<User> users = readUsersFromFile(file);
        users.forEach(e -> System.out.println(e));

        User user = new User();
        user.setFirstName("Kasia");
        user.setLastName("Szynka");
        user.setAge(34);
        addUserToFile(user, file);
    }

    public static void addUserToFile(User user, File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(user.toString());
        }
    }

    private static List<User> readUsersFromFile(File file) throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                //1.Czytamy linie z pliku
                String nextLine = scanner.nextLine();
                String[] split = nextLine.split(" ");

                //2.Tworzymy nowy obiekt
                User user = new User();
                user.setFirstName(split[0]);
                user.setLastName(split[1]);
                user.setAge(new Integer(split[2]));
                //3.Dodajemy do listy
                users.add(user);
            }
            return users;
        }
    }

    private static void readLinesFromFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
//    private static void readNamesInOne

    private static void exampleReadFromFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
    }


    private static void readFromFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(" ");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
        }
    }

    private static void exampleWriteToFile(String message, File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
    }
}