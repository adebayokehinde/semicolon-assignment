from unittest import TestCase
import palindromefunction

class TestPalindromeFunction(TestCase):
	def test_that_palindrome_function_exist(self):
		palindromefunction.is_palindrome("madam")

	def test_that_palindrome_function_correct(self):
		actual = palindromefunction.is_palindrome("madam")
		expected = true
		self.assertEqual(actual, expected)