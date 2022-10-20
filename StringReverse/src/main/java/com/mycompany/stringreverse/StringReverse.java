/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringreverse;

/**
 *
 * @author jeffe
 */
import java.util.Stack;
public class StringReverse {

    public static void main(String[] args) {
        String thestring="This is Jeff's first git Project";
        System.out.println("Original:\t"+thestring);
        char[] reversed=new char[thestring.length()];
        
        Stack thestack=new Stack();
        
        for(int i=0;i<thestring.length();i++){
            thestack.push(thestring.charAt(i));
        }
        
        for(int i=0;i<thestring.length();i++){
            reversed[i]=(char)thestack.pop();
         }
        thestring=String.valueOf(reversed);
        
    }
}
