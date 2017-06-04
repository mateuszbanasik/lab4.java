


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Timer;

import javax.swing.JApplet;

public class SpringApplet extends JApplet {

	public static final int WIDTH=640; // definiuje szerokosc oraz wysokosc appletu, które ustawiam w konfiguracjach RUN,
	public static final int HEIGHT=480; // zmiennych tych bede uzywac przy rysowaniu wektorów
	
	private SimEngine pole1;
	private SimTask pole2;
	private Timer timer1;
	
	
	public SpringApplet()
	{		
		
	}
	
	private static final long serialVersionUID = 1L;
	

	
	public void init()
	{
		SpringApplet applet1 = new SpringApplet();
		SimEngine silnik1 = new SimEngine(50,1,0.75,WIDTH/2,HEIGHT-100,10,50,10);
		SimTask simtask = new SimTask(pole1,applet1);
		Timer timerr1 = new Timer();
		pole1 = silnik1;
		pole2 = simtask;
		this.timer1 = timerr1;
		timer1.scheduleAtFixedRate(pole2, 1000, 1000);
		
	}
}