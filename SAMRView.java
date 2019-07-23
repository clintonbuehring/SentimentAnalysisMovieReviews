package sentimentA;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SAMRView extends JFrame {
	
	private JLabel lblTitle1 = new JLabel("Welcome to Sentiment Analysis for Movie Review!!");;
	private JLabel lblTitle2 = new JLabel("Please enter your Movie Review.");
	private JTextArea textArea = new JTextArea(10, 20);
	private JScrollPane scroll = new JScrollPane(textArea);
	private JButton submitButton = new JButton("Submit");
	private JButton clearButton = new JButton("Clear");
	
	private JMenu reviewMenu;
	
	public SAMRView() {
		super("Sentiment Analysis for Movie Reviews");
	
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		reviewMenu = new JMenu("Review Menu");
		menuBar.add(reviewMenu);
		
		JMenuItem userReview = new JMenuItem("User Review");
		reviewMenu.add(userReview);
		
		JMenuItem loadReview = new JMenuItem("Load Reviews");
		reviewMenu.add(loadReview);
		
		JMenuItem exitButton = new JMenuItem("Exit");
		reviewMenu.add(exitButton);
		
		JFrame f = new JFrame();
		
		JPanel displayPanel = new JPanel();  // switching Jpanel to Jframe
		
		displayPanel.setLayout(null);
		
		lblTitle1.setBounds(60, 50, 300, 20);
		displayPanel.add(lblTitle1);
		
		lblTitle2.setBounds(60, 80, 300, 20);
		displayPanel.add(lblTitle2);
		
		scroll.setBounds(60, 110, 500, 100);
		displayPanel.add(scroll);

		submitButton.setBackground(Color.BLUE);
		submitButton.setForeground(Color.WHITE);
		submitButton.setBounds(100, 230, 100, 40);
		displayPanel.add(submitButton);
		
		clearButton.setBackground(Color.RED);
		clearButton.setForeground(Color.WHITE);
		clearButton.setBounds(250, 230, 100, 40);
		displayPanel.add(clearButton);
		
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textArea.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Please type a Movie Review");
				else
					JOptionPane.showMessageDialog(null, "Movie Review Submitted");
				// Action Listener for clear Button
				clearButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textArea.setText(null);
					}
				});
			}
		});
		
		f.add(displayPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);
		
		this.add(displayPanel);

	}

}
