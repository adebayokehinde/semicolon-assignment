def remove_element(lst, element):
    """
    Removes the first occurrence of the specified element from the list.

    Args:
        lst (list): The input list.
        element: The element to be removed.

    Returns:
        list: The updated list after removal.
    """
    if element in lst:
        lst.remove(element)
    return lst


