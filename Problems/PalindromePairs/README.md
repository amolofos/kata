# Question: PalindromePairs
> Given a list of unique words, return all the pairs of the distinct
> indices (i, j) in the given list, so that the concatenation of the
> two words words[i] + words[j] is a palindrome.
>
> Example 1:
> Input: words = ["abcd","dcba","lls","s","sssll"]
> Output: [[0,1],[1,0],[3,2],[2,4]]
> Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
>
> Example 2:
> Input: words = ["bat","tab","cat"]
> Output: [[0,1],[1,0]]
> Explanation: The palindromes are ["battab","tabbat"]
>
> Example 3:
> Input: words = ["a",""]
> Output: [[0,1],[1,0]]
>
> Constraints:
>  * 1 <= wods.length <= 5000
>  * 0 <= words[i].length <= 300
>  * words[i] consists of lower-case English letters.
>

# Scope
* Showcase hashmap knowledge
* Showcase problem solving skills
Can they present the problem domain and the different scenarios?
* Write code is a bigger than usual chunk of work
How effortless and clean does he/she write?
Can he/she go through it with an example and follow its flow?

# Script
* Allow the candidate to start and showcase his thought.
* Restrictions
 * Words: English alphabet.
 * words.length: Integer.MAX.
 * each word is unique. This implies that the empty string can appear only once.
* Probably he/she will find the double loop to go through all the element combinations
Can he derive the time complexity? Does he take into account the various commands to check for palindrome case?
The complexity here would be `words.length^2 * words[i].length`.
* Guide them to reduce the time complexity.
Can they find that the length of a word is kind of restricted in the english alphabet?
Base on the above assumption, words.length >> words[i].length.
  * Can he/she break down the domain cases?
    * One element is empty string
    * The full reverse string exists
    * The palindrome is constructed half/half, i.e. it needs a specific string to complete it.
Guide them on how to avoid double loop through the array. I.e. hashmap/hashset.

# Edge cases
* One element of the list is an empty string.
This means that the cartesian product of that element with all the rest is included in the results.
* Empty input array
* Array with only one element

# Solutions
* Brute force with double+ loop
Check each element with all the other elements of the input array. Store the results in a list.
In this case we will have two dependent loops so we can compare all the elements together. Inside,
the second loop we will check the4 i+j, j+i word combination compairing each character of the combined word.
Time O(n * n * 2*mean_word_size/2) => Ο(n^2 * mean_word_size), Space O(1) (since we do not count the return list)
* Hashmap
Loop through the array and store the string and index in `hashmap<string, index>`.
Then loop through the words array one by one. For each one of them we need to find out whether
 * there is a full mirror, i.e. the same string in reverse exists in the array
 * there is a partial mirror, i.e. some part of the string is already a palidrome. We search for the rest of the string
   Can we find a reverse to complete a palindrome?
 * handle empty string case
* Trie, Radix Tree
I have not taken a look at these solutions.

# Sources
## LeetCode
336. Palindrome Pairs https://leetcode.com/problems/palindrome-pairs/
* Hard difficulty
