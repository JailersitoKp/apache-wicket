package ar.edu.ciu.mof.web.pages;

import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class HomeContent extends Template {

	private static final long serialVersionUID = -1036776666838264987L;

	public HomeContent() {
		super();
		super.add(new Label("contenido","clase home content"));

		Model<String> timeStampModel = new Model<String>() {
			private static final long serialVersionUID = -1664598916218861165L;
			@Override
			public String getObject() {
				return new Date().toString();
			}
		};
		super.add(new Label("tiempo", timeStampModel));

	}

}
