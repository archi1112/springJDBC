package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("JdbcTemplate", JdbcTemplate.class);

        String query ="INSERT INTO pracitionerdata (id,name,city) VALUES(?,?,?);";

        int output = template.update(query , 456 , "tyna" , "delhi");
        System.out.println("result = "+output);
    }
}
