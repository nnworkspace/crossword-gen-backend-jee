package org.ningning.crossword_gen.rest;

import org.ningning.crossword_gen.rest.*;
import org.ningning.crossword_gen.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.ningning.crossword_gen.model.Error;
import org.ningning.crossword_gen.model.PuzzleAndSolution;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2018-11-12T16:51:24.304+01:00[Europe/Berlin]")
public interface WordpuzzleApiService {
      public Response wordpuzzle(Integer rows, Integer cols, Float density, Integer shortestWordLength, SecurityContext securityContext);
}
