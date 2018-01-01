import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class Codice_finito extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Codice_finito frame = new Codice_finito("title");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param string 
	 */
	public Codice_finito(String string) {
		setFont(new Font("AnjaliOldLipi", Font.PLAIN, 19));
		setTitle("Decriptatore Codice di Cesare-1.0.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblFraseDaDecifrare = new JLabel("Frase da decifrare");
		lblFraseDaDecifrare.setFont(new Font("Century Schoolbook L", Font.BOLD, 14));
		lblFraseDaDecifrare.setBounds(12, 46, 147, 15);
		getContentPane().add(lblFraseDaDecifrare);
		
		JLabel lblCifreDiSpostamento = new JLabel("Cifre di spostamento");
		lblCifreDiSpostamento.setFont(new Font("Century Schoolbook L", Font.BOLD, 14));
		lblCifreDiSpostamento.setBounds(12, 109, 163, 15);
		getContentPane().add(lblCifreDiSpostamento);
		
		JLabel lblFraseDecifrata = new JLabel("Frase decifrata");
		lblFraseDecifrata.setFont(new Font("Century Schoolbook L", Font.BOLD, 14));
		lblFraseDecifrata.setBounds(12, 226, 147, 15);
		getContentPane().add(lblFraseDecifrata);
		
		textField = new JTextField();
		textField.setBounds(227, 44, 174, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		{
			for(int x = -99; x<99; x++)
			{
		       comboBox.addItem(""+x);
			}
		}
		comboBox.setBounds(323, 104, 78, 24);
		getContentPane().add(comboBox);
		
		final JLabel labelFine = new JLabel("");
		labelFine.setBackground(Color.WHITE);
		labelFine.setForeground(Color.BLACK);
		labelFine.setBounds(227, 226, 174, 15);
		getContentPane().add(labelFine);
		 { //Value is null }//y 	= comboBox.getSelectedIndex(); 
		JButton btnDecripta = new JButton("Decripta");
		btnDecripta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String frase = textField.getText();
				char[] h = frase.toCharArray();
				int y = comboBox.getSelectedIndex() - 99;
				for (int  i=0; i<frase.length(); i++)
				{
					
					
					h [i]= (char)(h[i] + y);
					
					
					
					
			
				}
				String j = new String();
				for(int i = 0; i < frase.length(); i++)
					{
						j = j + h[i];
						
					}
		       labelFine.setText(""+j);	
		
			}
		});
		btnDecripta.setBounds(288, 167, 117, 25);
		getContentPane().add(btnDecripta);
	}
	/*private char[] acquisizioneStringa(String frase)
	{
		char[] h = frase.toCharArray();
		for (int i=0; i<frase.length(); i++)
		{
		
			h [i]= (char) (h[i] + 
			return h;
	
		}
		
	}*/
}
}
