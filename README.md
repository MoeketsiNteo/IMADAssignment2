# Tech Myth and Facts App

## 1. Introduction

This project is a mobile application developed using Kotlin in Android Studio. The application is based on the idea that many people struggle to tell the difference between real technology facts and common myths found online. 

The app provides a simple and interactive quiz that helps users test their knowledge and learn correct information in a practical way, as required in the assignment brief (The Independent Institute of Education, 2026).

## 2. Purpose of the App

The purpose of this application is to help users identify the difference between common technology myths and real facts by allowing them to interact with a quiz that tests their knowledge and provides feedback based on their answers (The Independent Institute of Education, 2026; 12th Man Technology, n.d.; Inceptor, n.d.).

## 3. Features of the App

The application includes the following features:

- A welcome screen with a start button  
- A question screen that displays quiz statements  
- Two answer buttons (Fact and Myth)  
- Feedback after each answer (correct or wrong)  
- A score tracking system  
- A final score screen with feedback  
- A review button to display correct answers and explanations  
- A restart button to allow the user to retake the quiz  

These features were implemented to meet the functional requirements outlined in the assignment (The Independent Institute of Education, 2026).

## 4. Design of the App (User Interface)

The application is divided into three main screens, as required by the assignment:

### a) Welcome Screen  
This screen introduces the application and displays a short description. It also includes a **Start Quiz** button which allows the user to begin the quiz.

### b) Question Screen  
This screen displays one question at a time. The user selects either **Fact** or **Myth** using buttons. Feedback is shown after each answer, and a **Next** button allows the user to move to the next question.

### c) Score Screen  
This screen displays the user’s final score and provides feedback based on their performance. It also includes a **Review Answers** button and a **Restart Quiz** button.

The design follows the requirement of creating a simple and user-friendly interface (The Independent Institute of Education, 2026).

## 5. How the Application Works

The application works by guiding the user through a quiz process across the three main screens, as described in the assignment (The Independent Institute of Education, 2026).

- When the app starts, the user sees the welcome screen. After clicking the start button, the app navigates to the question screen using an intent.  

- On the question screen, the user is shown one statement at a time. The user must decide whether the statement is a **Fact** or a **Myth**. Once an answer is selected, the app checks whether it is correct and displays feedback. If the answer is correct, the score increases. The user must decide whether the statement is a **Fact** or a **Myth** by selecting one of the buttons provided. For example below:

a) If the user selects the correct answer, the app displays a message such as:
  **"Correct! You spotted the truth."** and increases the score.

![Correct Answer](https://github.com/MoeketsiNteo/IMADAssignment2/blob/3835000a862bc7251346cb77c096852560201c76/Correct.jpeg)

b) If the user selects the wrong answer, the app displays:
  **"Wrong! This one caught you."**
  
![Incorrect Answer](https://github.com/MoeketsiNteo/IMADAssignment2/blob/63552f59da045ee7f1a4b157b99a5dd106479fd8/Incorrect.jpeg)

c) If the user presses **Next** without selecting an answer, the app shows a message:
  **"Please choose Fact or Myth before moving on."**  
  This ensures the user answers every question before continuing.
  
![Error Message](https://github.com/MoeketsiNteo/IMADAssignment2/blob/40585dca7e1b445aaafe748eb5de638b7c01dd32/Error.jpeg)

- The application uses a variable to keep track of the current question and moves through the list of questions step by step. This demonstrates the use of iteration, which is one of the requirements of the assignment (The Independent Institute of Education, 2026).  

- After all questions are answered, the app automatically moves to the score screen. The user’s total score is displayed, along with feedback depending on performance. The user can also review all questions and their correct answers, which satisfies the review functionality requirement (The Independent Institute of Education, 2026).  

The logic of the application was implemented using Kotlin, and guidance on structuring quiz logic and handling user input was supported by a YouTube tutorial (Programming Knowledge, 2021).

## 7. Screenshot of the working application

The following screenshots show the application running on the emulator during testing.

### Welcome Screen
![Welcome Screen](https://github.com/MoeketsiNteo/IMADAssignment2/blob/1422b01e1d94a742fdf54460c335baca78cf1d28/Welcome%20Screen.jpeg)

This screen introduces the application and allows the user to start the quiz.

### Question Screen
![Question Screen](https://github.com/MoeketsiNteo/IMADAssignment2/blob/3ef46abbb0ed547925848107392b833ad597ecb4/Question%20Screen.jpeg)

This screen displays one question at a time and allows the user to choose between Fact and Myth.

### Answer Feedback
![Answer Feedback](https://github.com/MoeketsiNteo/IMADAssignment2/blob/cbc0e10155a5fc271ccc985495432adc989bca42/Answer%20Feedback.jpeg)

This screen shows feedback after the user selects an answer.

### Score Screen
![Score Screen](https://github.com/MoeketsiNteo/IMADAssignment2/blob/25da8fddfbfe3b30902d69aeccfb2651a6d32e23/Score%20Screen.jpeg)

This screen displays the final score and performance feedback.

### Review Answers
![Review Answers](https://github.com/MoeketsiNteo/IMADAssignment2/blob/3de5a3f1b53001e3a444607d396b559c430feef6/Review%20Answers.jpeg)

*All screenshots are original and captured from the developed application during testing*

## 8. Challenges Faced

- Layout files not being recognised by the system  
- Errors when navigating between activities  
- Understanding how to structure multiple screens  
- Debugging Kotlin errors  

These issues were resolved by rebuilding the project, checking file names, and improving the code structure.

## 9. Conclusion

This project successfully demonstrates the development of a simple Android application using Kotlin. The application meets all the requirements by including multiple screens, implementing quiz logic, tracking user performance, and providing feedback.
The use of external resources and proper planning helped in completing the project successfully. Overall, this project improved understanding of Android development and problem-solving skills.

## 10. References

12th Man Technology. (n.d.). *Busting 10 Tech Myths*. Available at: https://12thmantechnology.com/busting-10-tech-myths/  

Inceptor. (n.d.). *Tech Myths and Facts*. Available at: https://inceptor.co.ke/tech-myths-and-facts/  

Programming Knowledge. (2021). *Android Quiz App Tutorial* [YouTube video]. Available at: https://youtu.be/pKMqJAc6wYw  

The Independent Institute of Education (IIE). (2026). *Introduction to Mobile Application Development IMAD5112: Assignment 2 Brief*  

## 11. Links

🔗 GitHub Repository: (https://github.com/MoeketsiNteo/IMADAssignment2)  
🎥 Video Demonstration: (https://youtu.be/xUHPCJrI0s8)
