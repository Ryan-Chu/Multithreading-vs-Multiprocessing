This is a test to show the efficiency of multiprocessing vs multithreading in Java, Python and C++. Multiprocessing should be slower in Python due to GIL, while multithreading should be faster in Java and C++.
The repo is broken up into tests and the methods to call the Java and C++ files from python. There will be a main Python class that will use all functions. Prints out all return values which should show the speed of multiprocessing vs multithreading in low data use.
We're going to have two tests, one that will take longer and one that is shorter.
All tests are going to run 5 different for loops of 100**8 to check how long it takes.

Problems: 
1. I have to develop a way to open Java and C++ files from Python. 
2. Too complicated to return the times from the Java file into the Python file so I'm going to print all the times with messages in the console.
3. Realized I can't implement multiprocessing without going to extremes due to each JVM only doing one process.
4. Because of 3. I'm only going to implement multithreading in java and C++ as a test and will check multiprocessing and multithreading with Python only.