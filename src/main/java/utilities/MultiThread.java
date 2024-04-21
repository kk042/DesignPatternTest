package utilities;

public class MultiThread extends Thread{


  public void run() {
    DbUtilitiesSingleton.getDbUtilitiesSingletonInstance();
    System.out.println("Thread is running");
  }
}
