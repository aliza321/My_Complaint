import java.awt.Choice;
import java.awt.Dialog.ModalityType;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class compRegister implements ActionListener {
	private JDialog win;
	private compFile cfile;
	private JPanel panel1, panel2, panel3;
	private Choice dept;
	private String[] depts = { "Engineering", "Electrical", "Health And Sanitation", "Parking", "Revenue (Property Tax)"," Town Planning" , "Sports","Fire Prevention","Urban Biodiversity","Construction and Demolition"};
	private JTextArea taComp;
	private JButton submitBtn, cancelBtn;
	private int cno;

	public compRegister(compFile cfile) {
		win = new JDialog();
		this.cfile = cfile;
		cno = cfile.totalComps + 1;

		win.setModalityType(ModalityType.APPLICATION_MODAL);
		win.setTitle("Register Complaint");
		win.setSize(500, 500);
		win.setLayout(new FlowLayout());

		dept = new Choice();
		for (String d : depts) {
			dept.add(d);
		}
		panel1 = new JPanel();
		panel1.add(new JLabel("Grievance Type"));
		panel1.add(dept);
		win.add(panel1);

		panel2 = new JPanel();
		panel2.add(new JLabel("Complain no. "));
		panel2.add(new JLabel(cno + ""));
		win.add(panel2);

		taComp = new JTextArea(20, 40);
		win.add(new JScrollPane(taComp));

		panel3 = new JPanel();
		submitBtn = new JButton("Submit");
		submitBtn.addActionListener(this);
		cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(this);
		panel3.add(submitBtn);
		panel3.add(cancelBtn);

		win.add(panel3);
		win.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bPressed = (JButton) e.getSource();
		if (bPressed.equals(submitBtn)) {
			complaint newComp = new complaint(cno, dept.getSelectedItem(), taComp.getText(), "");
			cfile.addComp(newComp);
			JOptionPane.showMessageDialog(null, "Compaint has been Registered.\nYour Complaint No. is " + cno);
			win.dispose();
		} else if (bPressed.equals(cancelBtn)) {
			int cancel = JOptionPane.showConfirmDialog(null, "Cancel Complaint Registration ?");
			if (cancel == JOptionPane.YES_OPTION) {
				win.dispose();
			}
		}
	}
}
