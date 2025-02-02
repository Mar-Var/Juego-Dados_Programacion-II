package co.edu.uptc.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.uptc.modelo.GameManagement;

public class HandlingEvents implements ActionListener {
	
 	static final String ABOUT_US="Acerca de...";
 	static final String CONFIGURATION_PARAMETERS="Par�metros Configuraci�n";
 	static final String NEW_GAME="Nuevo Juego";
 	static final String START_GAME= "Iniciar Juego";
 	static final String THROW_DICE="Jugador numero";
 	private MainWindow mainWindows;
 	private GameManagement gameManagement= new GameManagement();

	
	public HandlingEvents(MainWindow mainWindows) {
		this.mainWindows=mainWindows;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		switch (actionEvent.getActionCommand()) {
		case START_GAME:

			gameManagement.gameInit(mainWindows.getCbPlayersNumber().getSelectedIndex()+1
					, mainWindows.getCbLevel().getSelectedItem().toString());			
			mainWindows.getBtnThrowPlayer().setLabel("Jugador Numero "+gameManagement.getCurrentTurn());
			mainWindows.getBtnStartGame().setEnabled(false);
			mainWindows.getCbPlayersNumber().setEnabled(false);
			mainWindows.getBtnThrowPlayer().setEnabled(true);
			mainWindows.getCbLevel().setEnabled(false);
			mainWindows.getBtnConfigurationParameters().setEnabled(false);
			mainWindows.getBtnAbout().setEnabled(true);
			mainWindows.getBtnNewGame().setEnabled(true);
			break;
		case CONFIGURATION_PARAMETERS:
			boolean state=false;
			String maxPlayers="";
			maxPlayers=JOptionPane.showInputDialog(null,"Ingrese la cantidad maxima de jugadores");
			if(maxPlayers==null) {
				JOptionPane.showMessageDialog(null, "Proceso cancelado. Numero de jugadores por defecto");
				break;
			}
			
			while (maxPlayers.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe ingresar un numero por lo menos ");
				
			}
			while(state==false) {
				try {
					double maxplayers=Double.parseDouble(maxPlayers);
					int paxplayers=(int) maxplayers;
					gameManagement.setMaxNumberPlayers(paxplayers);
					mainWindows.getCbPlayersNumber().removeAllItems();
					for (int i = 0; i < paxplayers; i++) {
						mainWindows.getCbPlayersNumber().addItem(i+1);
					}
					state=true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null,"Lo ingresado no es un numero.Ingrese un numero valido" );
					maxPlayers=JOptionPane.showInputDialog(null,"Ingrese la cantidad maxima de jugadores");
					state=false;
				}
			}
			break;
		case NEW_GAME:
			
			this.gameManagement=new GameManagement();
			mainWindows.getLbAdvancedPositionsNumber().setText("99");
			mainWindows.getLbPairsNumbers().setText("XXX-XX");
			mainWindows.getLbRemainingPositionsNumber().setText("99");
			mainWindows.getLbReturnsNumber().setText("99");
			mainWindows.getLbShiftPlayerNumber().setText("99");
			mainWindows.getLbWinnerNumber().setText("XXXXX-XXXXXXX");
			mainWindows.getCbLevel().setSelectedIndex(0);
			mainWindows.getCbPlayersNumber().setSelectedIndex(0);
			mainWindows.getCbPlayersNumber().removeAllItems();
			mainWindows.getCbPlayersNumber().addItem(1);
			mainWindows.getCbPlayersNumber().addItem(2);
			
			mainWindows.getBtnStartGame().setEnabled(true);
			mainWindows.getCbPlayersNumber().setEnabled(true);
			mainWindows.getCbLevel().setEnabled(true);
			mainWindows.getBtnConfigurationParameters().setEnabled(true);
			mainWindows.getBtnAbout().setEnabled(true);
			mainWindows.getBtnNewGame().setEnabled(false);
			mainWindows.getBtnThrowPlayer().setLabel("Jugador");
			mainWindows.getBtnThrowPlayer().setEnabled(false);
			
			mainWindows.getLbWinnerNumber().setForeground(Color.BLACK);
			
			break;
		case ABOUT_US:
			String mensaje="Integrantes:\n"
					+ "Marcos Esteban Vargas Avella. Codigo 201620364\n"
					+ "Jherson Mauricio Baez Paco. Codigo 3228946818\n"
					+ "Instrucciones:\n"
					+ "1. Para a�adir una cantidad maxima a el numero de participantes vaya a\n"
					+ "Configuracion Parametros\n"
					+ "2. Para un nuevo juego presione Nuevo Juego\n"
					+ "3. Para iniciar una juego presione en Iniciar juego\n"
					+ "Importante:\n"
					+ "1.Cada vez que presiones en el boton Jugador Numero el boton se desactivara por 3 segundos.\n"
					+ "2.Una vez haya una ganador se desactivaran los botones Jugador Numero ## e Iniciar juego\n"
					+ "  y el numero ganador se resaltara en rojo";
			JOptionPane.showMessageDialog(null, mensaje);
			break;
		case THROW_DICE:
			gameManagement.playGame(mainWindows.getLbShiftPlayerNumber()
					, mainWindows.getLbAdvancedPositionsNumber()
					, mainWindows.getLbRemainingPositionsNumber()
					, mainWindows.getLbScore()
					, mainWindows.getLbPairsNumbers()
					, mainWindows.getLbWinnerNumber()
					, mainWindows.getBtnThrowPlayer()
					, mainWindows.getLbIconImage1()
					, mainWindows.getLbIconImage2()
					, mainWindows.getLbReturnsNumber()
					, mainWindows.getBtnConfigurationParameters()
					,mainWindows.getBtnStartGame());
			break;

		default:
			break;
		}
	}

}
