package org.example.lab1;

public class GymApp {
    public static void main(String[] args) {
        // Створення об'єкта Gym
        Gym gym = new Gym(1, "City Gym", "123 Fitness St", "Mon-Fri 6am-10pm");

        // Створення об'єкта Trainer з Gym
        Trainer trainer = new Trainer(1, "John Doe", "123 Main St", "123-456-7890",
                "Mon-Fri 9am-5pm", "Weightlifting", gym);

        // Створення об'єкта Client з призначеним тренером
        Client client = new Client.ClientBuilder()
                .setClientId(1)
                .setClientName("Jane Smith")
                .setAddress("456 Elm St")
                .setContactInfo("987-654-3210")
                .setMembershipDetails("Gold")
                .setAssignedTrainer(trainer)
                .build();

        // Виведення інформації про клієнта
        System.out.println(client);
    }
}
