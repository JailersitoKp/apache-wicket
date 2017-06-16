package ar.edu.ciu.mof.web.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class OpcionUnoContent extends Template {

	private static final long serialVersionUID = -178114740758694519L;

	public OpcionUnoContent(PageParameters parameters) {
		super();
		super.add(new Label("opcionUnoContenido","opcion uno contenido"));
	}

}
