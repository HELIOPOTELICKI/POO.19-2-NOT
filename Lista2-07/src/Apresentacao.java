import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField tfValor;
	private JTextField tfPos;
	private JTextField tfTamanho;
	private VetorDeReais atual,
						 outro;
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
		lblValor.setBounds(10, 59, 46, 14);
		contentPane.add(lblValor);
		
		tfValor = new JTextField();
		tfValor.setBounds(62, 56, 86, 20);
		contentPane.add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblPosio = new JLabel("Posi\u00E7\u00E3o:");
		lblPosio.setBounds(168, 59, 46, 14);
		contentPane.add(lblPosio);
		
		tfPos = new JTextField();
		tfPos.setBounds(224, 56, 86, 20);
		contentPane.add(tfPos);
		tfPos.setColumns(10);
		
		JLabel lblTamanhoDoVetor = new JLabel("Tamanho do vetor:");
		lblTamanhoDoVetor.setBounds(10, 11, 98, 14);
		contentPane.add(lblTamanhoDoVetor);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(115, 8, 46, 20);
		contentPane.add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atual = new VetorDeReais(Integer.parseInt(tfTamanho.getText()));
				textArea.setText("Novo objeto de Vetor de Reais criado com tamanho "
								 +atual.getTamanho());
			}
		});
		btnCriar.setBounds(168, 7, 89, 23);
		contentPane.add(btnCriar);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				atual.setValor(Double.parseDouble(tfValor.getText()), 
						       Integer.parseInt(tfPos.getText()));
				} catch (ArrayIndexOutOfBoundsException excecao) {
					JOptionPane.showMessageDialog(contentPane, "Posição do vetor inválida.Redigite.");
				} catch (NullPointerException npe) {
					JOptionPane.showMessageDialog(contentPane, "Vetor inexistente. Digite um tamanho e clique em Criar.");					
				} catch (Exception excecao) {
					JOptionPane.showMessageDialog(contentPane, excecao.getClass().getName()+"-"+excecao.getMessage());
				}
			}
		});
		btnIncluir.setBounds(323, 55, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnVerOVetor = new JButton("Ver o vetor");
		btnVerOVetor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\nVetor = "+atual.exibir());
			}
		});
		btnVerOVetor.setBounds(323, 89, 89, 23);
		contentPane.add(btnVerOVetor);
		
		JButton btnGuardarOVetor = new JButton("Guardar o vetor");
		btnGuardarOVetor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outro = atual;
			}
		});
		btnGuardarOVetor.setBounds(314, 123, 110, 23);
		contentPane.add(btnGuardarOVetor);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 173, 402, 78);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res = atual.multiplicar(outro);
				textArea.append("\nVetor multiplicador = "+outro.exibir());
				textArea.append("\nMultiplicação = "+res);
			}
		});
		btnMultiplicar.setBounds(10, 89, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VetorDeReais resultado = atual.dividir(outro);
				textArea.append("\nVetor divisor = "+outro.exibir());
				textArea.append("\nResultado = "+resultado.exibir());
			}
		});
		btnDividir.setBounds(115, 89, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnQuantosPares = new JButton("Quantos pares?");
		btnQuantosPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\nQuantos pares? "+atual.getQtdPares());
			}
		});
		btnQuantosPares.setBounds(10, 123, 110, 23);
		contentPane.add(btnQuantosPares);
		
		JButton btnInverter = new JButton("Inverter");
		btnInverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atual.inverter();
			}
		});
		btnInverter.setBounds(221, 89, 89, 23);
		contentPane.add(btnInverter);
		
		JButton btnMaiorDiferena = new JButton("Maior diferen\u00E7a?");
		btnMaiorDiferena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\nMaior diferença = "+atual.getMaiorDiferenca());
			}
		});
		btnMaiorDiferena.setBounds(130, 123, 127, 23);
		contentPane.add(btnMaiorDiferena);
	}
}