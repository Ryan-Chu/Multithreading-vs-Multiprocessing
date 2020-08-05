import time
import thread



def test(number):
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
        thread.start_new_thread(test, size)
    except:
        print "Error: Python thread"

def mdTest(dataSize):
    t = getCurrenttime()
    mdHandler(dataSize)
    return getCurrenttime() - t