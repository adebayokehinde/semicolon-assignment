def get_merge(number_one, number_two: list):
     merged_list = number_one + number_two
     merged_list.sort() 
     return merged_list 

print(get_merge([1, 2, 4, 5], [3, 6, 7, 8]))