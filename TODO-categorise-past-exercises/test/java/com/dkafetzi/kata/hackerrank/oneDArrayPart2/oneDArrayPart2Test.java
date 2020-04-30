package com.dkafetzi.kata.hackerrank.oneDArrayPart2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.oneDArrayPart2.OneDArrayPart2;

class OneDArrayPart2Test {

	@Test
	@DisplayName("Test")
	void testSimple(TestInfo testInfo) {
		//       leap,         array,                 win
		int[][][] data = {
				{{1}, {0, 1, 0},                      {0}},
				{{3}, {0, 0, 0, 0, 0},                {1}},
				{{5}, {0, 0, 0, 1, 1, 1},             {1}},
				{{3}, {0, 0, 1, 1, 1, 0},             {0}},
				{{2}, {0, 1, 0, 1, 0, 1},             {1}},
				{{4}, {0, 1, 1, 0, 0, 1, 1, 0, 1},    {1}},
				{{6}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0}},
				{{3}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {1}}
		};

		int leap;
		int[] game;
		boolean expected_win;
		for (int case_i = 0; case_i < data.length; case_i++) {
			leap = data[case_i][0][0];
			game = data[case_i][1];
			expected_win = (data[case_i][2][0] == 1);
			
			System.out.println("Test: " + case_i + " with leap = " + leap + ", length = " + game.length + " expected outcome = " +  expected_win);
			assertEquals(expected_win, OneDArrayPart2.canWin(leap, game), "Unexpected outcome.");
		}
	}
}
