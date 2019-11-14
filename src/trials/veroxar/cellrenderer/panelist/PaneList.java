package trials.veroxar.cellrenderer.panelist;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaneList extends JPanel {
	
	private static final long serialVersionUID = 1994845487558042143L;
	
	private JScrollPane spPaneList;
	private JTable tablePaneList;
	private JPanel pnButtons;
	private JButton btnAddPanel;

	/**
	 * Create the panel.
	 */
	public PaneList() {
		setLayout(new BorderLayout(0, 0));
		add(getSpPaneList(), BorderLayout.CENTER);
		add(getPnButtons(), BorderLayout.SOUTH);

	}
	private JScrollPane getSpPaneList() {
		if (spPaneList == null) {
			spPaneList = new JScrollPane();
			spPaneList.setViewportView(getTablePaneList());
		}
		return spPaneList;
	}
	private JTable getTablePaneList() {
		if (tablePaneList == null) {
			DefaultTableModel model = new DefaultTableModel() {
		
				private static final long serialVersionUID = -9022939128413482446L;

				@Override
				public Class<?> getColumnClass(int columnIndex) {
					return DemoPane.class;
				}
			};
			tablePaneList.setDefaultRenderer(DemoPane.class, new PaneCellRenderer());
			tablePaneList = new JTable(model);
		}
		return tablePaneList;
	}
	private JPanel getPnButtons() {
		if (pnButtons == null) {
			pnButtons = new JPanel();
			pnButtons.add(getBtnAddPanel());
		}
		return pnButtons;
	}
	private JButton getBtnAddPanel() {
		if (btnAddPanel == null) {
			btnAddPanel = new JButton("Add Panel");
			btnAddPanel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JTable table = getTablePaneList();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					Object[] row = {new DemoPane()};
					model.addRow(row);
					model.fireTableDataChanged();
				}
			});
		}
		return btnAddPanel;
	}
}
