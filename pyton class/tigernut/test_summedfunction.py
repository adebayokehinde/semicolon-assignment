from unittest import TestCase
import summedfunction

class TestSummedFunction(TestCase):
	def test_that_get_sum_function_exist(self):
		summedfunction.get_sum([1,2,3,4,5])

	def test_that_get_sum_function_correct(self):
		actual = summedfunction.get_sum([1,2,3,4])
		expected = 30
		self.assertEqual(actual, expected)



