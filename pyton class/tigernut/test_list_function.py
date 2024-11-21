
from unittest import TestCase
import list_function

class TestSumFunction(TestCase):
	def test_that_function_sumoflist_exit(self):
		list_function.get_sum([5]) 
	

	def test_that_sumoflist_function_return_value(self):
		actual = list_function.get_sum([2,3,4,5,6])
		expected = 20
		self.assertEqual(actual, 20)

	def test_that_sumoflist_function_negative_return_value(self):
		actual = list_function.get_sum([-2,-5,-6,-4,-6])
		expected = -23
		self.assertEqual(actual, -23)

	def test_that_sumoflist_function_positive_return_value(self):
		actual = list_function.get_sum([2,5,6,4,6])
		expected = 23
		self.assertEqual(actual, 23)