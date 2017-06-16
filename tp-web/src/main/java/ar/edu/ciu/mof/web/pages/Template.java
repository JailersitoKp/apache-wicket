package ar.edu.ciu.mof.web.pages;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Template extends WebPage {

		// constantes
	private static final long serialVersionUID = -7772939166506802513L;

		// atributos
	private Component headerPanel;
	private Component menuPanel;
	private Component footerPanel;

		// constructores
	public Template() {
		super();
		this.config();
	}

	public Template(PageParameters parameters) {
		super(parameters);
		this.config();
	}

		// metodos
	private void config() {
		super.add(headerPanel = new HeaderPanel("headerPanel"));
		super.add(menuPanel = new MenuPanel("menuPanel"));
		super.add(footerPanel = new FooterPanel("footerPanel"));
	}

		// gets y sets
	public Component getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(Component headerPanel) {
		this.headerPanel = headerPanel;
	}

	public Component getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(Component menuPanel) {
		this.menuPanel = menuPanel;
	}

	public Component getFooterPanel() {
		return footerPanel;
	}

	public void setFooterPanel(Component footerPanel) {
		this.footerPanel = footerPanel;
	}

}
