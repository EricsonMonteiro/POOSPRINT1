


import javax.swing.*;
import java.awt.*;


public class PedradaDigital {





        public static void main (String args[]){





            JFrame janela = new JFrame("pedrada-main-Pedrada");
            janela.setVisible(true);
            janela.setSize(800, 800);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            janela.setLayout(new java.awt.BorderLayout());

            JLabel titulo = new JLabel("Rede Social- PedradaDigital", JLabel.CENTER);
            titulo.setOpaque(true);
            titulo.setBackground(Color.GRAY);
            JPanel barrastatus = new JPanel();


            JTextArea jt = new JTextArea(5,5);
            jt.setLineWrap(true);
            jt.setWrapStyleWord(true);

            janela.add(jt, BorderLayout.CENTER);



            barrastatus.add(new JLabel("Pedradadigital > "));
            barrastatus.add(new JTextField(95));
            barrastatus.setBackground(Color.GRAY);




            janela.add(titulo, BorderLayout.NORTH);
            janela.add(barrastatus, BorderLayout.SOUTH);
            janela.setVisible(true);

//        JLabel mensagem = new JLabel("Mensagem:");
//        janela.add(mensagem, BorderLayout.SOUTH);


            //___________________________________________________________________//







            //-----------------------------------------------------------------------//

            JPanel contentorBtn = new JPanel(new GridBagLayout() );
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 10, 2, 10); // Margens para os botões

            JButton LoginBtn = new JButton("Login");
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
        //   gbc.anchor = GridBagConstraints.CENTER;
            gbc.weightx = 0.0;

            contentorBtn.add(LoginBtn, gbc);

            JButton ExecutBtn = new JButton("Executar");
            gbc.gridx = 0;
            gbc.gridy = 2;

            contentorBtn.add(ExecutBtn, gbc);

            JButton LogoutBtn = new JButton("Logout");
            gbc.gridx = 0;
            gbc.gridy = 3;

            contentorBtn.add(LogoutBtn, gbc);

            janela.add(contentorBtn, BorderLayout.EAST);


            janela.add(contentorBtn, BorderLayout.EAST);
            janela.setVisible(true);

//            JLabel sms = new JLabel("Mensagem",JLabel.CENTER);
//            sms.setOpaque(true);
//            janela.add(sms,BorderLayout.SOUTH);











        }


}
