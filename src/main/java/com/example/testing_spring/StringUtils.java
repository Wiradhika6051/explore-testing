package com.example.testing_spring;

public final class StringUtils{
    private StringUtils(){}

    public static boolean isBlank(String s){
        return s== null || s.trim().isEmpty();
    }

    public static String normalizeWhiteSpace(String s){
        if(s==null)return null;
        return s.trim().replaceAll("\\s+"," ");
    }   
}