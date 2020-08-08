import multiprocessing
import time
from multiprocessing import process

#Input: fixed input from/see process_handler()
#Python function we're measuring
def mptest(number):
    a = ""
    for n in range(number):
        a = a + " "

#Checks time
def getCurrenttime():
    return time.time()

#Input: Any number, need big numbers
def processHandler(size):
    #Need to run process twice to check multiprocessing vs multithreading
    multiprocessing.Process(target=mptest, args = size)
    multiprocessing.Process(target=mptest, args = size)

def MPtest(dataSize):
    t = getCurrenttime()
    processHandler(dataSize)
    return getCurrenttime() - t