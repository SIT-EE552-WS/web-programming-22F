package org.acme;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public record DadJoke(
        String id,
        String joke,
        int status
){
    // In class, I couldn't figure out how to make an optional parameter
    // work with records. It turns out, this is not currently possible with
    // the JSON-B specification.  There are ongoing discussions on how to solve
    // it.  If optional parameters are needed, we will need to use traditional
    // classes instead of records.
}