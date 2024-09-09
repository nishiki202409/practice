public class Book extends TengibleAsset{
  privte String isbn;
  public Book(String name,int price, String isbn){
	super(name,price,color);
	this.isbn = isbn;
  }

  public String getIsbn(){ return this.isbn;}

}
