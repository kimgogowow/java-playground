package com.kim.leetcode;

/**
 * Write a bash script to calculate the
 * frequency
 *  of each word in a text file words.txt.
 *
 * For simplicity sake, you may assume:
 *
 * words.txt contains only lowercase characters and space ' ' characters.
 * Each word must consist of lowercase characters only.
 * Words are separated by one or more whitespace characters.
 *
 * The original requirement was to use one-line Unix pipes in bash,
 * the answer is:
 * cat words.txt | tr -s ' ' '\n'|sort|uniq -c|sort -r|awk '{print $2, $1}'
 *
 * ////////here I wanna read from local file and do it by java
 */
public class WordFrequency {
    //create a file and script things from any website
    //read the file and do the calculation
    //print the result

}
