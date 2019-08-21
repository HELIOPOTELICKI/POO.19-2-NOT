import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao frame = new Apresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Apresentacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(10, 11, 46, 14);
		contentPane.add(lblValor);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 53, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InteiroPositivo ip = new InteiroPositivo();
				ip.setValor(Integer.parseInt(textField.getText()));
				textArea.setText("Valor = "+ip.getValor());
				textArea.append("\nFatorial = "+ip.fatorial());
				textArea.append("\n"+ip.divisoresInteiros());
			}
		});
		btnOk.setBounds(163, 7, 89, 23);
		contentPane.add(btnOk);
		
		textArea.setBounds(10, 53, 414, 198);
		contentPane.add(textArea);
	}
}
