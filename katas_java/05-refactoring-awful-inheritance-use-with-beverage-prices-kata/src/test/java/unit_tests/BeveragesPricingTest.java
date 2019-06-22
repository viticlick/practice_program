package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }
    
    @Test
    public void computes_coffee_and_cinnamon_price() {
        Beverage beverage = new Cinnamon(new Coffee());
        assertThat(beverage.price(), is(closeTo(1.25, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_tea_and_cinnamon_price() {
        Beverage beverage = new Cinnamon(new Tea());
        assertThat(beverage.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }
    
    @Test
    public void computes_hot_chocolate_and_cinnamon_price() {
        Beverage beverage = new Cinnamon(new HotChocolate());
        assertThat(beverage.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea teaWithMilk = new TeaWithMilk();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }
    
    @Test
    public void computes_tea_with_milk_and_cinnamon_price() {
        Beverage beverage = new Cinnamon(new TeaWithMilk());
        assertThat(beverage.price(), is(closeTo(1.65, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new CoffeeWithMilk();
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        Beverage beverage = new Cinnamon(new CoffeeWithMilk());
        assertThat(beverage.price(), is(closeTo(1.35, 0.001)));
    }
    
    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffeeWithMilkAndCream = new CoffeeWithMilkAndCream();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }
    
    @Test
    public void computes_coffee_with_milk_and_cream_and_cinnamon_price() {
        Beverage beverage= new Cinnamon(new CoffeeWithMilkAndCream());
        assertThat(beverage.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolateWithCream hotChocolateWithCream = new HotChocolateWithCream();
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price() {
    	Beverage beverage = new Cinnamon(new HotChocolateWithCream());
    	assertThat(beverage.price(), is(closeTo(1.65, 0.001)));
    }
}
