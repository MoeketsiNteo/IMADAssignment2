package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
 This screen structure was assisted by a YouTube tutorial on Android quiz app development.

 Source used for guidance:
 Programming Knowledge. (2021). Android Quiz App Tutorial.
 Link: https://youtu.be/pKMqJAc6wYw

 I used the idea to understand quiz flow, answer buttons, score tracking,
 and moving between questions. I changed the code to fit my own app.
*/

class QuestionActivity : AppCompatActivity() {

    // This keeps track of the question the user is currently on
    private var questionIndex = 0

    // This keeps track of how many answers the user gets correct
    private var score = 0

    // This prevents the user from answering the same question more than once
    private var answered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This connects this Kotlin file to the question screen layout
        setContentView(R.layout.activity_question)

        // These connect the TextViews from the XML file
        val tvQuestionNumber = findViewById<TextView>(R.id.tvQuestionNumber)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)
        val tvFeedback = findViewById<TextView>(R.id.tvFeedback)

        // These connect the buttons from the XML file
        val btnFact = findViewById<Button>(R.id.btnFact)
        val btnMyth = findViewById<Button>(R.id.btnMyth)
        val btnNext = findViewById<Button>(R.id.btnNext)

        // This function loads the current question onto the screen
        fun loadQuestion() {
            tvQuestionNumber.text =
                "Question ${questionIndex + 1} of ${QuestionAnswer.questions.size}"

            tvQuestion.text = QuestionAnswer.questions[questionIndex]

            // These button labels come from the choices array
            btnFact.text = QuestionAnswer.choices[questionIndex][0]
            btnMyth.text = QuestionAnswer.choices[questionIndex][1]

            // This clears old feedback when a new question loads
            tvFeedback.text = ""

            // The new question has not been answered yet
            answered = false

            // These buttons are enabled again for the new question
            btnFact.isEnabled = true
            btnMyth.isEnabled = true

            Log.d("QUESTION_ACTIVITY", "Question ${questionIndex + 1} loaded")
        }

        // This function checks whether the answer selected by the user is correct
        fun checkAnswer(userAnswer: String) {
            if (!answered) {

                val correctAnswer = QuestionAnswer.correctAnswers[questionIndex]

                if (userAnswer == correctAnswer) {
                    score++
                    tvFeedback.text = "Correct! You spotted the truth."
                    Log.d("QUESTION_ACTIVITY", "Correct answer. Score is now $score")
                } else {
                    tvFeedback.text = "Wrong! This one caught you."
                    Log.d("QUESTION_ACTIVITY", "Wrong answer. Score is still $score")
                }

                // This stops the user from answering twice
                answered = true
                btnFact.isEnabled = false
                btnMyth.isEnabled = false
            }
        }

        // This checks the answer when the user clicks Fact
        btnFact.setOnClickListener {
            checkAnswer(btnFact.text.toString())
        }

        // This checks the answer when the user clicks Myth
        btnMyth.setOnClickListener {
            checkAnswer(btnMyth.text.toString())
        }

        // This button moves to the next question
        btnNext.setOnClickListener {

            if (!answered) {
                tvFeedback.text = "Please choose Fact or Myth before moving on."
            } else {
                questionIndex++

                if (questionIndex < QuestionAnswer.questions.size) {
                    loadQuestion()
                } else {

                    // When all questions are answered, move to the score screen
                    val intent = Intent(this, ScoreActivity::class.java)

                    // This sends the score and total questions to the score screen
                    intent.putExtra("score", score)
                    intent.putExtra("total", QuestionAnswer.questions.size)

                    Log.d(
                        "QUESTION_ACTIVITY",
                        "Quiz finished. Final score is $score out of ${QuestionAnswer.questions.size}"
                    )

                    startActivity(intent)
                    finish()
                }
            }
        }

        // This loads the first question when the screen opens
        loadQuestion()
    }
}