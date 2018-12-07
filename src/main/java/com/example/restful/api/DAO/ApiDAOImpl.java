package com.example.restful.api.DAO;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * Created by A on 2018-12-07 오후 2:50
 * restfulservicedemoinintellij / com.example.restful.api.DAO
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

@Repository
public class ApiDAOImpl implements ApiDAO {

    private static final Logger logger = LoggerFactory.getLogger(ApiDAOImpl.class);

    @Inject
    private SqlSession sqlSession;

    private static String namespace = "mappers.apiMapper";

    @Override
    public String getNow() throws Exception {
        return sqlSession.selectOne(namespace + ".getNow");
    }
}