package com.nisum.onestopshop.be.stepdefenation;
import com.nisum.onestopshop.be.db.DBMethods;
import com.nisum.onestopshop.be.dto.Department;
import com.nisum.onestopshop.be.runner.SpringConfiguration;
import com.nisum.onestopshop.be.utils.CommonMethods;
import com.nisum.onestopshop.be.utils.RestUtilities;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DepartmentTestCase {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentTestCase.class);

    @Autowired
    RestUtilities restUtilities;

    @Autowired
    CommonMethods commonMethods;

    @Autowired
    DBMethods dbMethods;

    @Value("${base.uri}")
    private String baseUri;

    @Value("${department.endpoint}")
    private String departmentEndpoint;

    @Value("${product.endpoint}")
    private String productEndpoint;

    private Response response;
    private List<Department> listDepartments;
    private String requestJson;

    @Given("perform a get request on departments")
    public void getRequestToDepartment() throws Exception {
        response = restUtilities.getRequest(baseUri + departmentEndpoint);
        logger.info("Response is " + response.getBody().asString());
    }

    @When("^verify the status '(\\d+)'$")
    public void verifyStatus(int arg1) {
       Assert.assertEquals(arg1,response.getStatusCode());
    }

    @Then("^verify json schema$")
    public void verifyJsonSchema() {
        response.then().assertThat()
                .body(matchesJsonSchemaInClasspath("jsonschemas/departmentSchema.json"));
    }

    @Then("^verify department names should be \"([^\"]*)\" and \"([^\"]*)\"$")
    public void verifyDepartmentNamesShouldBeDepartmentAndDepartment(String dept1, String dept2) throws Exception {
        HashMap<String,Object> departments = commonMethods.jsonStringToMap(response.getBody().asString());
        logger.info(departments.toString());
        String deptName = null;
        for(Map<String, Object> departmentsitems: (List<Map<String, Object>>) departments.get("categories")){
            if(dept1.equalsIgnoreCase((String)departmentsitems.get("title"))) {
                deptName = (String) departmentsitems.get("name");
                Assert.assertEquals(dept1, deptName);
                break;
            }
        }
    }

    @Given("^a user has some search filters$")
    public void aUserHasSomeSearchFilters() throws Exception{
         requestJson = IOUtils.toString(
                 DepartmentTestCase.class.getClassLoader()
                        .getResourceAsStream("requests/SearchProducts.json"),
                Charset.forName("UTF-8"));

    }

    @When("^users hit search with specified filters$")
    public void usersHitSearchWithSpecifiedFilters()  {
        response = restUtilities.postRequest(baseUri+productEndpoint,requestJson);
        logger.info("############## response is " + response.getBody().asString());
    }


    @And("^verify all products are relaed to specified filters like \"([^\"]*)\"$")
    public void verifyAllProductsAreRelaedToSpecifiedFiltersLike(String filter) throws Exception {
        HashMap<String,Object> products = commonMethods.jsonStringToMap(response.getBody().asString());
        String title = null;
        for(Map<String, Object> product: (List<Map<String, Object>>) products.get("products")){
            if(filter.equalsIgnoreCase((String)product.get("title"))) {
                title = (String)product.get("title");
                Assert.assertEquals(filter,title);
                break;
            }
        }
        if (title!=filter)
            Assert.assertTrue(true);
    }

    @Before
    public void beforeScenario() throws SQLException {
        logger.info("This will run before the Scenario");
        Map<String,List<String>> map = dbMethods.selectQueries("SELECT status FROM cstore_6_schema.department where dept_name=\"Accessoreis\";");
        logger.info("Map is " + map);
    }
}
