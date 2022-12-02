package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasedCountry {

    String regex = "((?i)india)|((?i)IND)";
    String regex2="((?i)us|california|United States)";
    String regex3="cameroon";
    String regex4="uk|UK";
    String regex5="(?i)TrinidadTRO";
    String regex6="(?i)afg";
    String regex7="(?i)arg";
    String regex8="(?i)xxx|111|country";

    String transform(String attr, String attrToBeReplaced)
    {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(attr);

        Pattern p2= Pattern.compile(regex2);
        Matcher m2=p2.matcher(attr);

        Pattern p3= Pattern.compile(regex3);
        Matcher m3=p3.matcher(attr);

        Pattern p4= Pattern.compile(regex4);
        Matcher m4=p4.matcher(attr);

        Pattern p5= Pattern.compile(regex5);
        Matcher m5=p5.matcher(attr);

        Pattern p6= Pattern.compile(regex6);
        Matcher m6=p6.matcher(attr);

        Pattern p7= Pattern.compile(regex7);
        Matcher m7=p7.matcher(attr);

        Pattern p8= Pattern.compile(regex8);
        Matcher m8=p8.matcher(attr);


        if(m.matches()) {
            return m.replaceAll(attrToBeReplaced);
        }
        else if(m2.matches())
        {
            return m2.replaceAll(attrToBeReplaced);
        }
        else if(m3.matches())
        {
            return m3.replaceAll(attrToBeReplaced);
        }
        else if(m4.matches())
        {
            return m4.replaceAll(attrToBeReplaced);
        }
        else if(m5.matches())
        {
            return m5.replaceAll(attrToBeReplaced);
        }
        else if(m6.matches())
        {
            return m6.replaceAll(attrToBeReplaced);
        }
        else if(m7.matches())
        {
            return m7.replaceAll(attrToBeReplaced);
        }
        else if(m8.matches())
        {
            return m8.replaceAll(attrToBeReplaced);
        }
        else
            return "no match";
    }
}
