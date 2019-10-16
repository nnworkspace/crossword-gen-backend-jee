package org.ningning.crossword_gen.rest.impl;

import org.ningning.crossword_gen.rest.*;
import org.ningning.crossword_gen.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.ningning.crossword_gen.model.Error;
import org.ningning.crossword_gen.model.PuzzleAndSolutions;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-10-16T15:05:32.223488700+02:00[Europe/Berlin]")
public class WordpuzzleApiServiceImpl implements WordpuzzleApiService {
      @Override
      public Response wordpuzzle(Integer rows, Integer cols, Float density, Integer shortestWordLength, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
