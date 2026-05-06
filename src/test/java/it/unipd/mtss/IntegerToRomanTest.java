////////////////////////////////////////////////////////////////////
// Giovanni Possenti 2137987
// Cristiano Antoniazzo 2138489
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberOneToRomanI() {
        //Arrange
        int numberToConvert = 1;
        String expectedRoman = "I";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberTwoToRomanII() {
        //Arrange
        int numberToConvert = 2;
        String expectedRoman = "II";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberThreeToRomanIII() {
        // Arrange
        int numberToConvert = 3;
        String expectedRoman = "III";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
        assertEquals(expectedRoman, actualRoman);
    }
}