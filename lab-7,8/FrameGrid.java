import java.awt.*;

class FrameGrid
{
	FrameGrid()
	{
		Frame f = new Frame();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
  MenuBar mb=new MenuBar();  
         Menu menu=new Menu("File"); 
         Menu edit=new Menu("Edit");
         Menu window=new Menu("Window"); 
         Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("Item1");  
         MenuItem i2=new MenuItem("Item 2");  
         MenuItem i3=new MenuItem("Item 3");  
         MenuItem i4=new MenuItem("Item 4");  
         MenuItem i5=new MenuItem("Item 5");
         MenuItem i6=new MenuItem("Copy");
         MenuItem i7=new MenuItem("Cut");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);
          edit.add(i6);
          edit.add(i7); 
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);
          mb.add(edit);
          mb.add(window);  
         f.setMenuBar(mb);

			f.setSize(800, 800);
			f.setVisible(true);
			f.setLayout(new GridLayout(0,2,10, 20));
			f.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

			p1.setSize(100, 100);
			p1.setVisible(true);

			p2.setSize(100, 100);
			p2.setVisible(true);

		f.add(new Label("Name: "));
			TextField tf = new TextField();
			tf.setBounds(50,100, 200,30);  
		f.add(tf);
               
		f.add(new Label("Bio: "));
			TextArea ta = new TextArea("", 10, 20);
			// ta.setBounds(100, 50, 50, 40);
		f.add(ta);

		f.add(new Label("Country: "));
			Choice c = new Choice();
			c.add("Nepal");
			c.add("India");
			c.add("China");
			f.add(c);

		f.add(new Label("Hobbies: "));
			Checkbox c1 = new Checkbox("Dancing");
			Checkbox c2 = new Checkbox("Singing");
			Checkbox c3 = new Checkbox("Reading");
				p1.add(c1); p1.add(c2); p1.add(c3);
		f.add(p1);

		f.add(new Label("Gender: "));
			CheckboxGroup cb = new CheckboxGroup();
				Checkbox g1 = new Checkbox("Female", cb , false);
				Checkbox g2 = new Checkbox("Male", cb , true);
				Checkbox g3 = new Checkbox("Other", cb, false);				
		p2.add(g1); p2.add(g2); p2.add(g3);
		f.add(p2);

		f.add(new Label("Programming Languages: "));
			List l1 = new List(7);
				l1.add("PHP");
				l1.add("Java");
				l1.add("C++");
				l1.add("C");
				l1.add("C#");
				l1.add("JS");
				l1.add("Python");
			f.add(l1);

	}

	public static void main(String[] args) {
		new FrameGrid();
	}
}  
   