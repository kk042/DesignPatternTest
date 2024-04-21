package utilities;

public class DbUtilitiesSingleton {

  private static DbUtilitiesSingleton dbUtilitiesSingleton = new DbUtilitiesSingleton();
  private DbUtilitiesSingleton() {
    System.out.println("DbUtilities constructor: " + this.hashCode());
  }
public static DbUtilitiesSingleton getDbUtilitiesSingletonInstance() {
    return dbUtilitiesSingleton;
  }
  public void runQuery() {
    System.out.println("select * from table");
  }

  public static void m(){
    System.out.println("test static method");
  }
}
