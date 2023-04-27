package steps;

import java.io.IOException;

import base.SetupDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SetupDriver {
	@Before
	public void launchBrower() throws IOException {
		setup();
	}

	@After
	public void closeBrowser() {
		tear_down();
	}

}
