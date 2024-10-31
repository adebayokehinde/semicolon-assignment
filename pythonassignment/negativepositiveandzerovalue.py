
 negative_count = 0
 positive_count = 0
 zero_count = 0

    for i in range (5):
         num = float (input ("Enter number {}:".format (i+1) ))

             if num < 0:
                  negative_count += 1
             elif num > 0:
                   positive_count += 1
             else:
                   zero_count += 1

        print ("\nSummary:")
        print ("Negative numbers: ", negative_count)
        print("Positive numbers: ", positive_count)
        print("Zeros: ", zero_count)

count_numbers ( )