package com.jccc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

/**
 * This class is used to configure the ClassGrade webservice.
 */

@Path("/ClassGrades")
public class ClassGradeWebService {

  /**
   * This method is used to get the class grades.
   */
  @GET
  @Produces("application/json")
  public Response getClassGrades() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(GradeManager.getClassGrades());
    return Response.status(200).entity(json).build();
  }
}
