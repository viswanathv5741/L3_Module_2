package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton add = new JButton("Add task");
	private JButton remove = new JButton("Remove task");
	private JButton save = new JButton("Save");
	private JButton load = new JButton("Load");
	
	public ToDoList() {
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		add.addActionListener((ActionListener) this);
		remove.addActionListener((ActionListener) this);
		save.addActionListener((ActionListener) this);
		load.addActionListener((ActionListener) this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			
		}
		if (e.getSource().equals(remove)) {
			
		}
		if (e.getSource().equals(save)) {
			
		}
		if (e.getSource().equals(load)) {
			
		}
	}
}
