package superheroes;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext context = null;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean init = true;
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		SuperHeroe heroe1 = context.getBean("heore1", SuperHeroe.class);
		
		SuperHeroe heroe2 = context.getBean("heore2", SuperHeroe.class);
		
		SuperHeroe heroe3 = context.getBean("heore3", SuperHeroe.class);
		
		ArrayList<SuperHeroe> heores100 = new ArrayList<>();
		ArrayList<SuperHeroe> heoresVoladores = new ArrayList<>();
		
		do {
			
			System.out.println("Bienvenido, ¿qué deseas hacer?");
			System.out.println("1-Acceder a los heores");
			System.out.println("2-Add super heroe con potencia 100 a su lista");
			System.out.println("3- Add super heroe que pueda volar a su lista");
			System.out.println("4- Listar super heroes con potencia 100");
			System.out.println("5- Listar super heroes que puedan volar");
			
			int opcion = sc.nextInt();
					
			switch (opcion) {
			case 1:
				System.out.println(heroe1);
				System.out.println(heroe2);
				System.out.println(heroe3);
				break;
				
			case 2:
				SuperHeroe heroe100 = context.getBean("heroePoder100", SuperHeroe.class);				
				
				System.out.println("Establece un id");
				int id = sc.nextInt();
				heroe100.setId(id);			
				
				System.out.println("Establece un nombre");
				String nombre = sc.next();
				heroe100.setNombre(nombre);
				
				System.out.println("Establece un nombre del poder");
				String poder = sc.next();				
				heroe100.setNombrePoder(poder);
				
				heores100.add(heroe100);
				System.out.println("El heroe se añadió!!");
				break;
				
			case 3:
				SuperHeroe heroeVolador = context.getBean("heroeVolador", SuperHeroe.class);
				
				System.out.println("Establece un id");
				int id1 = sc.nextInt();
				heroeVolador.setId(id1);
				
				System.out.println("Establece un nombre");
				String nombre1 = sc.nextLine();
				heroeVolador.setNombre(nombre1);
				
				System.out.println("Establece un nombre del poder");
				int poder1 = sc.nextInt();
				heroeVolador.setPoder(poder1);
				
				heoresVoladores.add(heroeVolador);
				System.out.println("El heroe se añadió!!");
				break;

			case 4:
				System.out.println(heores100);
				break;
			
			case 5:
				System.out.println(heoresVoladores);
				break;
			
			case 6:
				init = false;
				System.out.println("Hasta la proxima");
				break;			
		
			}
			
		} while (init == true);
		
	}

}
