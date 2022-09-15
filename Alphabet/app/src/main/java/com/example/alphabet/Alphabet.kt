package com.example.alphabet

    fun main(){
        val alphabet = mutableListOf<Char>()
        val i ='я'
        val counter = 'а'
        for(count in counter..i){
            alphabet.add(count)
        }

        for (char in alphabet){
            print("$char ")
        }
    }
