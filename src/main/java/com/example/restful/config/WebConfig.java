package com.example.restful.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by user on 2017-04-11 오전 10:06
 * Prac / net.balgre.controller
 * No pain, No gain!
 * What :
 * Why :
 * How :
 *
 * @author
 * @version 1.0
 * @see
 * @since 2018/12/07
 * <p>
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    -------------------------------------------------------------------------------------
 *  2018/12/07   김진국          최초 배포 - 김진국 Velocity 연결 접속 불가(404)해서 전달 받음 - 하지만 상관 없었음!
 *  </pre>
 */

@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@MapperScan(value = {"mappers"})
//@MapperScan(value = {"com.example.**.mapper"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        Resource[] arrResource = new PathMatchingResourcePatternResolver()
                .getResources("classpath:mappers/*Mapper.xml");
//                .getResources("classpath:mappers/**/*Mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(arrResource);
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }

}