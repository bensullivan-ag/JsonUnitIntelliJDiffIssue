package net.javacrumbs.jsonunit.test.base;

import org.junit.jupiter.api.Test;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

public abstract class AbstractAssertJTest {

    @Test
    void jsonUnitShouldProvideIntelliJFailureDiff() {
        assertThatJson("{\"foo\":1, \"bar\":2}").isEqualTo("{\"b\":3, \"a\":1}");
    }
}
