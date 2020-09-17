package com.ford.computer;

import org.junit.Assert;
import org.junit.Test;

public class CatalogueTest {
    @Test
    public void shouldHaveDefaultName(){
        Catalogue product = new Catalogue();
        Assert.assertEquals("New Product", product.name);
    }
    @Test
    public void shouldHaveDefaultBrand(){
        Catalogue product = new Catalogue();
        Assert.assertEquals("", product.brand);
    }
    @Test
    public void shouldHaveDefaultPrice(){
        Catalogue product = new Catalogue();
        Assert.assertEquals(0, product.price);
    }
    @Test
    public void shouldHaveDefaultDiscount(){
        Catalogue product = new Catalogue();
        Assert.assertEquals(0, product.discount);
    }
    @Test
    public void shouldHaveDefaultTypeOfDevice(){
        Catalogue product = new Catalogue();
        Assert.assertEquals("Unknown", product.typeOfDevice);
    }
    @Test
    public void shouldHaveDefaultTypeOfConnector(){
        Catalogue product = new Catalogue();
        Assert.assertEquals("Unknown", product.typeOfConnector);
    }

    @Test
    public void shouldHaveAssignableName(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals("Phone", product.name);
    }
    @Test
    public void shouldHaveAssignableBrand(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals("Samsung", product.brand);
    }
    @Test
    public void shouldHaveAssignablePrice(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals(20000, product.price);
    }
    @Test
    public void shouldHaveAssignableDiscount(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals(10, product.discount);
    }
    @Test
    public void shouldHaveAssignableTypeOfDevice(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals("Gadget", product.typeOfDevice);
    }
    @Test
    public void shouldHaveAssignableTypeOfConnector(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals("PortB", product.typeOfConnector);
    }
    @Test
    public void checkDiscountedPrice(){
        Catalogue product = new Catalogue("Phone","Samsung",20000,10,"Gadget","PortB" );
        Assert.assertEquals(18000.00, product.discountToPriceConversion(product.discount, product.price),2 );
    }
}
