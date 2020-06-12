package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cafe.CafeInput;
import manager.Cafemanager;

public class CafeViewer extends JPanel{
	
	WindowFrame frame;
	
	Cafemanager cafemanager;
	
	public CafeViewer(WindowFrame frame,Cafemanager cafemanager) {
		this.frame = frame;
		this.cafemanager = cafemanager;
		
		System.out.println("***" + cafemanager.size() + "***");
	
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Menu");
		model.addColumn("Price");
		model.addColumn("Telephone");
		model.addColumn("Location");
		
		for(int i=0; i<cafemanager.size(); i++) {
			Vector row = new Vector();
			CafeInput ci = cafemanager.get(i);
			row.add(ci.getName());
			row.add(ci.getMenu());
			row.add(ci.getPrice());
			row.add(ci.getPhone());
			row.add(ci.getLocation());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
