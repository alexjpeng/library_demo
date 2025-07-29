package io.pillopl.library.lending.patron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import static io.pillopl.library.lending.patron.model.PatronType.Regular;

@Data
@NoArgsConstructor
@AllArgsConstructor
class PatronInformation {

    @NonNull PatronId patronId;

    @NonNull PatronType type;

    boolean isRegular() {
        return type.equals(Regular);
    }
}

