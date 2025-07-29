package io.pillopl.library.commons.aggregates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Version {
    int version;

    public static Version zero() {
        return new Version(0);
    }
}
