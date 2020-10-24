// Rule 08. Visibility and Atomicity
// VNA00_J. Ensure visibility when accessing shared primitive variables
final class ControlledStop implements Runnable {
  private volatile boolean done = false;
  
  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }   
  }
 
  public void shutdown() {
    done = true;
  }
}
