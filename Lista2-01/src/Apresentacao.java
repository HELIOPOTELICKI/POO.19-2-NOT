import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JLabel lblCpf;
	private JTextField tfCPF;
	private JLabel lblUnidadeDaFederao;
	private JTextField tfUF;
	private JLabel lblRendaAnualR;
	private JTextField tfRendaAnual;

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
		
		JLabel lblNomeDoContribuinte = new JLabel("Nome do contribuinte:");
		lblNomeDoContribuinte.setBounds(10, 11, 117, 14);
		contentPane.add(lblNomeDoContribuinte);
		
		tfNome = new JTextField();
		tfNome.setBounds(135, 8, 194, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 36, 46, 14);
		contentPane.add(lblCpf);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(41, 36, 117, 20);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		lblUnidadeDaFederao = new JLabel("Unidade da federa\u00E7\u00E3o:");
		lblUnidadeDaFederao.setBounds(10, 71, 117, 14);
		contentPane.add(lblUnidadeDaFederao);
		
		tfUF = new JTextField();
		tfUF.setBounds(123, 67, 37, 20);
		contentPane.add(tfUF);
		tfUF.setColumns(10);
		
		lblRendaAnualR = new JLabel("Renda anual: R$");
		lblRendaAnualR.setBounds(10, 107, 101, 14);
		contentPane.add(lblRendaAnualR);
		
		tfRendaAnual = new JTextField();
		tfRendaAnual.setBounds(101, 104, 86, 20);
		contentPane.add(tfRendaAnual);
		tfRendaAnual.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte contAtual = new Contribuinte();
				contAtual.setNome(tfNome.getText());
				contAtual.setCpf(tfCPF.getText());
				contAtual.setUf(tfUF.getText());
				contAtual.setRendaAnual(
						Double.parseDouble(tfRendaAnual.getText()));
				JOptionPane.showMessageDialog(null, contAtual.calcularImposto());
			}
		});
		btnCadastrar.setBounds(240, 103, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
