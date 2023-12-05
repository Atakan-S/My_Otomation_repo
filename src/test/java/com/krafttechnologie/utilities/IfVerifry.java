package com.krafttechnologie.utilities;

public class IfVerifry {
    public static void equalsTest(String actualData,String expectedData){
        if (actualData.equals(expectedData)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }

}
