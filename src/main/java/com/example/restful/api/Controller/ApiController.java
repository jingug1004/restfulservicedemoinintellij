package com.example.restful.api.Controller;

import com.example.restful.api.Service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by A on 2018-12-05 오후 5:14
 * restful / com.example.restful.web
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
public class ApiController {

    @Inject
    private ApiService apiService;

    @RequestMapping(value = "/hello02", method = RequestMethod.GET)
    public String hello() {
        return "hello02";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() throws Exception {
        return apiService.getNow();
    }
}