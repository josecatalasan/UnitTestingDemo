package com.example.unittestingdemo

class CustomList {

    private var list : ArrayList<String>

    init{
        list = ArrayList()
    }

    fun isEmpty() : Boolean{
        return list.size == 0
    }

    fun size() : Int {
        return list.size
    }

    fun get(index : Int) : String {
        return ""
    }

    fun remove(index : Int){

    }

    fun insert(string : String){
        list.add(string)
    }

}