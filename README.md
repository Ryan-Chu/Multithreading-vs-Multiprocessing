This is a test to show the efficiency of multiprocessing vs multithreading in Java, Python and C++. Multiprocessing should be slower in Python due to GIL, while multithreading should be faster in Java and C++.
The repo is broken up into tests and the methods to call the Java and C++ files from python. Prints out all return values which should show the speed of multiprocessing vs multithreading in low data use.