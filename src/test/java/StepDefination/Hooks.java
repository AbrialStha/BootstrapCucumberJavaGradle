package StepDefination;

import Utl.Base;
import Utl.BrowserFactory;
import Utl.Log;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by pav15p on 22/02/2017.
 */
public class Hooks extends Base {
    /**
     * for the looger
     */
    private Log log;
    private Base base;
    private BrowserFactory browserFactory;

    public Hooks(Base base) {
        this.base = base;
        this.log = new Log(this.getClass());
        this.browserFactory = new BrowserFactory();
    }

    @Before
    public void initialize(Scenario s) {
        log.info("Started Browser for scenario " + s.getName());
        base.Driver = browserFactory.getBrowser("chrome");
    }

    @After
    public void teardown(Scenario s) {
        /* get the screenshot and attache it with the report */
        if (s.isFailed()) {
            log.error(s.getId());
            s.embed(base.capture(), "image/png"); //stick it in the report
        }
        base.Driver.close();
        log.info("Closed Browser after completing scenario " + s.getName());
    }
}
