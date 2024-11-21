from unittest import TestCase 

import evensumfunction



class TestEvensumFunction(TestCase):
	def test_that_evensum_function_exist(self):
		evensumfunction.even_sum_numbers([1,2,3,4,5])


	def test_that_evensum_function_correct(self):
		actual = evensumfunction.even_sum_numbers([1,2,3,4,5])
		expected = 6
		self.assertEqual(actual, expected)