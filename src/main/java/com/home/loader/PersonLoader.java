package com.home.loader;

import com.home.pojos.Address;
import com.home.pojos.IAddress;
import com.home.pojos.IPerson;
import com.home.pojos.Person;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by User on 10.04.2017.
 */
public class PersonLoader {
    public static Logger logger = Logger.getLogger(PersonLoader.class);
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.getAddress();
        logger.info(person);

        Address address = context.getBean("address", Address.class);
        System.out.println(address.getAddress());
        logger.info(address);
}
}
