import subprocess
from subprocess import check_output, STDOUT, PIPE
import os

#Input: Name of Java file containing tests
#Return: Returns output Java file
#This method allows us to only have to call the Python file
#While getting results from a Java and C++ file.
def read_java_file(nameOffile, nameOffileCompile, size):
    #Compiles file
    subprocess.check_call(['javac', nameOffileCompile])
    #Execute Java file
    java_class,ext = os.path.splitext(nameOffile)
    cmd = 'java '+' '+ nameOffile + ' '+ str(size)
    f = os.popen(cmd)
    print(f.read())
    #proc = subprocess.Popen(cmd, stdout=PIPE, stderr=STDOUT)
    #stdout,stderr = proc.communicate(size)
read_java_file('JavaTest', 'JavaTest.java', 10000000)