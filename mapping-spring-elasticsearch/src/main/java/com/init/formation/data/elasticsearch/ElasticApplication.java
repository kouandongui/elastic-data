

package com.init.formation.data.elasticsearch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Sylvanius Kouandongui
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ElasticApplication  {


    /**
     * start the application
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(ElasticApplication.class, args);

    }



}
