from unittest import TestCase
import twolistfunction

class Testtwolistfunction(TestCase):
	def test_that_twolist_function_exist(self):
		twolistfunction.get_merge([1, 2, 4, 5], [3, 6, 7, 8])

	def test_that_twolist_function_correct(self):
		actual = twolistfunction.get_merge([1, 2, 4, 5], [3, 6, 7, 8])
		expected = [1,2,3,4,5,6,7,8]
		self.assertEqual(actual, expected)

