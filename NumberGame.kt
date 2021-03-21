package com.zumatrahia.deneme

import java.lang.Exception

var trueAnswer = (1..3).random()
var answer : Any? = 0

fun main(){
    try { while (true) {
            println("Guess Number???")
            answer = readLine()
            if (answer == "qqq") break
            answer = answer.toString().toInt()
            if (answer != trueAnswer) continue
            else {
                println("You Guessed Correctly!!!")
                trueAnswer = (1..3).random()
                continue
            }
        }
    }
    catch (e: Exception){
        println("!!! Enter Number !!!")
        main()
    }
    println("!!!You exited Game!!!")
}
