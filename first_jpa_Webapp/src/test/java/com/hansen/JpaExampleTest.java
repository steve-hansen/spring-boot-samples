package com.hansen;

import com.hansen.domain.RwsOffer;
import com.hansen.domain.RwsOfferRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaExampleApplication.class)  // load up the spring context of the specified App
@TransactionConfiguration(defaultRollback = false) // works to control rollback behavior
@Transactional
public class JpaExampleTest
{
    final static Logger logger = LoggerFactory.getLogger(JpaExampleTest.class);

//    @Resource  either of these annotations work to load the repo
    @Autowired
    RwsOfferRepository offerRepo;

    @Test
    public void testTest()
    {
        for ( int i = 0; i < 15; i++)
            logger.debug("I AM JPA TESTING!!!!!!");

        assertNotNull( "repo is null", offerRepo );

        RwsOffer o = offerRepo.findOne(-1L);
        o.setTaxRate( o.getTaxRate().add(new BigDecimal("1")));
        offerRepo.save( o );

        logger.debug( "test offer taxRate = " + o.getTaxRate().toString() );
    }
}