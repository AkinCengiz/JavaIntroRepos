package org.akincengiz.bookshelf;

public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		author.name = "Victor HUGO";
		
		Author author2 = new Author();
		author2.name = "Oguz ATAY";
		
		Book book = new Book();
		book.author = author2;
		book.currentPage = 0;
		book.isHardCover = true;
		book.page = 480;
		book.title = "Tutunamayanlar";
		book.type = "Roman";
		
		Book book2 = new Book();
		book2.author = author;
		book2.currentPage = 0;
		book2.isHardCover = true;
		book2.page = 632;
		book2.title = "Sefiller";
		book2.type = "Roman";
		
		Reader reader = new Reader();
		reader.name = "Akin CENGIZ";
		reader.age = 41;
		reader.sex = 'e';
		reader.reading = book2;
		
		Reader reader2 = new Reader();
		reader2.name = "Serap CENGIZ";
		reader2.age = 44;
		reader2.sex = 'k';
		reader2.reading = book;
		
		reader.read(reader.reading);
		reader.read(reader.reading);
		reader2.read(reader2.reading);
		
		
		
		reader.getReader();
		reader2.getReader();

	}

}
