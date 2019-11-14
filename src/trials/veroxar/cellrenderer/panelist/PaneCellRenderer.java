package trials.veroxar.cellrenderer.panelist;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class PaneCellRenderer implements TableCellRenderer {
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
			boolean hasFocus, int row, int column) {
		
		// get current DemoPane
		DemoPane renderer = (DemoPane) value; 
		
		return renderer;
		
	}
	
}
