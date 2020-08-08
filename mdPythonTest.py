import time
import threading



def mdtest(number):
    a = ""
    for n in range(number):
        a = a + " "

#Checks time
def getCurrenttime():
    return time.time()

#Input: size of test
#Only does function with one thread
def mdHandler(size):
    try:
        #Needs to have 2 threads for multithreading to check multiprocessing
        threading.start_new_thread(mdtest, size)
        threading.start_new_thread(mdtest, size)
    except:
        print ("Error: Python thread")

def mdTest(dataSize):
    t = getCurrenttime()
    mdHandler(dataSize)
    return getCurrenttime() - t