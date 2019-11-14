package trials.veroxar.cellrenderer.panelist;

import javax.swing.DefaultListModel;

public class GenericListModel<T> extends DefaultListModel<T> {

	private static final long serialVersionUID = -4079308627214087822L;
	
	public void update(int index) {
		fireContentsChanged(this, index, index);
	}

}
