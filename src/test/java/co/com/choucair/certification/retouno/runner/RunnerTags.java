package co.com.choucair.certification.retouno.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/retouno.feature",
                tags = "@Regression",
                glue = {"co.com.choucair.certification.retouno.stepdefinitions","co.com.choucair.certification.retouno.util"},
                snippets = SnippetType.CAMELCASE)
public class
RunnerTags {

}
