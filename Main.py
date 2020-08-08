from mdPythonTest import mdtest, getCurrenttime, mdHandler, mdTest
from mpPythonTest import mptest, getCurrenttime, processHandler, MPtest
from readJavafromPython import read_java_file

nameOffile = 'JavaTest'
dataSize = 10**8

print('This is the speed for multithreading in Python: '+str(mdTest(dataSize)))
print('This is the speed for multiprocessing in Python'+str(MPtest(dataSize)))
read_java_file(nameOffile, dataSize)