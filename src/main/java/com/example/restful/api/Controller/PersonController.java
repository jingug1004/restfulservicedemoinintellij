package com.example.restful.api.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A on 2018-12-07 오후 6:28
 * restfulservicedemoinintellij / com.example.restful.api.Controller
 * No pain, No gain!
 * What :
 * Why :
 * How :
 * << 개정이력(Modification Information) >>
 * 수정일         수정자          수정내용
 * -------       --------       ---------------------------
 * 2018/04/01     김진국          최초 생성
 * 2017/05/27     이몽룡          인증이 필요없는 URL을 패스하는 로직 추가
 *
 * @author 개발팀 김진국
 * @version 1.0
 * @see
 * @since 2018/04/01
 */


@RestController
@RequestMapping("/v2/persons/")
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class PersonController {

//    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiOperation("Returns list of all Persons in the system.")
    public String getAllPersons() {
        return null;
    }
//
//    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
//    @ApiOperation("Returns a specific person by their identifier. 404 if does not exist.")
//    public Person getPersonById(@ApiParam("Id of the person to be obtained. Cannot be empty.")
//                                @PathVariable int id) {
//        return personService.getPersonById(id);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
//    @ApiOperation("Deletes a person from the system. 404 if the person's identifier is not found.")
//    public void deletePerson(@ApiParam("Id of the person to be deleted. Cannot be empty.")
//                             @PathVariable int id) {
//        personService.deletePerson(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
//    @ApiOperation("Creates a new person.")
//    public Person createPerson(@ApiParam("Person information for a new person to be created.")
//                               @RequestBody Person person) {
//        return personService.createPerson(person);
//    }
//
//    @Autowired
//    public void setPersonService(PersonService personService) {
//        this.personService = personService;
//    }
}