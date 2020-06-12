package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.Cafemanager;

public class WindowFrame extends JFrame {

	Cafemanager cafemanager;
	
	MenuSelection menuselection;
	CafeAdder cafeadder;
	CafeViewer cafeviewer;
	

	public WindowFrame(Cafemanager cafemanager) {
		
		
		
		
		this.cafemanager = cafemanager;
		menuselection = new MenuSelection(this);
		cafeadder = new CafeAdder(this);
		cafeviewer = new CafeViewer(this,this.cafemanager);
		
		
		
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
