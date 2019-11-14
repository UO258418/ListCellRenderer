package trials.veroxar.cellrenderer.panelist;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DemoPane extends JPanel {

	private static final long serialVersionUID = -5109106312783185804L;
	private JPanel pnTop;
	private JPanel pnBottom;
	private JLabel lblTextfield;
	private JTextField tf1;
	private JLabel lblTextfield_1;
	private JTextField tf2;

	/**
	 * Create the panel.
	 */
	public DemoPane() {
		setLayout(new GridLayout(0, 1, 0, 0));
		add(getPnTop());
		add(getPnBottom());

	}

	private JPanel getPnTop() {
		if (pnTop == null) {
			pnTop = new JPanel();
			pnTop.add(getLblTextfield());
			pnTop.add(getTf1());
		}
		return pnTop;
	}
	private JPanel getPnBottom() {
		if (pnBottom == null) {
			pnBottom = new JPanel();
			pnBottom.add(getLblTextfield_1());
			pnBottom.add(getTf2());
		}
		return pnBottom;
	}
	private JLabel getLblTextfield() {
		if (lblTextfield == null) {
			lblTextfield = new JLabel("TextField1: ");
		}
		return lblTextfield;
	}
	private JTextField getTf1() {
		if (tf1 == null) {
			tf1 = new JTextField();
			tf1.setColumns(10);
		}
		return tf1;
	}
	private JLabel getLblTextfield_1() {
		if (lblTextfield_1 == null) {
			lblTextfield_1 = new JLabel("TextField2:");
		}
		return lblTextfield_1;
	}
	private JTextField getTf2() {
		if (tf2 == null) {
			tf2 = new JTextField();
			tf2.setColumns(10);
		}
		return tf2;
	}
}
