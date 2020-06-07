package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CafeViewer extends JPanel{
	
	WindowFrame frame;
	
	public CafeViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Menu");
		model.addColumn("Price");
		model.addColumn("Telephone");
		model.addColumn("Location");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
