/*
 * See compare-the-triplets-English.pdf under the
 * src/main/resources/com/dkafetzi/hackerrank/compareTheTriplets folder.
 *
 */
package com.dkafetzi.kata.hackerrank.compareTheTriplets;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		int score_a = 0;
		int score_b = 0;

		int size = a.size();

		if (size != b.size()) {
			// Should we throw an error?
			return result;
		}

		// Calculate the score.
		for (int i = 0; i < size; i++) {
			if (a.get(i) > b.get(i)) {
				score_a++;
			} else if (a.get(i) < b.get(i)) {
				score_b++;
			}
		}

		// Prepare the dataset.
		result.add(0, score_a);
		result.add(1, score_b);

		return result;
	}

}