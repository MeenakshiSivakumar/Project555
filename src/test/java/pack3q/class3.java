package pack3q;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class3 {


@Given("user in user page")
public void user_in_user_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user in the homepage");
}

@When("user enters credentials")
public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	List<Map<String,String>> list=dataTable.asMaps();
	for(int i=0;i<2;i++)
	{
	System.out.println(list.get(i).get("username"));
	System.out.println(list.get(i).get("password"));
	}

}

@When("click the login button")
public void click_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
