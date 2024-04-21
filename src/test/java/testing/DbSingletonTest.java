package testing;

import org.testng.annotations.Test;
import utilities.DbUtilities;
import utilities.DbUtilitiesSingleton;
import utilities.MultiThread;

public class DbSingletonTest {

  DbUtilitiesSingleton dbUtilitiesSingleton = DbUtilitiesSingleton.getDbUtilitiesSingletonInstance();
@Test
public void testMultiThread(){

  for(int i=0;i<50;i++)
    {
      MultiThread multiThread = new MultiThread();
      multiThread.start();
    }
}

  @Test
  public void dbTest() {
    dbUtilitiesSingleton.runQuery();
    System.out.println("DbUtilTestsinglton test");
    dbUtilitiesSingleton.m();
    DbUtilitiesSingleton.m();
  }


  @Test
  public void dbTest1() {
    dbUtilitiesSingleton.runQuery();
    System.out.println("DbUtilTestsinglton test");
  }

  @Test
  public void dbTest2() {
    dbUtilitiesSingleton.runQuery();
    System.out.println("DbUtilTestsinglton test");
  }
  @Test
  public void dbTest3() {
    dbUtilitiesSingleton.runQuery();
    System.out.println("DbUtilTestsinglton test");
  }
  @Test
  public void dbTest4() {
    dbUtilitiesSingleton.runQuery();
    System.out.println("DbUtilTestsinglton test");
  }
}
