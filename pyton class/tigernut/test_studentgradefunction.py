from unittest import TestCase
import studentgradefunction

class TestStudentgradeFunction(TestCase):
	def test_that_function_studentgrade_exit(self):
		studentgrade_function.get_grade(10) 