from unittest import TestCase
import averagefunction

class TestAverageFunction(TestCase):
	def test_that_average_function_exist(self):
		averagefunction.calculate_average([10,20,30,40,50])

	def test_that_average_function_correct(self):
		actual = averagefunction.calculate_average([10,20,30,40,50])
		expected = 30.0
		self.assertEqual(actual, expected)