package com.pixelaborate.platformer;


import static org.lwjgl.opengl.GL11.glBegin;

import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2d;
import static org.lwjgl.opengl.GL11.glVertex2i;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;


public class Entity {
	
	//private Sphere s;
	private Model m;
	private Map c;
	private Camera cam;
	
	public Entity() {
		//s = new Sphere();
		//cam = new Camera();
		//cam.makeProjection();
		OBJ_Parser p = new OBJ_Parser("res/models/Miami 2525.obj");
		 m = p.parseOBJ();
		 m.prepareModel();
		 
		 //c = new Map("res/images/temperate.png");
		// OBJ_Parser l = new OBJ_Parser("res/models/Aud_R8.obj");
		// c = l.parseOBJ();
		// c.prepareModel();
		 
	}

	public void update() {
	//cam.update();
	}

	public void input() {

		Model.checkInput();//temporarily here to control camera
		
		
	}

	public void render() {
		GL11.glColor3f(0.2f,1.0f,0.2f);
//		glBegin(2);
//		glVertex2d(100,100);
//		glVertex2i(300, 250);
//		glEnd();
//		
//		drawSphere(10);
		
		m.render();
		//c.render();
	}
	
	


}
