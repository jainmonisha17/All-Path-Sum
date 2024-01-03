# All-Path-Sum
Given a binary tree and a number ‘S’, find all paths from the root to the leaf  such that the sum of all the node values of each path equals ‘S’.

                                                                    12     Sum: 23

                                                             7              1

                                                      4            10            5


                                                                     12     

                                                             7              1      Sum: 11

                                                      4            10            5


                                                      
                                                                     12     

                                                             7              1        

                                                      4            10            5      Sum: 4 


                                                      Sum: 23 - 12 = 11
                                                      Sum: 11 - 7 = 4
                                                      Sum: 4 - 4 = 0

                                                      Tree paths with sum 23: [[12, 7, 4], [12, 1, 10]]
