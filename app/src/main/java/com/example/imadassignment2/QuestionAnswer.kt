package com.example.imadassignment2

object QuestionAnswer {

    /*
     These questions were created from research about common technology myths and facts.

     Sources used:
     - 12th Man Technology. (n.d.). Busting 10 Tech Myths.
     - Inceptor. (n.d.). Tech Myths and Facts.

     I rewrote the information into my own quiz-style statements.
    */

    //This array stores all the quiz questions
    val questions = arrayOf(
        "More megapixels always mean a better camera.",
        "Incognito mode makes you completely anonymous online.",
        "Charging your phone overnight always damages the battery.",
        "Strong passwords help protect your accounts.",
        "Taking regular breaks while using devices improves focus."
    )

    // This array stores the answer choices for each question
    val choices = arrayOf(
        arrayOf("Fact", "Myth"),
        arrayOf("Fact", "Myth"),
        arrayOf("Fact", "Myth"),
        arrayOf("Fact", "Myth"),
        arrayOf("Fact", "Myth")
    )

    // This array stores the correct answers
    val correctAnswers = arrayOf(
        "Myth",
        "Myth",
        "Myth",
        "Fact",
        "Fact"
    )

    // This array stores explanations for the review section
    val explanations = arrayOf(
        "Camera quality also depends on the lens, sensor, lighting and software.",
        "Incognito mainly hides browsing history on your own device, but it does not make you fully anonymous online.",
        "Many modern phones manage charging once the battery reaches full level.",
        "Strong passwords help make accounts harder to access without permission.",
        "Short breaks can help the mind rest and improve focus."
    )
}