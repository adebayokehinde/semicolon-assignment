from unittest import TestCase
import evensumfunction


class TestEvensumFunction(TestCase):
	def test_that_evensum_function_exist(self):
		numbers = [1,2,3,4,5]
		evensum.get_sum(numbers)

	def test_that_evensumfunction_exist(self):
		actual = evensumfunction.sum(1,2,3,4,5)
		expected = 6
		self.assertEqual(actual, 6)

