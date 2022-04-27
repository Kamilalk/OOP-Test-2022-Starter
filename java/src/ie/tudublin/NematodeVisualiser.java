package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{	

	private String name;
	private float length;
	private boolean limbs;
	private String gender;
	private boolean eyes;

	@Override
	public String toString() {
		return "NematodeVisualiser [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs
				+ ", name=" + name + "]";
	}

	public NematodeVisualiser(TableRow tr)
	{
		this(
			tr.getString("Display Name"),
			tr.getFloat("Length"),
			tr.getInt("Limbs") == 1,
			tr.getString("Gender"),
			tr.getInt("Eyes") == 1
		);
		
	}

	public NematodeVisualiser(String name, float length, boolean limbs, String gender, boolean eyes) {
		this.name = name;
		this.length = length;
		this.limbs = limbs;
		this.gender = gender;
		this.eyes = eyes;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public boolean isLimbs() {
		return limbs;
	}


	public void setLimbs(boolean limbs) {
		this.limbs = limbs;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isEyes() {
		return eyes;
	}


	public void setEyes(boolean eyes) {
		this.eyes = eyes;
	}


	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
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
		smooth();				
	}
	

	public void loadNematodes()
	{

	}


	public void draw()
	{	
	}
}
