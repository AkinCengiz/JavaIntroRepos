package org.akincengiz.bookshelf;

public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		author.setFirstName("Victor");
		author.setLastName("HUGO");
		
		Author author2 = new Author();
		author2.setFirstName("Oguz");
		author2.setLastName("ATAY");
		
		Book book = new Book();
		book.setAuthor(author2);
		book.setCurrentPage(0);
		book.setHardCover(true);
		book.setPage(480);
		book.setTitle("Tutunamayanlar");
		book.setTitle("Roman");
		
		Book book2 = new Book();
		book2.setAuthor(author);
		book2.setCurrentPage(0);
		book2.setHardCover(true);
		book2.setPage(632);
		book2.setTitle("Sefiller");
		book2.setType("Roman");
		
		Reader reader = new Reader();
		reader.setName("Akin CENGIZ");
		reader.setAge(41);
		reader.setSex('e');
		reader.setReading(book2);
		
		Reader reader2 = new Reader();
		reader2.setName("Serap CENGIZ");
		reader2.setAge(44);
		reader2.setSex('k');
		reader2.setReading(book);
		
		reader.read(reader.getReading());
		reader.read(reader.getReading());
		reader2.read(reader2.getReading());
		
		
		
		reader.getReader();
		reader2.getReader();

	}

}
