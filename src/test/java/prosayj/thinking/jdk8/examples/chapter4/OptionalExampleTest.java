package prosayj.thinking.jdk8.examples.chapter4;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalExampleTest {

    @Test
    public void examples() {
// BEGIN value_creation
        Optional<String> a = Optional.of("a");
        assertEquals("a", a.get());
// END value_creation

// BEGIN is_present
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> alsoEmpty = Optional.ofNullable(null);

        assertFalse(emptyOptional.isPresent());

// a is defined above
        assertTrue(a.isPresent());
// END is_present

// BEGIN orElse
        assertEquals("b", emptyOptional.orElse("b"));
        assertEquals("c", emptyOptional.orElseGet(() -> "c"));
// END orElse
    }

}
