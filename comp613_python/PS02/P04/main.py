def knuth(n):

    """
     knuth(n): Returns a list of all the Knuth numbers < n
    """
    return list ( map( lambda x: (3**x -1)/2, 
                                            filter(lambda x: ((3**x -1)/2) < n, range(1,n) ) ) )

print(knuth(121))