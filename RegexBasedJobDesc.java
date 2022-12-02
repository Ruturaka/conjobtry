package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasedJobDesc {

    //1. Account manager - ohs, Account manager or Account SR Account manager -ohs--> Account Manager - OHS
    String regex="(SR, )?Account manager (-ohs)|Account ((manager)|(SR))?|(SR, )?Account manager";
    String regex2="CTO IT|Portfolio Sample|&1QA!QH|TE(ER|st|ch|)?|Test(Job|er|ing|qa)?|([0-7]+)|([A-I])+|a(a|b|c|d|s|f|z)|d+|desc(jobcode|descript)?|‘’|Conversison|JCode|Desc|JCodeDesc Mod|JCodeDesc|JD|JDESC|JDesc|JJ(J)+|JOB|JcodeDesc|Jdesc|Job Code Description|Job Description|Job by Roman|Job desc7|Job description|Job|JobCode|JobDesTesting|JobDesc|JobDescription|Q(A|Q|I|T|R|M)+||K|M|S(S|D)?|dev|(d|e|f|g|s|a)*|(w|g|h|i|k|u|t|j|[1-6])*|empDescription|jCodeDesc|jDesc|jo|job desc|job description|job|job1|job2|jobCodeDesc|jobcodedesc|jobcodedescchanged|jobcodedescr|jobcodesc|jobdesc|jobtestmodify|jpbdesc";
    String regex3="(?i)ACCOUNT REPRESENTATIVE";
    String regex4="(?i)ACCOUNTANT I";
    String regex5="(?i)ACCOUNTANT II";
    String regex6="(?i)Accounting Coordinator-Amco";
    String regex7="(?i)ACCOUNTS PAYABLE CLERK";
    String regex8="(?i)ActuarialAnalyst";
    String regex9="(?i)ACTUARY";
    String regex10="(?i)ADMIN SVCS COORD I";
    String regex11="(?i)admin";
    String regex12="(?i)ADMINISTRATIVE CLERK";
    String regex13="(?i)AIDE, HOME HEALTH";
    String regex14="(?i)analyst";
    String regex15="(?i)ANALYST, DATA";
    String regex16="(?i)AUDIOLOGIST";
    String regex17="(?i)BS&F Anl";
    String regex18="(?i)BS&F Conslt";
    String regex19="(?i)Behavioral Medicine Spec ((LCSW)|(\\(LCSW\\)))";
    String regex20="(?i)BEHAVIORAL MED SPEC \\(PSYCH\\)";
    String regex21="(?i)analyst";
    String regex22="(?i)Lab Asst I";
    String regex23="(?i)Lab Asst II";

    String transform(String attr, String attrToBeReplaced)
    {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(attr);


        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(attr);

        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(attr);

        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(attr);

        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(attr);

        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(attr);

        Pattern p7 = Pattern.compile(regex7);
        Matcher m7 = p7.matcher(attr);

        Pattern p8 = Pattern.compile(regex8);
        Matcher m8 = p8.matcher(attr);

        Pattern p9 = Pattern.compile(regex9);
        Matcher m9 = p9.matcher(attr);

        Pattern p10 = Pattern.compile(regex10);
        Matcher m10= p10.matcher(attr);

        Pattern p11 = Pattern.compile(regex11);
        Matcher m11 = p11.matcher(attr);

        Pattern p12 = Pattern.compile(regex12);
        Matcher m12 = p12.matcher(attr);

        Pattern p13 = Pattern.compile(regex13);
        Matcher m13 = p13.matcher(attr);

        Pattern p14 = Pattern.compile(regex14);
        Matcher m14 = p14.matcher(attr);

        Pattern p15 = Pattern.compile(regex15);
        Matcher m15 = p15.matcher(attr);

        Pattern p16 = Pattern.compile(regex16);
        Matcher m16 = p16.matcher(attr);

        Pattern p17 = Pattern.compile(regex17);
        Matcher m17 = p17.matcher(attr);


        Pattern p18 = Pattern.compile(regex18);
        Matcher m18 = p18.matcher(attr);

        Pattern p19 = Pattern.compile(regex19);
        Matcher m19 = p19.matcher(attr);

        Pattern p20 = Pattern.compile(regex20);
        Matcher m20 = p20.matcher(attr);

        Pattern p21 = Pattern.compile(regex21);
        Matcher m21 = p21.matcher(attr);

        Pattern p22 = Pattern.compile(regex22);
        Matcher m22 = p22.matcher(attr);

        Pattern p23 = Pattern.compile(regex23);
        Matcher m23 = p23.matcher(attr);

        if(m.matches())
            return m.replaceAll(attrToBeReplaced);
        else if(m2.matches())
            return m2.replaceFirst(attrToBeReplaced);
        else if(m3.matches())
            return m3.replaceFirst(attrToBeReplaced);
        else if(m4.matches())
            return m4.replaceFirst(attrToBeReplaced);
        else if(m5.matches())
            return m5.replaceFirst(attrToBeReplaced);
        else if(m6.matches())
            return m6.replaceFirst(attrToBeReplaced);
        else if(m7.matches())
            return m7.replaceFirst(attrToBeReplaced);
        else if(m8.matches())
            return m8.replaceFirst(attrToBeReplaced);
        else if(m9.matches())
            return m9.replaceFirst(attrToBeReplaced);
        else if(m10.matches())
            return m10.replaceFirst(attrToBeReplaced);
        else if(m11.matches())
            return m11.replaceFirst(attrToBeReplaced);
        else if(m12.matches())
            return m12.replaceFirst(attrToBeReplaced);
        else if(m13.matches())
            return m13.replaceFirst(attrToBeReplaced);
        else if(m14.matches())
            return m14.replaceFirst(attrToBeReplaced);
        else if(m15.matches())
            return m15.replaceFirst(attrToBeReplaced);
        else if(m16.matches())
            return m16.replaceFirst(attrToBeReplaced);
        else if(m17.matches())
            return m17.replaceFirst(attrToBeReplaced);
        else if(m18.matches())
            return m18.replaceFirst(attrToBeReplaced);
        else if(m19.matches())
            return m19.replaceFirst(attrToBeReplaced);
        else if(m20.matches())
            return m20.replaceFirst(attrToBeReplaced);
        else if(m21.matches())
            return m21.replaceFirst(attrToBeReplaced);
        else if(m22.matches())
            return m12.replaceFirst(attrToBeReplaced);
        else if(m23.matches())
            return m23.replaceFirst(attrToBeReplaced);
        else
            return "no match";
    }
}
