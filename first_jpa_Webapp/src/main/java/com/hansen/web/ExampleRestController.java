package com.hansen.web;

import com.hansen.domain.RwsOffer;
import com.hansen.domain.RwsOfferRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class ExampleRestController
{
    final static Logger logger = LoggerFactory.getLogger(ExampleRestController.class);
    @Resource
    RwsOfferRepository offerRepo;

    @RequestMapping("/")
    String home()
    {
        logger.debug("Home REQUEST RECEIVED!!!!!!");

        RwsOffer o = offerRepo.findOne(-1L);
        logger.debug( o.getOfferTemplate() );

        o.setTaxRate( o.getTaxRate().add(new BigDecimal("1")));
        offerRepo.save( o );

        return "Hello World! offer taxRate = " + o.getTaxRate().toString();
    }

    @RequestMapping("/test")
    String testing() {
        logger.debug("TEST       REQUEST RECEIVED!!!!!!");
        return "testing, testing.....";
    }}
