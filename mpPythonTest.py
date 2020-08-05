import multiprocessing
import time
from multiprocessing import process

#Input: fixed input from/see process_handler()
#Python function we're measuring
def test(number):
    a = ""
    for n in range(number):
        a = a + " "

#Checks time
def getCurrenttime():
    return time.time()

#Input: Any number, need big numbers
def processHandler(size):
    multiprocessing.Process(target=test, args = size)

def MPtest(dataSize):
    t = getCurrenttime()
    processHandler(dataSize)
    return getCurrenttime() - t