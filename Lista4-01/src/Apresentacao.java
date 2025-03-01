
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.MaskFormatter;
import javax.swing.GroupLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private HashMap<String, Telefone> rede = new HashMap();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
		TelefoneComercial.setDataBase(LocalDate.of(2017, 1, 1));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")

	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		try {
			jTextField1 = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		} catch (ParseException pe) {
			
		}
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton1.setSelected(true);
		jRadioButton2 = new javax.swing.JRadioButton();
		buttonGroup1.add(jRadioButton2);
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 4 - 01");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jLabel1.setText("N�mero do telefone:");

		jLabel2.setText("Nome do cliente:");

		jLabel3.setText("Endere�o de instala��o:");

		jLabel4.setText("Data de instala��o:");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("Residencial");
		jRadioButton2.setText("Comercial");

		jCheckBox1.setText("Possui internet");

		jLabel5.setText("Ramo Ativ:");

		jButton1.setText("Cadastrar telefone");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel6.setText("Telefone a consultar:");

		jButton2.setText("OK");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Faturamento");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		JRadioButton rdbtnEspecializado = new JRadioButton("Especializado");
		buttonGroup1.add(rdbtnEspecializado);

		JLabel lblOcorrncias = new JLabel("Ocorr\u00EAncias:");

		jTextField7 = new JTextField();
		jTextField7.setColumns(10);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel4)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jTextField3, 291, 291, 291))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup().addComponent(jRadioButton1).addGap(36))
										.addGroup(layout.createSequentialGroup().addComponent(jCheckBox1).addGap(18)))
								.addGap(82)
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jRadioButton2)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel5)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jButton1).addComponent(jTextField5,
																GroupLayout.PREFERRED_SIZE, 76,
																GroupLayout.PREFERRED_SIZE)))))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel6)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jButton2))
						.addGroup(Alignment.TRAILING,
								layout.createSequentialGroup()
										.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(95)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(rdbtnEspecializado)
						.addGroup(layout.createSequentialGroup().addComponent(lblOcorrncias)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addComponent(jButton3))
				.addGap(244)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(17)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(jTextField1,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(jTextField2,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3).addComponent(jTextField3,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4).addComponent(jTextField4,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addComponent(jRadioButton1)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jCheckBox1))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(jRadioButton2)
										.addComponent(rdbtnEspecializado))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblOcorrncias)
										.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5).addComponent(jTextField5, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGap(18).addComponent(jButton1).addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addComponent(
						jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel6)
						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton2).addComponent(jButton3))
				.addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Telefone t;
		try {
			if (!rede.containsKey(jTextField1.getText())) {
				if (jRadioButton1.isSelected()) {
					t = new TelefoneResidencial();
					((TelefoneResidencial)t).setConexaoInternet(jCheckBox1.isSelected());
				} else if (jRadioButton2.isSelected()) {
					t = new TelefoneComercial();
					((TelefoneComercial)t).setRamoAtividade(jTextField5.getText());
				} else {
					t = new TelefoneEspecializado();
					((TelefoneEspecializado)t).setQtdOcorrencias(Integer.parseInt(jTextField7.getText()));
				}
				t.setNumero(jTextField1.getText());
				t.setNomeUsuario(jTextField2.getText());
				t.setEndereco(jTextField3.getText());
				t.setDataInstalacao(LocalDate.parse(jTextField4.getText(), formatter));
				rede.put(t.getNumero(), t);
				JOptionPane.showMessageDialog(this, "Telefone cadastrado:" + t.getNumero());
			} else {
				JOptionPane.showMessageDialog(this, "J� h� telefone com este n�mero");
			}
		} catch (DateTimeParseException pe) {
			JOptionPane.showMessageDialog(this, "Data inv�lida");
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Deve conter apenas d�gitos");
		} catch (IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(this, iae.getMessage());
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		float total = 0;
		for (Telefone t : rede.values()) {
			total += t.getValorBasico(); // polimorfismo
		}
		JOptionPane.showMessageDialog(this, "Faturamento R$" + total);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Telefone t = rede.get(jTextField6.getText());
		String str;
		if (t == null) {
			str = "N�mero n�o localizado";
		} else {
			str = t.exibir(); // polimorfismo
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		rede = null;
		System.gc(); // for�ar o garbage collector para vermos os objetos sendo destru�dos
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JSeparator jSeparator1;
	private JFormattedTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private JTextField jTextField7;
}
