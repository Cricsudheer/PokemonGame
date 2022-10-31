package com.example.pokemongame.service;

import org.springframework.stereotype.Service;

@Service
public class GeneralService {
    // removing extraspaces and making first character of every charcter after namespace capital

    public  String formattedString(String demoString){

         demoString = demoString.toLowerCase();
         demoString=demoString.trim();
        System.out.println(demoString);
         char[] charArray = demoString.toCharArray();
         charArray[0]=Character.toUpperCase(charArray[0]);
         for(int i =1 ; i<charArray.length ; i++){
             if(Character.isWhitespace(charArray[i-1]) && Character.isAlphabetic(charArray[i])){
                 charArray[i]=Character.toUpperCase(charArray[i]);
             }
         }
         demoString = String.valueOf(charArray);


        return demoString ;
    }
}
