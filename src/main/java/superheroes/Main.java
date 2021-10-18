package superheroes;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext context = null;

	public static void addHeroe(String bean, ArrayList<SuperHeroe> lista, String tipo) {
		Scanner sc = new Scanner(System.in);

		SuperHeroe heroe = context.getBean(bean, SuperHeroe.class);

		System.out.println("Establece un id");
		int id = sc.nextInt();
		heroe.setId(id);

		System.out.println("Establece un nombre");
		String nombre = sc.next();
		heroe.setNombre(nombre);

		if(tipo == "poder100") {
			System.out.println("Establece un nombre del poder");
			String poder = sc.next();
			heroe.setNombrePoder(poder);
		}else if(tipo == "volador"){
			System.out.println("Establece la potencia del poder");
			int poder = sc.nextInt();
			heroe.setPoder(poder);
		}
		

		lista.add(heroe);
		System.out.println("El heroe se añadió!!");

	}

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		boolean init = true;
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		SuperHeroe heroe1 = context.getBean("heore1", SuperHeroe.class);

		SuperHeroe heroe2 = context.getBean("heore2", SuperHeroe.class);

		SuperHeroe heroe3 = context.getBean("heore3", SuperHeroe.class);

		ArrayList<SuperHeroe> heores100 = new ArrayList<>();
		ArrayList<SuperHeroe> heoresVoladores = new ArrayList<>();
		
		System.out.println("Bienvenido, ¿qué deseas hacer?");
		do {
			System.out.println("-----------------------------");
			System.out.println("1 -Acceder a los heores");
			System.out.println("2- Add super heroe con potencia 100 a su lista");
			System.out.println("3- Add super heroe que pueda volar a su lista");
			System.out.println("4- Listar super heroes con potencia 100");
			System.out.println("5- Listar super heroes que puedan volar");
			System.out.println("6- Salir");

			int opcion = sc2.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(heroe1);
				System.out.println(heroe2);
				System.out.println(heroe3);
				break;

			case 2:
				 addHeroe("heroePoder100", heores100, "poder100");
				 break;
				 
			case 3:
				addHeroe("heroeVolador", heoresVoladores, "volador");
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
