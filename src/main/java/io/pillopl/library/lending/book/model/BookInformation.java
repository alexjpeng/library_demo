package io.pillopl.library.lending.book.model;


import io.pillopl.library.catalogue.BookId;
import io.pillopl.library.catalogue.BookType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInformation {

    @NonNull
    BookId bookId;

    @NonNull
    BookType bookType;
}
