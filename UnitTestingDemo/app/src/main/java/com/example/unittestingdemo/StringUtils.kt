package com.example.unittestingdemo

class StringUtils() {

    lateinit var utils : UrlUtils

    init{
        //utils = UrlUtils()
    }

    constructor(utils:UrlUtils):this(){
        this.utils = utils
    }

    fun concatTwoStrings(string1 : String, string2: String) : String{
        return String.format("%s %s", string1, string2)
    }

    fun isStringProperLength(s1 : String) : Boolean{
        return s1.length > 4
    }

    fun getQueryUrl(queryParam : String, schema : String, baseUrl : String, path : String) : String{
        return String.format("%s/?%s", utils.makeUrl(schema, baseUrl, path), queryParam)
    }

    fun printUrlToConsole(url : String, timesToRun : Int){
        for(i in 1..timesToRun){
            utils.displayUrl(url)
        }
    }
}