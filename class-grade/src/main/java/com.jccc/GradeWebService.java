package com.jccc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

/**
 * This class is used to configure the grade webservice.
 */

@Path("/Grade")
public class GradeWebService {

  /**
   * This method is used to get the grade.
   */
  @GET
  @Produces("application/json")
  public Response getGrade() throws JsonProcessingException {

    ClassGrade classGrade = GradeManager.getClassGrades().get(0);
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(classGrade);


    return Response.status(200).entity(json).build();
  }
}
