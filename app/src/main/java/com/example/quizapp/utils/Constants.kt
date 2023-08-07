package com.example.quizapp.utils

import com.example.quizapp.model.Question
import com.example.quizapp.R
object Constants {
    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answer"
    fun getQuestions():MutableList<Question>{
        val questions = mutableListOf<Question>()
        val question1 = Question(
            1,"What country does this flag belong?",
            R.drawable.argentina_flag,"Argentina","India","Iran",
            "Ireland",1
        )
        val question2 = Question(
            2,"What country does this flag belong?",
            R.drawable.brazil_flag,"Afghanistan","Brazil","China",
            "USA",2
        )
        val question3 = Question(
            3,"What country does this flag belong?",
            R.drawable.finland_flag,"Sweden","Finland","Norway",
            "Japan",2
        )
        val question4 = Question(
            4,"What country does this flag belong?",
            R.drawable.france_flag,"UK","Poland","France",
            "Turkey",3
        )
        val question5 = Question(
            5,"What country does this flag belong?",
            R.drawable.germany_flag,"England","Germany","Denmark",
            "Uzbekistan",2
        )
        val question6 = Question(
            6,"What country does this flag belong?",
            R.drawable.haiti_flag,"Tajikistan","Pakistan","Haiti",
            "Canada",3
        )
        val question7 = Question(
            7,"What country does this flag belong?",
            R.drawable.india_flag,"South Korea","Vietnam","Switzerland",
            "India",4
        )
        val question8 = Question(
            8,"What country does this flag belong?",
            R.drawable.italy_flag,"Italy","Columbia","Bangladesh",
            "Nigeria",1
        )
        val question9 = Question(
            9,"What country does this flag belong?",
            R.drawable.spain_flag,"Canada","Spain","Nepal",
            "None of them",2
        )
        val question10 = Question(
            10,"What country does this flag belong?",
            R.drawable.romania_flag,"Spain","Romania","Poland",
            "China",2
        )
        questions.add(question1)
        questions.add(question2)
        questions.add(question3)
        questions.add(question4)
        questions.add(question5)
        questions.add(question6)
        questions.add(question7)
        questions.add(question8)
        questions.add(question9)
        questions.add(question10)
        return questions
    }
}