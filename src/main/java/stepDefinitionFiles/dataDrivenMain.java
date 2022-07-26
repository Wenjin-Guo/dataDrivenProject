package stepDefinitionFiles;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;


public class dataDrivenMain {

    @Given("import excel data")
    public void import_excel_data(io.cucumber.datatable.DataTable dataTable) {
       List<Map<String,String>> hockeyPlayers = dataTable.asMaps(String.class,String.class);
        for (Map<String,String> items : hockeyPlayers){
            System.out.println(items);
            for(Map.Entry<String,String> item: items.entrySet()) {
                //System.out.println(item.getKey());
                System.out.println(item.getValue());
            }
        }
    }
    @When("print in console")
    public void print_in_console() {

    }
}
