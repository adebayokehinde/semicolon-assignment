from unittest import TestCase
import primefunction

class TestPrimeFunction(TestCase):
	def test_that_prime_function_exist(self):
		primefunction.is_prime([10])

	def test_that_prime_function_correct(self):
		actual = primefunction.is_prime([10])
		expected = true
		self.assertEqual(actual, true)