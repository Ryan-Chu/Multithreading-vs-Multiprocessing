This is a test to show the efficiency of multiprocessing vs multithreading in Java and Python with only one of each. Multiprocessing should be slower in Python due to GIL, while multithreading should be faster in Java.
The repo is broken up into tests and the methods to call the Java and C++ files from python. There will be a main Python class that will use all functions. Prints out all return values which should show the speed of multiprocessing vs multithreading in low data use.
We're going to have two tests, one that will take longer and one that is shorter.
All tests are going to run 5 different for loops of 100**8 to check how long it takes.

Problems: 
1. Needed develop a way to open Java files from Python. 
2. Too complicated to return the run times from the Java file into the Python file so printing all the run times with messages in the console.
3. Very complicated to run a singular method from processbuilder for multiprocessing, as it is generally used to invoke os arguments not singular things. Forces us to move basic test to it's own class so we can just call that entire class.
4. Run does not pass in any parameters so need to switch to runnable interface.
5. Changed project to not include C++ due difficulties in multiprocessing within C++.
6. Speeds for Java multiprocessing may not be accurate as they are not tested. Tried to put a Future/Promise by adding a lock but couldn't get it to work.
Change: 
1. Realized the multithreading and multiprocessing in Python was only using one of each. Same thing is currently being done for Java and C++. Need to implement to 2 processes and 2 threads.