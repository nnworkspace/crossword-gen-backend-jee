package org.ningning.crossword_gen.rest;

import org.ningning.crossword_gen.model.Error;
import org.ningning.crossword_gen.model.PuzzleAndSolutions;
import org.ningning.crossword_gen.rest.WordpuzzleApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/wordpuzzle")
@RequestScoped

@Api(description = "the wordpuzzle API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2018-11-13T11:58:02.617+01:00[Europe/Berlin]")

public class WordpuzzleApi  {

  @Context SecurityContext securityContext;

  @Inject WordpuzzleApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Returns a word search puzzle and its corresponding solution. ", response = PuzzleAndSolutions.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "word puzzle generator response", response = PuzzleAndSolutions.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    public Response wordpuzzle( @Min(1) @ApiParam(value = "specifies number of rows in the puzzle board", defaultValue="8") @DefaultValue("8") @QueryParam("rows") Integer rows,  @Min(1) @ApiParam(value = "specifies number of columns in the puzzle board", defaultValue="8") @DefaultValue("8") @QueryParam("cols") Integer cols,  @ApiParam(value = "specifies how full should the board be filled. A value between 0.1 to 1.0 is allowed. However, a high value close to 1.0 can be difficult to fullfil. Values such as 0.75f or 0.875f are recommended. ")  @QueryParam("density") Float density,  @Min(3) @ApiParam(value = "specifies the length of the shortest word allowed.", defaultValue="5") @DefaultValue("5") @QueryParam("shortestWordLength") Integer shortestWordLength) {
        return delegate.wordpuzzle(rows, cols, density, shortestWordLength, securityContext);
    }
}
