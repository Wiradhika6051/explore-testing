package com.example.testing_spring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpringUtilsTest {
    @Test
    void isBlank_returnsTrueForNullOrEmpty(){
        assertThat(StringUtils.isBlank(null)).isTrue();
        assertThat(StringUtils.isBlank("")).isTrue();
        assertThat(StringUtils.isBlank("  ")).isTrue();
        assertThat(StringUtils.isBlank(" a ")).isFalse();
    }

    @Test
    void normalizeWhiteSpace_trimsAndReduceSpaces(){
        String input = "  This   is  a \t  test\n  ";
        String normalized = StringUtils.normalizeWhiteSpace(input);
        assertThat(normalized).isEqualTo("This is a test");
    }
}