package com.hansen;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assert.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//    "classpath:/META-INF/spring/amp-service-context.xml"
//})
//@TransactionConfiguration(transactionManager = "ampTransactionManager", defaultRollback = true)
//@Transactional
public class ExampleTest
{
    final static Logger logger = LoggerFactory.getLogger(ExampleTest.class);

    @Test
    public void testTest()
    {
        for ( int i = 0; i < 15; i++)
            logger.debug("I AM TESTING!!!!!!");
    }
}