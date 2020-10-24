// Rule 09. Locking
// LCK03_J. Do not synchronize on the intrinsic locks of high-level concurrency objects
private final Lock lock = new ReentrantLock();
 
public void doSomething() {
  lock.lock();
  try {
    // ...
  } finally {
    lock.unlock();
  }
}
