package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){

        //  key       =   value
        //  os.name   =    Mac OS X
        //  user.name =    Selma
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));  //output: Mac OS X
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));  //output: Selma
    }
}
