package co.edu.uptc.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MainWindow extends JFrame {
	
	JLabel lbTile;
	
	JPanel pnBodyProgram;
	
	JPanel pnConfiguration;
	JLabel lbPlayersNumber;
	JComboBox cbPlayersNumber;
	JLabel lbLevel;
	JComboBox cbLevel;
	JButton btnStartGame;
	
	JPanel pnResults;
	JLabel lbShiftPlayer;
	JLabel lbShiftPlayerNumber;
	JLabel lbAdvancedPositions;
	JLabel lbAdvancedPositionsNumber;
	JLabel lbRemainingPositions;
	JLabel lbRemainingPositionsNumber;
	JLabel lbReturns;
	JLabel lbReturnsNumber;

	JPanel pnComboButtons;
	JButton btnConfigurationParameters;
	JButton btnNewGame;
	JButton btnAbout;
	
	JPanel pnGameZone;
	JPanel pnComboImagen;
	JLabel lbIconImage1;
	JLabel lbIconImage2;
	JLabel lbScore;
	JButton btnThrowPlayer;
	
	JPanel pnPares;
	JLabel lbPairsNumbers;
	
	JPanel pnWinner;
	JLabel lbWinnerNumber;
	
	HandlingEvents handlingEvents = new HandlingEvents(this);
	
	
	

	public MainWindow() {
		super("Rapidos y Furiosos");
		setSize( new Dimension(650,420));// Ajustar tama�o de ventana		
		setDefaultCloseOperation(EXIT_ON_CLOSE);// Decir que pasa cuando se cierre la ventana
		setResizable(false);
		setLayout(new GridBagLayout());
	}
	
	public void begin() {
		createComponents();
		addComponents();
		
	}
	

	private void addComponents() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridy=0;
		gbc.gridx=0;
		gbc.insets=new Insets(5, 5, 5, 5);
		gbc.anchor=GridBagConstraints.CENTER;
		add(lbTile,gbc);
		gbc.anchor=GridBagConstraints.EAST;

		gbc.gridy=1;
		add(pnBodyProgram,gbc);
		addComponentsBodyProgram();
		
	}
	private void addComponentsBodyProgram() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridy=0;
		gbc.gridx=0;
		pnBodyProgram.add(pnConfiguration,gbc);
		addComponenetsPnConfiguration();
		
		gbc.gridx=1;
		pnBodyProgram.add(pnResults,gbc);
		addComponenetsPnResults();
		
		gbc.gridx=2;
		pnBodyProgram.add(pnComboButtons,gbc);
		addComponenetsPnComboButtons();

		
		gbc.gridy=1;
		gbc.gridx=0;
		pnBodyProgram.add(pnGameZone,gbc);
		addComponenetsPnGameZone();

		
		gbc.gridx=1;
		pnBodyProgram.add(pnPares,gbc);
		
		gbc.gridx=2;
		pnBodyProgram.add(pnWinner,gbc);
	}
	
	private void addComponenetsPnConfiguration() {
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridy=0;
		gbc1.gridx=0;
		gbc1.fill=GridBagConstraints.HORIZONTAL;
		gbc1.weightx=1.0;
		gbc1.insets = new Insets(5,5,5,5);
		gbc1.anchor=GridBagConstraints.WEST;
		gbc1.gridwidth=1;
		pnConfiguration.add(lbPlayersNumber,gbc1);
		gbc1.gridy=1;
		pnConfiguration.add(cbPlayersNumber,gbc1);
		gbc1.gridy=2;
		pnConfiguration.add(lbLevel,gbc1);
		gbc1.gridy=3;
		pnConfiguration.add(cbLevel,gbc1);
		gbc1.fill=GridBagConstraints.NONE;
		gbc1.anchor=GridBagConstraints.CENTER;
		gbc1.gridy=4;
		pnConfiguration.add(btnStartGame,gbc1);
		gbc1.anchor=GridBagConstraints.NONE;

		
		
	}
	private void addComponenetsPnResults() {
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.insets = new Insets(5,10,5,10);
		gbc2.gridy=0;
		gbc2.gridx=0;
		gbc2.anchor=GridBagConstraints.WEST;
		pnResults.add(lbShiftPlayer,gbc2);
		gbc2.gridx=1;
		pnResults.add(lbShiftPlayerNumber,gbc2);
		gbc2.gridy=1;
		gbc2.gridx=0;
		pnResults.add(lbAdvancedPositions,gbc2);
		gbc2.gridx=1;
		pnResults.add(lbAdvancedPositionsNumber,gbc2);
		gbc2.gridy=2;
		gbc2.gridx=0;
		pnResults.add(lbRemainingPositions,gbc2);
		gbc2.gridx=1;
		pnResults.add(lbRemainingPositionsNumber,gbc2);
		gbc2.gridy=3;
		gbc2.gridx=0;
		pnResults.add(lbReturns,gbc2);
		addComponenetsPnPares();
		gbc2.gridx=1;
		pnResults.add(lbReturnsNumber,gbc2);
		addComponenetsPnWinner();
	}
	private void addComponenetsPnComboButtons() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.insets= new Insets(5, 5, 5, 5);
		gbc.anchor=GridBagConstraints.NORTH;
		pnComboButtons.add(btnConfigurationParameters,gbc);
		gbc.gridy=1;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		pnComboButtons.add(btnNewGame,gbc);
		gbc.gridy=2;
		pnComboButtons.add(btnAbout,gbc);
		gbc.fill=GridBagConstraints.NONE;

	}
	private void addComponenetsPnGameZone() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets=new Insets(5, 5, 5, 5);
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridx=0;
		gbc.gridy=0;
		pnGameZone.add(pnComboImagen,gbc);
		addComponentspnComboImagen();
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridx=1;
		pnGameZone.add(lbScore,gbc);

		
		gbc.gridy=1;
		gbc.gridx=0;
		gbc.gridwidth=2;
		pnGameZone.add(btnThrowPlayer,gbc);
		gbc.gridwidth=1;
		
		
	}
	public void addComponentspnComboImagen() {
		GridBagConstraints gbcIcons = new GridBagConstraints();
		gbcIcons.insets= new Insets(5, 10, 5, 10);
		gbcIcons.gridx=0;
		gbcIcons.gridy=0;
		pnComboImagen.add(lbIconImage1,gbcIcons);
		gbcIcons.gridx=1;
		pnComboImagen.add(lbIconImage2,gbcIcons);
		
	}
	private void addComponenetsPnPares() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		pnPares.add(lbPairsNumbers);
		
	}
	private void addComponenetsPnWinner() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		pnWinner.add(lbWinnerNumber);
		
	}
	

	private void createComponents() {
		
		lbTile= new JLabel("JUEGO DE LOS DADOS");
		lbTile.setFont(new Font("Arial",Font.BOLD,24));
		//---------------------------------------------------------------------------------
		pnBodyProgram= new JPanel();
		pnBodyProgram.setLayout(new GridBagLayout());
		//---------------------------------------------------------------------------------
		pnConfiguration= new JPanel();
		pnConfiguration.setLayout(new GridBagLayout());
		pnConfiguration.setPreferredSize(new Dimension(200,200));
		pnConfiguration.setBorder(new TitledBorder("Configuracion"));
		
		lbPlayersNumber = new JLabel("N�mero de Jugadores");
		cbPlayersNumber= new JComboBox<Object>(new Object[] {"1","2"});
		lbLevel = new JLabel("Nivel");
		cbLevel=new JComboBox<>(new Object[] {"B�sico","Medio","Alto"});
		btnStartGame= new JButton("Iniciar Juego");
		btnStartGame.setActionCommand(HandlingEvents.START_GAME);
		btnStartGame.addActionListener(handlingEvents);
		
		
		pnResults= new JPanel();
		pnResults.setLayout(new GridBagLayout());
		pnResults.setPreferredSize(new Dimension(200,200));
		pnResults.setBorder(new TitledBorder("Resultados"));

		
		lbShiftPlayer= new JLabel("Jugador Turno");
		lbShiftPlayerNumber= new JLabel("99");
		lbAdvancedPositions= new JLabel("Posiciones Avanzadas");;
		lbAdvancedPositionsNumber=new JLabel("99");;
		lbRemainingPositions= new JLabel("Posiciones Restantes");;
		lbRemainingPositionsNumber=new JLabel("99");;
		lbReturns= new JLabel("Retornos");;
		lbReturnsNumber =new JLabel("99");;
		
		
		pnComboButtons = new JPanel();
		pnComboButtons.setPreferredSize(new Dimension(200,200));
		pnComboButtons.setLayout(new GridBagLayout());

		btnConfigurationParameters=new JButton("Par�metros Configuraci�n");
		btnConfigurationParameters.setActionCommand(HandlingEvents.CONFIGURATION_PARAMETERS);
		btnConfigurationParameters.addActionListener(handlingEvents);
		
		btnNewGame=new JButton("Nuevo Juego");
		btnNewGame.setEnabled(false);
		btnNewGame.setActionCommand(HandlingEvents.NEW_GAME);
		btnNewGame.addActionListener(new HandlingEvents(this));
		btnAbout=new JButton("Acerca de...");
		btnAbout.setEnabled(true);
		btnAbout.setActionCommand(HandlingEvents.ABOUT_US);
		btnAbout.addActionListener(new HandlingEvents(this));
		
		pnGameZone= new JPanel();
		pnGameZone.setPreferredSize(new Dimension(new Dimension(200,120)));
		pnGameZone.setLayout(new GridBagLayout());
		pnGameZone.setBorder(new TitledBorder("Zona de juego"));
		
		
		pnComboImagen = new JPanel();
		pnComboImagen.setLayout(new GridBagLayout());
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("img/gifdado2.gif").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("img/gifdado.gif").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		lbIconImage1=new JLabel();
		lbIconImage1.setIcon(imageIcon1);
		lbIconImage2=new JLabel(imageIcon2);;
		lbScore= new JLabel("99");
		btnThrowPlayer= new JButton("Jugador numero");// Necesario hacer cambios
		btnThrowPlayer.setEnabled(false);
		btnThrowPlayer.setActionCommand(HandlingEvents.THROW_DICE);
		btnThrowPlayer.addActionListener(handlingEvents);
		
		pnPares = new JPanel();
		pnPares.setPreferredSize(new Dimension(200,120));
		
		pnPares.setLayout(new GridBagLayout());
		lbPairsNumbers= new JLabel("XXX-XX");
		lbPairsNumbers.setFont(new Font("Arial",Font.BOLD,18));
		pnPares.setBorder(new TitledBorder("Pares"));// Es lo que debe cambiar
		
		pnWinner= new JPanel();
		pnWinner.setLayout(new GridBagLayout());
		pnWinner.setPreferredSize(new Dimension(200,120));
		lbWinnerNumber= new JLabel("XXXXX-XXXXXXX");// Es lo que debe cambiar
		lbWinnerNumber.setFont(new Font("Arial",Font.BOLD,18));
		pnWinner.setBorder(new TitledBorder("Ganador"));
		
		
	}

	public JLabel getLbPlayersNumber() {
		return lbPlayersNumber;
	}

	public void setLbPlayersNumber(JLabel lbPlayersNumber) {
		this.lbPlayersNumber = lbPlayersNumber;
	}

	public JComboBox getCbPlayersNumber() {
		return cbPlayersNumber;
	}

	public void setCbPlayersNumber(JComboBox cbPlayersNumber) {
		this.cbPlayersNumber = cbPlayersNumber;
	}

	public JComboBox getCbLevel() {
		return cbLevel;
	}

	public void setCbLevel(JComboBox cbLevel) {
		this.cbLevel = cbLevel;
	}

	public JButton getBtnStartGame() {
		return btnStartGame;
	}

	public void setBtnStartGame(JButton btnStartGame) {
		this.btnStartGame = btnStartGame;
	}

	public JLabel getLbShiftPlayerNumber() {
		return lbShiftPlayerNumber;
	}

	public void setLbShiftPlayerNumber(JLabel lbShiftPlayerNumber) {
		this.lbShiftPlayerNumber = lbShiftPlayerNumber;
	}

	public JLabel getLbAdvancedPositionsNumber() {
		return lbAdvancedPositionsNumber;
	}

	public void setLbAdvancedPositionsNumber(JLabel lbAdvancedPositionsNumber) {
		this.lbAdvancedPositionsNumber = lbAdvancedPositionsNumber;
	}

	public JLabel getLbRemainingPositionsNumber() {
		return lbRemainingPositionsNumber;
	}

	public void setLbRemainingPositionsNumber(JLabel lbRemainingPositionsNumber) {
		this.lbRemainingPositionsNumber = lbRemainingPositionsNumber;
	}

	public JLabel getLbReturnsNumber() {
		return lbReturnsNumber;
	}

	public void setLbReturnsNumber(JLabel lbReturnsNumber) {
		this.lbReturnsNumber = lbReturnsNumber;
	}

	public JButton getBtnConfigurationParameters() {
		return btnConfigurationParameters;
	}

	public void setBtnConfigurationParameters(JButton btnConfigurationParameters) {
		this.btnConfigurationParameters = btnConfigurationParameters;
	}

	public JButton getBtnNewGame() {
		return btnNewGame;
	}

	public void setBtnNewGame(JButton btnNewGame) {
		this.btnNewGame = btnNewGame;
	}

	public JButton getBtnAbout() {
		return btnAbout;
	}

	public void setBtnAbout(JButton btnAbout) {
		this.btnAbout = btnAbout;
	}

	public JLabel getLbIconImage1() {
		return lbIconImage1;
	}

	public void setLbIconImage1(JLabel lbIconImage1) {
		this.lbIconImage1 = lbIconImage1;
	}

	public JLabel getLbIconImage2() {
		return lbIconImage2;
	}

	public void setLbIconImage2(JLabel lbIconImage2) {
		this.lbIconImage2 = lbIconImage2;
	}

	public JLabel getLbScore() {
		return lbScore;
	}

	public void setLbScore(JLabel lbScore) {
		this.lbScore = lbScore;
	}

	public JButton getBtnThrowPlayer() {
		return btnThrowPlayer;
	}

	public void setBtnThrowPlayer(JButton btnThrowPlayer) {
		this.btnThrowPlayer = btnThrowPlayer;
	}

	public JLabel getLbPairsNumbers() {
		return lbPairsNumbers;
	}

	public void setLbPairsNumbers(JLabel lbPairsNumbers) {
		this.lbPairsNumbers = lbPairsNumbers;
	}

	public JLabel getLbWinnerNumber() {
		return lbWinnerNumber;
	}

	public void setLbWinnerNumber(JLabel lbWinnerNumber) {
		this.lbWinnerNumber = lbWinnerNumber;
	}

	
	
	
	

}
