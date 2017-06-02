package com.quizztool.quizztoolbackend.resources;

import com.quizztool.quizztoolbackend.models.Alternative;
import com.quizztool.quizztoolbackend.services.AlternativeService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alternatives")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlternativeResource {
    
    AlternativeService alternativeService = new AlternativeService();
    
    @GET
    public List<Alternative> getAlternatives() {
        return alternativeService.getAlternativies();
    }

}
