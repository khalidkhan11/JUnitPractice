
import org.example.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    static Person person1;
    static Person person2;
    @BeforeAll
    static void setup(){
         person1 = new Person("khalid",20);
         person2 = new Person("John",30);
         System.out.println("before each");
    }
    @Test
    void personName() {
        assertEquals("khalid", person1.getName());
    }

    @Test
    void testMultiple(){
        assertAll(
                "person2",
                () ->assertEquals("John", person2.getName()),
                () ->assertEquals(30, person2.getAge())
        );
    }

    @Test
    void testThis(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertTrue(numbers.stream()
                .mapToInt(number -> number.intValue())
                .sum() > 5, () -> "Sum should be greater than 5");
    }
}
