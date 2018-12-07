package com.example.restful.api.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by A on 2018-12-07 오후 2:52
 * restfulservicedemoinintellij / com.example.restful.api.VO
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

@Data
@ApiModel(description = "Class representing a person tracked by the application.")
public class Person {
    @ApiModelProperty(notes = "Unique identifier of the person. No two persons can have the same id.", example = "1", required = true, position = 0)
    private int id;
    @ApiModelProperty(notes = "First name of the person.", example = "John", required = true, position = 1)
    private String firstName;
    @ApiModelProperty(notes = "Last name of the person.", example = "Doe", required = true, position = 2)
    private String lastName;
    @ApiModelProperty(notes = "Age of the person. Non-negative integer", example = "42", position = 3)
    private int age;
    // … Constructor, getters, setters, ...
}