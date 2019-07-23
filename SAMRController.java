package sentimentA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SAMRController implements ActionListener {
	
	private SAMRModel model;
	private SAMRView view;
	
	public SAMRController(SAMRModel model, SAMRView view) {
		this.model = model;
		this.view = view;
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("EXIT")) {
			System.exit(0);
		}
	}

}
