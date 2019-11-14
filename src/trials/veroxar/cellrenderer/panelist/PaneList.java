package trials.veroxar.cellrenderer.panelist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PaneList extends JPanel {

	private static final long serialVersionUID = 1994845487558042143L;
	private JScrollPane spPaneList;
	private JList<JPanel> listPaneList;
	private PaneCellRenderer listRenderer;

	/**
	 * Create the panel.
	 */
	public PaneList() {
		listRenderer = new PaneCellRenderer();
		setLayout(new BorderLayout(0, 0));
		add(getSpPaneList(), BorderLayout.CENTER);
		
		JPanel pnButtons = new JPanel();
		add(pnButtons, BorderLayout.SOUTH);
		
		JButton btnAddPanel = new JButton("Add Panel");
		btnAddPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getListPaneList().add(new DemoPane());
			}
		});
		pnButtons.add(btnAddPanel);

	}
	private JScrollPane getSpPaneList() {
		if (spPaneList == null) {
			spPaneList = new JScrollPane();
			spPaneList.setViewportView(getListPaneList());
		}
		return spPaneList;
	}
	private JList<JPanel> getListPaneList() {
		if (listPaneList == null) {
			GenericListModel<JPanel> model = new GenericListModel<JPanel>();
			listPaneList = new JList<JPanel>(model);
			listPaneList.setCellRenderer(listRenderer);
		}
		return listPaneList;
	}
}
