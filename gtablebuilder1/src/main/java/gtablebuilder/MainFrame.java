package gtablebuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gtablebuilder.rowColumn.ColumnDefinition;
import gtablebuilder.swing.builder.SwingBuilder;
import gtablebuilder.swing.builder.layout.GridBagConstraintsBuilder;

public class MainFrame extends JFrame{


	public MainFrame() {
		
		initComponents();
	}
	public void initComponents() {
		Dimension dimension = new Dimension(700, 700);
	     setExtendedState(MAXIMIZED_BOTH);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 ColumnDefinition colDef = new ColumnDefinition(0, "name", "Name");
		 List<ColumnDefinition> colDefs = new ArrayList<ColumnDefinition>();
		 colDefs.add(colDef);
		 colDef = new ColumnDefinition(2, "displayName", "Display Name");
		 colDefs.add(colDef);
		 colDef = new ColumnDefinition(1, "description", "Description");
		 colDefs.add(colDef);
		 
		 add(new SwingBuilder().layout(new BorderLayout()).component(
				 
				 new SwingBuilder().
					layout(new GridBagLayout()).
					 /* (1) label-component */
						label(new GridBagConstraintsBuilder().row(0).col(0).gridWidth(2).build()).
							setName("toLabel").setText("MyText").swingBuilder()
							.dynamicTable(colDefs,new GridBagConstraintsBuilder().row(1).col(0).gridWidth(2).build()).setName("certificationTable")
							.
						 /* Returning the container to add it to the frame */
					swingBuilder().getTarget()
							,JPanel.class,BorderLayout.SOUTH).
						swingBuilder().setPreferredSize(new Dimension(400,0)).getTarget());
	}
}