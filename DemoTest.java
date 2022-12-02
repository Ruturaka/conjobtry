package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DemoTest {

    RegexBasedCountry underTest = new RegexBasedCountry();

    RegexBasedJobDesc underTest2 = new RegexBasedJobDesc();

    @Test
    void ToCheck()
    {
        //given
        String Country="US";
        String ConReplace="United States of America";

        String JobDes="SR, Account manager";
        String JobReplace="Account Manager - OHS";

        System.out.println("Before Test: \ncountry: "+Country);
        System.out.println("Job Description: "+JobDes);

        //when
        String result = underTest.transform(Country, ConReplace);
        String result2 = underTest2.transform(JobDes, JobReplace);
        System.out.println("\nAfter Test:\ncountry: "+result);
        System.out.println("Job Description: "+result2);

        //then
        String conExpected = "United States of America";
        assertThat(result).isEqualTo(conExpected);

        String JobExpected="Account Manager - OHS";
        assertThat(result2).isEqualTo(JobExpected);
    }
}
