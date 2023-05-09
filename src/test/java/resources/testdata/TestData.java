package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Register details")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Riya","Malik", "United Kingdom", "York", "29 Windhill" , "tn4 1hj", "79564789123"},

        };
        return data;
    }
}
