package gt.edu.umg.ingenieria.sistemas.isht3ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class mainTest {
    
    public mainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void BasicInput_BasicOutput(){
        // given
        String input = "elosoosole";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #1 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void EmptyInput_TrueOutput(){
        // given
        String input = "";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #2 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void UnevenInput_BasicOutput(){
        // given
        String input = "1231321";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #3 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void StringWithSpace_BasicOutput(){
        // given
        String input = " osooso ";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #4 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void MixedCaseInput_FalseOutput(){
        // given
        String input = "Oso";
        Boolean expectedResult = false;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #5 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void UpperCaseInput_BasicOutput(){
        // given
        String input = "OSO";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #6 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void SpecialCharactersInput_BasicOutput(){
        // given
        String input = "@*-+||+-*@";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #7 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void SingleCharacterInput_BasicOutput(){
        // given
        String input = "A";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #8 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void TabbedInput_BasicOutput(){
        // given
        String input = "\t\toso\t\t";
        Boolean expectedResult = true;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #9 FAILED!!!", expectedResult == actualResult);
    }
    
    @Test
    public void LargeInput_BasicOutput(){
        // given
        String input = Integer.toString(Integer.MAX_VALUE);
        Boolean expectedResult = false;

        // when
        Boolean actualResult = main.evaluate(input);
        
        // then
        assertTrue("TEST #9 FAILED!!!", expectedResult == actualResult);
    }
}