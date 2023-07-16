package selfStudyJava.july.testing.selfStudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTwoTest {

    @Test
    void simpleTests() {
        var grader = new ExampleTwo();
        assertEquals('F', grader.determineLetterGrade(59));
        assertEquals('A', grader.determineLetterGrade(199));
        assertEquals('A', grader.determineLetterGrade(90));
        assertEquals('B', grader.determineLetterGrade(80));
        assertEquals('C', grader.determineLetterGrade(70));
    }

    void NegativeOneShouldReturnIllegalArgumentException(){
        var grader = new ExampleTwo();
        assertThrows(IllegalArgumentException.class,
                () -> grader.determineLetterGrade(-1));
    }

}