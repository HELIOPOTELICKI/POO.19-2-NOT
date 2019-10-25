
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara("Blumenau");
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Vereador atualVer;
	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMenorDesempenho();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Menor desempenho\n\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = "
							+ v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jButton4 = new javax.swing.JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMaisProjAprov();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Mais projetos cadastrados\n\n" + v.getNome() + " do partido " + v.getPartido().getNome()
							+ " = " + v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Partido p = camara.getPartido(Integer.parseInt(jTextField7.getText()));
					String str;
					if (p == null) {
						str = "Não há partido com este número";
					} else {
						str = "Partido " + p.getNome() + "\n\nTotal de projetos aprovados = " + p.getTotalProjAprov()
								+ "\nTotal de projetos apresentados = " + p.getTotalProjApres()
								+ "\nMédia de desempenho do partido = " + p.getMediaDesempenho();
					}
					JOptionPane.showMessageDialog(jTabbedPane1, str);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(jTabbedPane1, "Digite um número de partido válido");
				}
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 4 - Exerc\u00EDcio 4");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jButton1.setText("Cadastrar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jButton1).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jButton2.setText("Cadastrar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(jTextField3,
														GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(jLabel8, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(138).addComponent(jButton2)))
				.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(19)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3).addComponent(
						jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
				.addGap(18).addComponent(jButton2).addGap(148)));
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Vereador", jPanel2);

		jButton3.setText("Vereador menor desempenho");

		jButton4.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jButton5.setText("Estatísticas do partido");

		jButton6.setText("Total de projetos da Câmara");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Vereadores acima da média");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		JPanel panel = new JPanel();
		jTabbedPane1.addTab("Projetos", null, panel, null);
		panel.setLayout(null);

		lblVereadorProjetos = new JLabel("");
		lblVereadorProjetos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVereadorProjetos.setBounds(34, 11, 273, 14);
		panel.add(lblVereadorProjetos);

		lblTtuloDoProjeto = new JLabel("T\u00EDtulo do projeto:");
		lblTtuloDoProjeto.setBounds(10, 47, 96, 14);
		panel.add(lblTtuloDoProjeto);

		tfTituloProj = new JTextField();
		tfTituloProj.setBounds(116, 36, 218, 28);
		panel.add(tfTituloProj);
		tfTituloProj.setColumns(10);

		JLabel lblDataDaApresentao = new JLabel("Data da apresenta\u00E7\u00E3o:");
		lblDataDaApresentao.setBounds(10, 78, 111, 14);
		panel.add(lblDataDaApresentao);

		tfDataApresentacao = new JTextField();
		tfDataApresentacao.setBounds(126, 67, 121, 28);
		panel.add(tfDataApresentacao);
		tfDataApresentacao.setColumns(10);

		JLabel lblDataDaAprovao = new JLabel("Data da aprova\u00E7\u00E3o:");
		lblDataDaAprovao.setBounds(10, 112, 111, 14);
		panel.add(lblDataDaAprovao);

		tfDataAprovacao = new JTextField();
		tfDataAprovacao.setBounds(116, 103, 121, 23);
		panel.add(tfDataAprovacao);
		tfDataAprovacao.setColumns(10);

		JLabel lblSeForPlc = new JLabel("Se for PLC, preencha os dados abaixo:");
		lblSeForPlc.setBounds(10, 146, 210, 14);
		panel.add(lblSeForPlc);

		JLabel lblArtigoDaLei = new JLabel("Artigo da Lei Org\u00E2nica:");
		lblArtigoDaLei.setBounds(10, 171, 130, 14);
		panel.add(lblArtigoDaLei);

		tfArtigoLO = new JTextField();
		tfArtigoLO.setBounds(134, 160, 86, 28);
		panel.add(tfArtigoLO);
		tfArtigoLO.setColumns(10);

		JLabel lblQuantidadeDeVotos = new JLabel("Quantidade de votos favor\u00E1veis:");
		lblQuantidadeDeVotos.setBounds(10, 196, 177, 14);
		panel.add(lblQuantidadeDeVotos);

		tfVotos = new JTextField();
		tfVotos.setBounds(197, 193, 86, 23);
		panel.add(tfVotos);
		tfVotos.setColumns(10);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ProjetoDeLei pl;
					if (tfArtigoLO.getText().isEmpty()) {
						pl = new ProjetoDeLei(tfTituloProj.getText(),
								LocalDate.parse(tfDataApresentacao.getText(), formatter));
					} else {
						int qtdVotos = 0;
						if (!tfVotos.getText().isEmpty()) {
							qtdVotos = Integer.parseInt(tfVotos.getText());
						}
						pl = new ProjetoDeLeiComplementar(tfTituloProj.getText(),
								LocalDate.parse(tfDataApresentacao.getText(), formatter), qtdVotos,
								tfArtigoLO.getText());
					}
					LocalDate da = null;
					if (!tfDataAprovacao.getText().isEmpty()) {
						da = LocalDate.parse(tfDataAprovacao.getText(), formatter);
					}
					pl.setDataAprovacao(da);
					atualVer.addProjeto(pl);
					JOptionPane.showMessageDialog(panel, "Projeto inserido\n"+pl.mostrar());
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(panel, "Número inválido");
				} catch (DateTimeParseException exc) {
					JOptionPane.showMessageDialog(panel, "Data inválida");
				}
			}
		});
		btnInserir.setBounds(131, 225, 89, 23);
		panel.add(btnInserir);
		
		btnMostrarTodosOs = new JButton("Mostrar todos os dados");
		btnMostrarTodosOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = "Listagem geral\n\n";
				for (Partido p: camara.getPartidos()) {
					for (Vereador v: p.getListaVereadores()) {
						str += "\n"+v.exibir();
					}
				}
				JOptionPane.showMessageDialog(panel, str);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(jButton5))))
						.addComponent(jButton3)
						.addComponent(jButton4)
						.addComponent(jButton6)
						.addComponent(jButton7)
						.addComponent(btnMostrarTodosOs))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9)
						.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton5))
					.addGap(13)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jButton3)
					.addGap(18)
					.addComponent(jButton4)
					.addGap(18)
					.addComponent(jButton6)
					.addGap(18)
					.addComponent(jButton7)
					.addGap(18)
					.addComponent(btnMostrarTodosOs)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addGap(28, 28, 28)));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String str;
		try {
			if (camara.getPartido(Integer.parseInt(jTextField1.getText())) == null) {
				Partido partido = new Partido(jTextField2.getText(), Integer.parseInt(jTextField1.getText()));
				camara.addPartido(partido);
				str = "Partido cadastrado";
			} else {
				str = "Já há partido com este número. Escolha outro número";
			}
		} catch (IllegalArgumentException iae) {
			str = iae.getMessage();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido p = camara.getPartido(Integer.parseInt(jTextField4.getText()));
		if (p == null) {
			jLabel8.setText("Número do partido não localizado");
		} else {
			try {
				jLabel8.setText(p.getNome());
				atualVer = new Vereador();
				atualVer.setNome(jTextField3.getText());
				p.addVereador(atualVer);
				lblVereadorProjetos.setText(atualVer.getNome() + " - " + p.getNome());
				JOptionPane.showMessageDialog(this, "Vereador cadastrado com desempenho " + atualVer.getDesempenho()
						+ "\n Cadastre os projetos na próxima aba");

			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(this, iae.getMessage());
			}
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int aprov = camara.getTotalProjAprov();
		int apres = camara.getTotalProjApres();
		String str = "Total de projetos aprovados = " + aprov + "\nTotal de projetos apresentados = " + apres;
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		List<Vereador> acima = camara.getVereadoresAcimaMedia();
		String str = "Vereadores acima da média (" + camara.getMediaDesempenho() + ")\n";
		for (Vereador v : acima) {
			str += "\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = " + v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, str);
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
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField7;
	private JLabel lblVereadorProjetos;
	private JLabel lblTtuloDoProjeto;
	private JTextField tfTituloProj;
	private JTextField tfDataApresentacao;
	private JTextField tfDataAprovacao;
	private JTextField tfArtigoLO;
	private JTextField tfVotos;
	private JButton btnMostrarTodosOs;
}
