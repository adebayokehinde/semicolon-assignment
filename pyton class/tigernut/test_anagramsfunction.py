from unittest import TestCase
import anagramsfunction

class TestAnagramsfunction(TestCase):
	def test_that_anagrams_function_exist(self):
		anagramsfunction.are_anagrams(listen)

	def test_that_anagrams_function_correct(self):
		actual = anagrams.are_anagrams(listen)
		expected = silenet
		self.assertEqual(actual, expected)