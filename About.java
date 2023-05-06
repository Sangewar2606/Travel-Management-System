package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
	
	About(){
		setBounds (600,200,500,550);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		JLabel l1 = new JLabel("ABOUT");
		l1.setBounds(200,10,100,40);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Tahoma", Font.PLAIN,20));
		add(l1);
		
		
		TextArea area = new TextArea("The travel management project desktop app is a comprehensive software solution designed to help users efficiently plan and manage their travel arrangements. Whether you're a business traveler, a frequent flyer, or a leisure traveler, this app can help streamline your travel planning process.\r\n"
				+ "\r\n"
				+ "With the travel management app, users can create detailed itineraries, book flights, hotels, and car rentals, and even manage their expenses while on the go. The app is equipped with a powerful search engine that allows users to easily find the best deals on flights, hotels, and rental cars, saving both time and money.\r\n"
				+ "\r\n"
				+ "In addition to booking travel arrangements, the app also provides users with useful travel information, such as weather updates, currency conversion rates, and local points of interest. Users can also set up alerts to keep them informed about any changes or delays to their travel plans.\r\n"
				+ "\r\n"
				+ "The travel management project desktop app is designed to be user-friendly and intuitive, with a clean and modern interface. It is available on Windows, Mac, and Linux operating systems, ensuring compatibility with a wide range of devices. Whether you're a seasoned traveler or a novice, the travel management app can help simplify your travel planning and management process.", 10,40,Scrollbar.VERTICAL);
		area.setEditable(false);
		area.setBounds(20,100,450,300);
		add(area);
		 
		
		 	JButton back = new JButton("Back");
			back.setBounds(200,420,100,25);
			back.addActionListener(this);
			add(back);
			
			
			
		setVisible(true);
		
	}
		public void actionPerformed(ActionEvent ae) {
			setVisible(false);	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About();
	}

}