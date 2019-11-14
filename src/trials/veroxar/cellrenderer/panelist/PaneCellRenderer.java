package trials.veroxar.cellrenderer.panelist;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class PaneCellRenderer implements ListCellRenderer<JPanel> {

	@Override
	public Component getListCellRendererComponent(JList<? extends JPanel> list, JPanel pane, int index,
			boolean isSelected, boolean cellHasFocus) {
		
		pane.setBackground(isSelected ? Color.MAGENTA : list.getBackground());
		return pane;
		
	}
	
}
