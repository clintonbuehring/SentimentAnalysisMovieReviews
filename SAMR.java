package sentimentA;

import javax.swing.JFrame;

public class SAMR {
	
	public static void main(String[] args) {
		// Create new model, view and controller
		SAMRModel model = new SAMRModel();
		SAMRView view = new SAMRView();
		SAMRController controller = new SAMRController(model, view);

		view.setVisible(true);
		
	}
}
