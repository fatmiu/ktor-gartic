package com.miumiu.other

import java.io.File

val words = readWordList("resources/programmers_wordlist.txt")
fun readWordList(fileName: String): List<String> {
    val inputStream = File(fileName).inputStream()
    val words = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { words.add(it) }
    return words
}

fun getRandomWords(amount: Int): List<String> {
    var curAmount = 0
    val result = mutableListOf<String>()
    while (curAmount < amount) {
        val word = words.random()
        if (!result.contains(word)) {
            result.add(word)
            curAmount++
        }
    }
    return result
}

/**
 * example: apple juice
 * a p p l e  j u i c e
 * _ _ _ _ _  _ _ _ _ _
 */
fun String.transformToUnderscores() =
    toCharArray().map {
        if (it != ' ') '_' else ' '
    }.joinToString { " " }