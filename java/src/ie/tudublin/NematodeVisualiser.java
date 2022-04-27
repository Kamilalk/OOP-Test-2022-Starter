package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{	
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>(); 

	int option = 0; 

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			option = option -1;
		}	
		if (keyCode == RIGHT)
		{
			option = option +1;
		}	
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		loadNematodes();
		//drawNematodes(); when draw nodes is not commented the names disappear and it does not itterate through the list
		printNematodes();
		smooth();				
	}

	void printNematodes()
	{
		for(Nematode n:nematodes)
		{
			System.out.println(n);
		}
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}

	}
    public void drawNematodes()
    {
        for(Nematode n:nematodes)
        {
            n.render(this);
        }
    }


	public void draw()
	{	
		int Size = nematodes.size();
		int userOption = option % Size;
		clear();
		String Name = nematodes.get(userOption).name;
		textSize(40);
		text(Name, 400, 50);

	}
}
