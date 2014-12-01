package com.hansen.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table( name = "adc_offer", schema = "public" )
public class RwsOffer implements Serializable
{
    @Id
    @SequenceGenerator(name="AdcOffer_s", sequenceName="hibernate_sequence", schema="public", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="AdcOffer_s")
    @Column(name = "offer_id")
    private Long id;

    @Column(name = "tax_rate")
    private BigDecimal taxRate;

    @Column(name = "offer_template")
    private String offerTemplate;

    public Long getId()
    {
        return id;

    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public BigDecimal getTaxRate()
    {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate)
    {
        this.taxRate = taxRate;
    }

    public String getOfferTemplate()
    {
        return offerTemplate;
    }

    public void setOfferTemplate(String offerTemplate)
    {
        this.offerTemplate = offerTemplate;
    }
}
