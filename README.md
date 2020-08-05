This is a test to show the efficiency of multiprocessing vs multithreading in Java, Python and C++. Multiprocessing should be slower in Python due to GIL, while multithreading should be faster in Java and C++.
The repo is broken up into tests and the methods to call the Java and C++ files from python. There will be a main Python class that will use all functions. Prints out all return values which should show the speed of multiprocessing vs multithreading in low data use.
We're going to have two tests, one that will take longer and one that is shorter.
All tests are going to run 5 different for loops of 100**8 to check how long it takes.
