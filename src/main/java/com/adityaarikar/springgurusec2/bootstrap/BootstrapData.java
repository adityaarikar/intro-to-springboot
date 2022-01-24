package com.adityaarikar.springgurusec2.bootstrap;

import com.adityaarikar.springgurusec2.entity.Author;
import com.adityaarikar.springgurusec2.entity.Book;
import com.adityaarikar.springgurusec2.entity.Publisher;
import com.adityaarikar.springgurusec2.repositories.AuthorRepository;
import com.adityaarikar.springgurusec2.repositories.BookRepository;
import com.adityaarikar.springgurusec2.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author aditya = new Author("Aditya","Arikar");
        Book manAndResponsiblities = new Book("Man And Responsiblities", "123");
        Publisher varun = new Publisher("Varun Arikar", "At. Post: Nerala","Bhandara","Maharashtara", "441903");

        aditya.getBooks().add(manAndResponsiblities);
        manAndResponsiblities.getAuthors().add(aditya);
        manAndResponsiblities.getPublishers().add(varun);

        authorRepository.save(aditya);
        bookRepository.save(manAndResponsiblities);

        Author ayush = new Author("Ayush", "Arikar");
        Book any = new Book("Any", "012");

        ayush.getBooks().add(any);
        any.getAuthors().add(ayush);
        any.getPublishers().add(varun);


        authorRepository.save(ayush);
        bookRepository.save(any);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books "+ bookRepository.count());
    }
}
