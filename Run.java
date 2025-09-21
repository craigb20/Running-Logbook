import java.time.LocalDate;

public class Run {
    
    // Instance variables to store run data
    private double distance; // Distance of run in kilometers
    private int duration;    // Duration of run in minutes
    private LocalDate date;  // Date of run

    // Constructor to initialize a new Run object
    public Run(double distance, int duration, LocalDate date) {
        this.distance = distance;
        this.duration = duration;
        this.date = date;
    }

    // Getter method to return distance of run
    public double getDistance() {
        return distance;
    }

    // Getter method to return duration of run
    public int getDuration() {
        return duration;
    }

    // Getter method to return date of run
    public LocalDate getDate() {
        return date;
    }

    // Method to calculate and return the pace (minutes per kilometer)
    public double getPace() {
        return (double) duration / distance; // Pace = duration / distance
    }

    // Override the toString method to provide a formatted string representation of the run
    @Override
    public String toString() {
        return String.format(
            "Date: %s | Distance: %.2f km | Duration: %d min | Pace: %.2f min/km ",
            date.toString(), distance, duration, getPace()
        );
    }
}

