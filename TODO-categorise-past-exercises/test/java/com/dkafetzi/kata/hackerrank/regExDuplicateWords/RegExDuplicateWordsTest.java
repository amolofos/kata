package com.dkafetzi.kata.hackerrank.regExDuplicateWords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.regExDuplicateWords.RegExDuplicateWords;


class RegExDuplicateWordsTest {

	@Test
	@DisplayName("Replace all but first occurence of words")
	void testSimple(TestInfo testInfo) {

		String input = new StringBuilder()
				.append("5\n")
				.append("Goodbye bye bye world world world\n")
				.append("Sam went went to to to his business\n")
				.append("Reya is is the the best player in eye eye game\n")
				.append("in inthe\n")
				.append("Hello hello Ab aB")
				.toString();
		
		String expected_output = new StringBuilder()
				.append("Goodbye bye world\n")
				.append("Sam went to his business\n")
				.append("Reya is the best player in eye game\n")
				.append("in inthe\n")
				.append("Hello Ab")
				.toString();
		
		String output = RegExDuplicateWords.replaceAllButFirstOccurence(input);

		assertEquals(expected_output, output, "Strings do not patch.");
	}
}
