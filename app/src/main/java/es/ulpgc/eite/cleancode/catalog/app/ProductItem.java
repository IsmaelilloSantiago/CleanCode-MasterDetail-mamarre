package es.ulpgc.eite.cleancode.catalog.app;


public class ProductItem {

  public final int id;
  public final int id1;
  public final String content;
  public final String details;

  public ProductItem(int id1,int id, String content, String details) {
    this.id = id;
    this.id1 = id1;
    this.content = content;
    this.details = details;
  }

  @Override
  public String toString() {
    return content;
  }
}