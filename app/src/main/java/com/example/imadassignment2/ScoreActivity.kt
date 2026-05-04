package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This connects my Kotlin code to the score screen layout
        setContentView(R.layout.activity_score)

        // These connect the score screen items from the XML file
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val tvScoreFeedback = findViewById<TextView>(R.id.tvScoreFeedback)
        val btnReview = findViewById<Button>(R.id.btnReview)
        val btnRestart = findViewById<Button>(R.id.btnRestart)

        // This receives the score and total questions from the question screen
        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", QuestionAnswer.questions.size)

        // This displays the final score
        tvScore.text = "Your score: $score/$total"

        // This gives feedback depending on how well the user did
        tvScoreFeedback.text = if (score >= 4) {
            "Truth Master! You understand these tech myths very well."
        } else {
            "Keep Checking! Some tech myths can be tricky."
        }

        Log.d("SCORE_ACTIVITY", "Final score is $score out of $total")

        // This shows all questions, correct answers and explanations
        btnReview.setOnClickListener {
            Log.d("SCORE_ACTIVITY", "The user clicked View Correct Answers")

            val reviewText = buildReviewText()

            AlertDialog.Builder(this)
                .setTitle("Correct Answers")
                .setMessage(reviewText)
                .setPositiveButton("OK", null)
                .show()
        }

        // This restarts the quiz and takes the user back to the welcome screen
        btnRestart.setOnClickListener {
            Log.d("SCORE_ACTIVITY", "The user clicked Try Again")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    // This builds the review text using the questions, answers and explanations
    private fun buildReviewText(): String {
        val review = StringBuilder()

        for (i in QuestionAnswer.questions.indices) {
            review.append("${i + 1}. ${QuestionAnswer.questions[i]}\n")
            review.append("Correct answer: ${QuestionAnswer.correctAnswers[i]}\n")
            review.append("Explanation: ${QuestionAnswer.explanations[i]}\n\n")
        }

        return review.toString()
    }
}