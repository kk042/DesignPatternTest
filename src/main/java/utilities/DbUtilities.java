package utilities;

public class DbUtilities {

  public DbUtilities() {
    System.out.println("DbUtilities constructor: " + this.hashCode());
  }

  public void runQuery() {
    System.out.println("select * from table");
  }


}
