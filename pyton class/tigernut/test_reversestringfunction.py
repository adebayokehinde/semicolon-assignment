from unittest import TestCase
import reversestringfunction

class TestReversestringfunctionFunction(TestCase):
	def test_that_reversestring_function_exist(self):
		reversestringfunction.reverse_string("hello")

	def test_that_reversestring_function_correct(self):
		actual = reversestringfunction.reverse_string("hello")
		expected = "olleh"
		self.assertEqual(actual, expected)