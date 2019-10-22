
/*
 * Apresentacao.java
 * 
 * faltando a listagem dos alunos em ordem alfabética
 */

package view;

import model.Aluno;
import model.AlunoEnsinoMedio;
import model.AlunoUniversitario;
import model.Curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

    private ArrayList<Aluno> matriculados = new ArrayList();
    private HashMap<String,Curso> cursos = new HashMap();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    /** Creates new form Apresentacao */
    public Apresentacao() {
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent arg0) {
    			matriculados = null;
    			System.gc(); // chamando o garbage collector para forçar a destruição dos objetos, perdidos na linha anterior
    			JOptionPane.showMessageDialog(null, "Olhe a console para acompanhar a destruição dos objetos");
    		}
    	});
        initComponents();
        // ao invés de criar uma funcionalidade na interface com usuário para cadastrar os cursos,
        // estou criando uma dúzia de cursos para facilitar
        Curso c = new Curso("BCC","Ciência da Computação");
        cursos.put(c.getSigla(),c);
        c = new Curso("ADM","Administração");
        cursos.put(c.getSigla(),c);
        c = new Curso("SIS","Sistemas de Informação");
        cursos.put(c.getSigla(),c);
        c = new Curso("PED","Pedagogia");
        cursos.put(c.getSigla(),c);
        c = new Curso("CSO","Ciências Sociais");
        cursos.put(c.getSigla(),c);
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista 4 - Exercício 2");

        jLabel1.setText("Nome do aluno:");

        jLabel2.setText("Data Nascimento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Universitário", "Ensino Médio" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ano:");
        jLabel3.setEnabled(false);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        jComboBox2.setEnabled(false);

        jLabel4.setText("Sigla do curso:");

        jButton1.setText("Cadastrar aluno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar alunos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        
       
        jComboBox3.setModel(new DefaultComboBoxModel(new String[] {"Vestibular", "ENEM", "Seletivo especial", "Transf. Externa", "Transf. Interna"}));
        
        jLabel5 = new JLabel("Ingresso por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton2)
        						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel2)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(jTextField2))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel1)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(45)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jButton1)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel4)
        									.addGap(18)
        									.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jLabel5)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        					.addGap(174)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5)
        				.addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Aluno atual;
        try {
            if (jComboBox1.getSelectedIndex() == 0){ // Universidade
            	Curso c = cursos.get(jTextField3.getText().toUpperCase());
                atual = new AlunoUniversitario(jTextField1.getText(),
                								LocalDate.parse(jTextField2.getText(),formatter),
                								((String)jComboBox3.getSelectedItem()).charAt(0),
                								c);
            } else {  // EnsinoMedio
            	String strAno = (String)jComboBox2.getSelectedItem();
                byte ano = Byte.parseByte(strAno);
                atual = new AlunoEnsinoMedio(jTextField1.getText(),
						LocalDate.parse(jTextField2.getText(),formatter),
						ano);
            }
            matriculados.add(atual);
            JOptionPane.showMessageDialog(this,"Aluno cadastrado: "+atual.getNome());
        } catch (DateTimeParseException nfe){
            JOptionPane.showMessageDialog(this, "Data com formato inválido");
        } catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(this, iae.getMessage());
        } 

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       jTextArea1.setText("Dados dos alunos\n");

       for (Aluno a:matriculados){
           jTextArea1.append("\n"+a.mostra());  // polimorfismo
       }

    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // manipulação da interface com usuário
        if (jComboBox1.getSelectedIndex() == 0){ // Universidade
            jLabel3.setEnabled(false);
            jComboBox2.setEnabled(false);
            jLabel4.setEnabled(true);
            jTextField3.setEnabled(true);
            jLabel5.setEnabled(true);
            jComboBox3.setEnabled(true);
        } else {
            jLabel3.setEnabled(true);
            jComboBox2.setEnabled(true);
            jLabel4.setEnabled(false);
            jTextField3.setEnabled(false);
            jLabel5.setEnabled(false);
            jComboBox3.setEnabled(false);
        }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private JLabel jLabel5;
}
