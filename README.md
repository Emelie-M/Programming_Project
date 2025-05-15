# Strava Project

This project is a prototype inspired by Strava, designed to simulate a social fitness tracking app where athletes can log and track their physical activities. The program demonstrates core Object-Oriented Programming (OOP) concepts in Java, including inheritance, enums, encapsulation, and user input interaction through the terminal.

## Features

- **Activity Logging:** Users can create and log physical activities such as running, cycling, swimming, etc.
- **Equipment Support:** Tracks which equipment (e.g., bike, elliptical) is used during powered activities.
- **Calories Burned Calculation:** Based on MET values, duration, and user weight.
- **User Interaction:** Prompts input directly from the console to gather information.
- **OOP Structure:** Clean separation of concerns across classes like `Athlete`, `Activities`, `PoweredActivities`, `Equipment`, and enums for `Modality` and `Gender`.

## How to Run

1. Clone the repository or copy the files into your Java project folder.
2. Run the `Main.java` file.
3. Follow the prompts in the terminal to input data and create activity logs.

## Classes Overview

- `Main.java` – Entry point of the application.
- `Athlete.java` – Represents a user and stores information like name, weight, and gender.
- `Activities.java` – Base class for all types of physical activities.
- `PoweredActivities.java` – Extends `Activities` to include equipment used during activity.
- `Equipment.java` – Handles registration and selection of valid equipment.
- `Gender.java` – Enum for athlete gender.
- `Modality.java` – Enum for different physical activity types.

## Authors

Giuliano Proietti and Emelie Mejia-Cornejo

## Date

April 28, 2025

## License

[MIT](https://github.com/Emelie-M/Programming_Project/blob/master/LICENSE)
