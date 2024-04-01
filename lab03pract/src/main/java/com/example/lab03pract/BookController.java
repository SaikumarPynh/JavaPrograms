package com.example.lab03pract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {
private final List<Book> books = new ArrayList<>();
@GetMapping("/get")
public List<Book> getBooks() {
	return books;
}
@PostMapping("/post")
public Book addBooks(@RequestBody Book book) {
	books.add(book);
	return book;
}
@GetMapping("/get/{BId}")
public Book getBookById(@PathVariable int BId) {
	Book existingBook = findBookById(BId);
	if(existingBook != null) {
		return existingBook;
	}
	return null;
}
@PutMapping("/put/{BId}")
public Book updateBook(@PathVariable int BId,@RequestBody Book updatedBook) {
	Book existingBook = findBookById(BId);
	if(existingBook != null) {
		existingBook.setBId(updatedBook.getBId());
		existingBook.setBTitle(updatedBook.getBTitle());
		existingBook.setBAuthor(updatedBook.getBAuthor());
		existingBook.setBPYear(updatedBook.getBPYear());
		return existingBook;
	}
	return null;
}
@DeleteMapping("/delete/{BId}")
public Book deleteBook(@PathVariable int BId) {
	Book existingBook = findBookById(BId);
	if(existingBook != null) {
		books.remove(existingBook);
		return existingBook;
	}
	return null;
}



private Book findBookById(int id) {
for(Book book:books) {
	if(book.getBId() == id) {
		return book;
	}
}return null;
}

}
