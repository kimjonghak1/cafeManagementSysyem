package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuselection;
	CafeAdder cafeadder;
	CafeViewer cafeviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.cafeadder = new CafeAdder(this);
		this.cafeviewer = new CafeViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(menuselection);
		
		
		this.setVisible(true);
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public CafeAdder getCafeadder() {
		return cafeadder;
	}

	public void setCafeadder(CafeAdder cafeadder) {
		this.cafeadder = cafeadder;
	}

	public CafeViewer getCafeviewer() {
		return cafeviewer;
	}

	public void setCafeviewer(CafeViewer cafeviewer) {
		this.cafeviewer = cafeviewer;
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

}
