

# Student Marking System

## Overview
This Student Marking System is a Java-based application with a graphical user interface (GUI) that allows users to input and calculate student grades for various subjects. The system provides functionality to calculate percentage, average, and assign grades based on the marks entered.

## Features
1. Input marks for four subjects: Chemistry, Biology, Physics, and Mathematics
2. Calculate and display percentage
3. Calculate and display average marks
4. Assign and display grades based on percentage
5. Display all results (percentage, average, and grade) with a single button click

## GUI Components
- Home, Student, Lecturers, and Help buttons (navigation buttons, functionality not implemented in the provided code)
- Text fields for entering marks in each subject (out of 40)
- Buttons for calculating percentage, average, and grade
- Text fields for displaying results
- A button to display all results at once

## How It Works

### Mark Input
- Users can enter marks (out of 40) for Chemistry, Biology, Physics, and Mathematics in the provided text fields.

### Calculations
1. **Percentage Calculation**
   - Formula: `(Total marks / 160) * 100`
   - The result is displayed when the "PERCENTAGE" button is clicked.

2. **Average Calculation**
   - Formula: `(Chemistry + Biology + Physics + Mathematics) / 4`
   - The result is displayed when the "AVERAGE" button is clicked.

3. **Grade Assignment**
   - Based on the calculated percentage, grades are assigned as follows:
     - 80-100%: Grade A
     - 70-79%: Grade B
     - 60-69%: Grade C
     - 50-59%: Grade D
     - Below 50%: FAILED
   - The grade is displayed when the "GRADE" button is clicked.

### Display All Results
- Clicking the "DISPLAY ALL THE ANSWERS DOWN HERE" button calculates and displays the percentage, average, and grade simultaneously.

## Usage Instructions
1. Run the `Grading` class to launch the application.
2. Enter the marks (out of 40) for each subject in the respective text fields.
3. Click on individual buttons (PERCENTAGE, AVERAGE, GRADE) to see specific results, or use the "DISPLAY ALL THE ANSWERS DOWN HERE" button to see all results at once.
4. The results will be displayed in the corresponding text fields at the bottom of the window.

## Note
This system provides a basic interface for grade calculations. For production use, consider adding input validation, error handling, and more comprehensive grading features.
