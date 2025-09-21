import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Run> logbook = new ArrayList<>();
        boolean running = true;

        while (running) {
            // Prompt for user
            System.out.println("\n--- Running Tracker ---");
            System.out.println("1. Add run");
            System.out.println("2. View all runs");
            System.out.println("3. View stats");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = reader.nextLine();

            switch (choice) {
                case "1":
                // Add a new run
                    System.out.print("Distance (km): ");
                    double dist = Double.parseDouble(reader.nextLine());

                    System.out.print("Duration (minutes): ");
                    int time = Integer.parseInt(reader.nextLine());

                    System.out.print("Date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(reader.nextLine());

                    Run newRun = new Run(dist, time, date);
                    logbook.add(newRun);
                    break;

                case "2":
                // View run history
                    System.out.println("");
                    for (int i = 0; i < logbook.size(); i++) {
                        Run run = logbook.get(i);
                        System.out.println(run);
                    }
                    break;

                case "3":
                // View total distance and average pace
                    double totalDistance = 0;
                    int totalTime = 0;

                    for (int i = 0; i < logbook.size(); i++) {
                        Run run = logbook.get(i);
                        totalDistance += run.getDistance();
                        totalTime += run.getDuration();
                    }

                    System.out.println("");
                    System.out.printf("Total distance: %.2f km\n", totalDistance);

                    if (totalDistance > 0) {
                        double avgPace = totalTime / totalDistance;
                        System.out.printf("Average pace: %.2f min/km\n", avgPace);
                    } else {
                        System.out.println("Average pace: 0 min/km\n");
                    }
                    break;

                case "4":
                // Exit
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        reader.close();
    }
}
