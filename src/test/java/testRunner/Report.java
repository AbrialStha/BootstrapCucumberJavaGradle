package testRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

/**
 * Created by pav15p on 22/02/2017.
 */
public class Report {
    public static void main(String[] args) {
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList();
        jsonFiles.add("target\\cucumber.json");

        String projectName = "cucumberProject";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);

        @SuppressWarnings("unused")
        Reportable result = reportBuilder.generateReports();
        // and here validate 'result' to decide what to do
        // if report has failed features, undefined steps etc
    }
}
