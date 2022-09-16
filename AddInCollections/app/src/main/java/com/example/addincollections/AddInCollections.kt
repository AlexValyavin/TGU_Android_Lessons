package com.example.addincollections

    fun main(){
        var coll = mutableListOf<Int>() //объявление коллекции
        for(i in 0..9){                 //цикл заполнения коллекции
            coll.add(i)
        }
        printCollections(coll)
    }

    fun printCollections(list: MutableList<Int>){
        print("Заполненная с помощью цикла коллекция: ")
        for (i in list){                //вывод на экран всех значений коллекции
            print("$i ")
        }
    }