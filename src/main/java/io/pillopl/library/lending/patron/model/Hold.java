package io.pillopl.library.lending.patron.model;

import io.pillopl.library.catalogue.BookId;
import io.pillopl.library.lending.librarybranch.model.LibraryBranchId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Hold {

    @NonNull BookId bookId;
    @NonNull LibraryBranchId libraryBranchId;

}
