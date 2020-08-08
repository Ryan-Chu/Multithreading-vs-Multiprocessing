import subprocess
from subprocess import check_output
import os

#Input: Name of Java file containing tests
#Return: Returns output Java file
#This method allows us to only have to call the Python file
#While getting results from a Java and C++ file.
def read_java_file(nameOffile, size):
    check_output('java {} {}'.format(nameOffile, size), shell=True)