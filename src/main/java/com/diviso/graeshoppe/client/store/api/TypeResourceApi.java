/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import java.util.List;
import com.diviso.graeshoppe.client.store.model.Type;
import com.diviso.graeshoppe.client.store.model.TypeDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-25T16:21:09.433+05:30[Asia/Kolkata]")

@Api(value = "TypeResource", description = "the TypeResource API")
public interface TypeResourceApi {

    @ApiOperation(value = "createType", nickname = "createTypeUsingPOST", notes = "", response = TypeDTO.class, tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/types",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<TypeDTO> createTypeUsingPOST(@ApiParam(value = "typeDTO" ,required=true )  @Valid @RequestBody TypeDTO typeDTO);


    @ApiOperation(value = "deleteType", nickname = "deleteTypeUsingDELETE", notes = "", tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/types/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTypeUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllTypes", nickname = "getAllTypesUsingGET", notes = "", response = TypeDTO.class, responseContainer = "List", tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/types",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TypeDTO>> getAllTypesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getType", nickname = "getTypeUsingGET", notes = "", response = TypeDTO.class, tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/types/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<TypeDTO> getTypeUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "listToDto", nickname = "listToDtoUsingPOST3", notes = "", response = TypeDTO.class, responseContainer = "List", tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/type/toDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<TypeDTO>> listToDtoUsingPOST3(@ApiParam(value = "types" ,required=true )  @Valid @RequestBody List<Type> type);


    @ApiOperation(value = "searchTypes", nickname = "searchTypesUsingGET", notes = "", response = TypeDTO.class, responseContainer = "List", tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/types",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TypeDTO>> searchTypesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateType", nickname = "updateTypeUsingPUT", notes = "", response = TypeDTO.class, tags={ "type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TypeDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/types",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<TypeDTO> updateTypeUsingPUT(@ApiParam(value = "typeDTO" ,required=true )  @Valid @RequestBody TypeDTO typeDTO);

}
