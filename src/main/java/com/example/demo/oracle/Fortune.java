package com.example.demo.oracle;

public record Fortune(
        String title,
        String prophecy,
        String mood,
        String survivalTip,
        int dangerLevel,
        String color,
        String glitchMessage
) {
}
