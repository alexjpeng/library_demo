package io.pillopl.library.lending.librarybranch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryBranchId {

    @NonNull UUID libraryBranchId;
}
