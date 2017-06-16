package ar.edu.ciu.mof.web.pages;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuPanel extends Panel {

	private static final long serialVersionUID = 3470207125088310330L;

	public MenuPanel(String id) {
		super(id);
		this.addOptionHome();
		this.addOptionUno();
	}

	private void addOptionHome() {
		// link a home
		super.add(new Link<Void>("linkHome") {
			private static final long serialVersionUID = -3169931201511882788L;
			@Override
			public void onClick() {
				setResponsePage(HomeContent.class);
			}
		});
	}

	private void addOptionUno() {
		// link a opcion 1
		super.add(new Link<Void>("linkOptionUno") {
			private static final long serialVersionUID = 2844182713506798610L;
			@Override
			public void onClick() {
				setResponsePage(OpcionUnoContent.class);
			}
		});
	}

}
