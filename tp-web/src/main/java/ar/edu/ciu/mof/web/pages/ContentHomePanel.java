package ar.edu.ciu.mof.web.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

public class ContentHomePanel extends Panel {

	private static final long serialVersionUID = -469351765248516508L;

	public ContentHomePanel(String id) {
		super(id);
		add(new Label("contenido", "contenido...LAMA CAPO!!!!"));
	}

}
