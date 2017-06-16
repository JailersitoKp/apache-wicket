package ar.edu.ciu.mof.web.pages;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class MofApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HomeContent.class;
	}

	@Override
	public void init() {
		super.init();
		// configuracion
	}

}
