package com.example.unittestingdemo

class UrlUtils {

    fun makeUrl(schema : String, baseUrl : String, path : String) : String{
        return String.format("%s://%s/%s", schema, baseUrl, path)
    }

    fun displayUrl(url : String){
        println(url)
    }
}