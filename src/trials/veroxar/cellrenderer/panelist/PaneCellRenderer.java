package trials.veroxar.cellrenderer.panelist;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class PaneCellRenderer extends DemoPane implements TableCellRenderer {
	
	private static final long serialVersionUID = -3400546726227819346L;
	
	public PaneCellRenderer() {
		super.setOpaque(true);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
			boolean hasFocus, int row, int column) {
		
		DemoPane renderer = (DemoPane) value; 
		
		return this;
		
	}
	
}
