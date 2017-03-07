package sda.postman;

import org.codehaus.jackson.map.ObjectMapper;
import sda.messages.CreateUserRequest;
import sda.messages.CreateUserResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static final String URL = "http://localhost:8081/sda-json/json";

    public static void main(String[] args) throws IOException {

        List<String> userIds = new ArrayList<>();
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add user");
            System.out.println("2. Print user's id");
            System.out.println("3. Print users data");

            String choiceRaw = scanner.nextLine();

            Integer choice = Integer.parseInt(choiceRaw);

            switch (choice) {
                case 1:
                    CreateUserRequest createUserRequest = new CreateUserRequest();

                    System.out.println("Please enter your name: ");
                    createUserRequest.setName(scanner.nextLine());
                    System.out.println("Please enter your login: ");
                    createUserRequest.setLogin(scanner.nextLine());
                    System.out.println("Please enter your mail: ");
                    createUserRequest.setMail(scanner.nextLine());

                    ObjectMapper mapper = new ObjectMapper();
                    String request = mapper.writeValueAsString(createUserRequest);
                    String createUserResponse = Sender.createUser(URL, request);

                    CreateUserResponse response = mapper.readValue(createUserResponse, CreateUserResponse.class);
//                    System.out.println("Your id: " + response.getId());
                    userIds.add(response.getId());
                    break;

                case 2:
                    System.out.println(userIds.toString());
                    break;

                case 3:
                    List<String> getUserResponses = new ArrayList<>();
                    for (String id : userIds) {
                        getUserResponses.add(Sender.getUser(URL, id));
                    }
                    System.out.println(getUserResponses.toString());
                    break;
                default:
                    break;

            }
//        String createUserRequest = "{" +
//                                    "\"name\":\"kasia\",\"," +
//                                    "\"login\":\"mb\"," +
//                                    "\"mail\":\"mb@a.pl\"" +
//                                    "}";

        }
    }
}
