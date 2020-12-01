/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpanelImagen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro Campos Maestre
 */
public class JpanelImagen extends JPanel
{

    public JpanelImagen()
    {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(100, 100));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 100, 100);
        g.fillOval(30, 30, 5, 5);
        g.fillOval(60, 30, 5, 5);
        
    }

}
