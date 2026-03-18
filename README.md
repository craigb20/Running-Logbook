# Running-Logbook
This Java project is a command-line application for tracking running activity. Users can log individual runs with distance, duration, and date, view their run history, and calculate overall statistics such as total distance and average pace.

> **Note:** This project was created for academic and learning purposes. It is not intended for production use.

## Installation

1. Ensure **Java (JDK 17)** is installed on your system.
2. Download or clone the repository and navigate to the project directory.
3. No external dependencies are required — the project uses only standard Java libraries: `java.util.Scanner`,`java.util.ArrayList`, and `java.time.LocalDate`

## Usage

Compile and run the program by executing the `Main` class:

You will be prompted with the following menu:

```
--- Running Tracker ---
1. Add run
2. View all runs
3. View stats
4. Exit
```

## Key Functionality

- **Option 1 – Add Run**
  - Input distance (km), duration (minutes), and date
  - Stores run data in memory using an object-oriented structure

- **Option 2 – View Run History**
  - Displays all recorded runs
  - Uses the `Run` class `toString()` method for formatting

- **Option 3 – View Statistics**
  - Calculates total distance across all runs
  - Computes average pace (minutes per kilometer)

## Features

- Command-line interface with interactive menu  
- Object-oriented design using a `Run` class  
- Dynamic data storage with `ArrayList`  
- Date handling with `LocalDate`  
- Real-time calculation of running statistics  

## Project Structure

```
Running-Logbook/
├── Main.java
└── Run.java
```

## Skills Demonstrated

- Java programming  
- Object-oriented design  
- User input handling   

## Future Improvements
 
- Add input validation to prevent invalid entries  
- Implement file storage for persistent data  
- Add ability to edit or delete runs  
- Support additional metrics (calories burned)  

## License

[MIT](https://choosealicense.com/licenses/mit/)
