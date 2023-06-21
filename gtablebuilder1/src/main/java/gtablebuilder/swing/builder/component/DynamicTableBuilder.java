package gtablebuilder.swing.builder.component;

import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import gtablebuilder.MyTable;
import gtablebuilder.rowColumn.ColumnDefinition;
import gtablebuilder.swing.builder.SwingBuilder;
import gtablebuilder.swing.table.MyTableModel;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/component/DynamicTableBuilder.java
public class DynamicTableBuilder extends ComponentBuilderAbstract<MyTable>{

	private MyTable target = new MyTable();
	/**
	 * @param swBuilder
	 */
	public DynamicTableBuilder(SwingBuilder swBuilder, List<ColumnDefinition> colDefs){
		super(swBuilder);
		
		MyTableModel m_objTableModel = new MyTableModel(colDefs);
		target = new MyTable();
		target.setModel(m_objTableModel);
		
	}
	
	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#getTarget()
	 */
	public MyTable getTarget() {
		return this.target;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#getType()
	 */
	@SuppressWarnings("unchecked")
	public Class<MyTable> getType() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setEnabled(boolean)
	 */
	public DynamicTableBuilder setEnabled(boolean enabled) {
		this.target.setEnabled(enabled);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setFont(java.awt.Font)
	 */
	public DynamicTableBuilder setFont(Font font) {
		this.getTarget().setFont(font);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setName(java.lang.String)
	 */
	public DynamicTableBuilder setName(String name) {
		this.getTarget().setName(name);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public DynamicTableBuilder rows(List beans){
		/*DynamicTableModel<T> model =  (DynamicTableModel<T>)this.getTarget().getModel();
		for (T bean : beans){
			model.addRow(bean);
		}
		*/
		return null;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.component.ComponentBuilder#setPreferredSize(java.awt.Dimension)
	 */
	public DynamicTableBuilder setPreferredSize(
			Dimension dimension) {
		this.target.setPreferredSize(dimension);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.viewaframework.widget.swing.builder.Builder#setTarget(java.lang.Object)
	 */
	public void setTarget(MyTable target) {
		this.target = target;
	}
}