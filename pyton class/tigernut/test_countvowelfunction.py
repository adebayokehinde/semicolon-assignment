from unittest import TestCase
import countvowelfunction

class TestCountVowelfunction(TestCase):
	def test_that_countvowel_function_exist(self):
		countvowelfunction.count_vowels(python is sweet)

	def test_that_countvowel_function_correct(self):
		actual = countvowelfunction.count_vowels([python is sweet])
		expected = 4
		self.assertEqual(actual, expected)