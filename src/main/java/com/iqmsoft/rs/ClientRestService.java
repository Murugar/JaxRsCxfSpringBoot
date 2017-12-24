package com.iqmsoft.rs;

import java.util.Collection;
import java.util.Collections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.iqmsoft.model.Client;

@Path("/client")
@Component
public class ClientRestService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Collection<Client> getPeople() {
        return Collections.singletonList(new Client("test@test.com", "Test1", "Test2"));
    }
}
