from unittest import TestCase 

import square



class TestSquareFunction(TestCase):
	def test_that_square_function_exist(self):
		square.divide_or_square(10)


	def test_that_square_function_exist(self):
		actual = square.divide_or_square(10)
		expected = 3.16
		self.assertEqual(actual, expected)



	def test_that_square_function_correct_value(self):
		actual = square.divide_or_square(6)
		expected = 1.2
		self.assertEqual(actual, expected)

	def test_that_square_function_correct(self):
		actual = square.divide_or_square(-10)
		expected = 3.16
		self.assertEqual(actual, expected)


	def test_that_square_function_correct_values(self):
		actual = square.divide_or_square(-6)
		expected = -1.2
		self.assertEqual(actual, expected)



	def test_that_square_function_right_value(self):
		actual = square.divide_or_square(10.5)
		expected = 2.1
		self.assertEqual(actual, expected)

	def test_that_square_function_correct_number(self):
		actual = square.divide_or_square(-6.5)
		expected = -1.3
		self.assertEqual(actual, expected)


	def test_that_square_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, square.divide_or_square , "moses")


	def test_that_cube_function_raise_exception_with_invalid_enterd(self):
		self.assertRaises(TypeError,  square.divide_or_square , "   ")







class TestFutureInvestment(TestCase):
	def test_that_future_investment_function_exist(self):
		square.get_future_investment(100, 50, 2)

	def test_that_future_investment_function_exist(self):
		actual = square.get_future_investment(100, 50, 2)
		expected = 219.5
		self.assertEqual(actual, expected)

	def test_that_future_investment_function_correct_value(self):
		actual = square.get_future_investment(100, -50, 2)
		expected = 219.5
		self.assertEqual(actual, expected)


	def test_that_future_investment_function_value(self):
		actual = square.get_future_investment(100, 50, -2)
		expected = 45.5
		self.assertEqual(actual, expected)