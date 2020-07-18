package com.igt.app;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.igt.beans.Avvenimento;
import com.igt.beans.Livexml;
import com.igt.beans.Scommessa;

@SpringBootApplication
public class RunApplication {

	/**
	 * 
	 * Menus dialogs
	 * 
	 */
	public static final int MENU_1 = 1;
	public static final int MENU_2 = 2;
	public static final int MENU_3 = 3;
	public static final int MENU_4 = 4;

	/**
	 * 
	 * Different text for options
	 * 
	 */
	public static final String OPTION_1 = "|        1. A list ordered by cod_programa in descendent order of the events with this format: sigla_sport, des_manif, des_avvenimento, dateTime.";
	public static final String OPTION_2 = "|        2. A list ordered by dateTime in descending order of the events with the same format as in 1.";
	public static final String OPTION_3 = "|        3. A list of all the different types of des_tipo_sco divided by sigla_sport.";
	public static final String OPTION_4 = "|        4. Output of the different sigla_sport based on the user input, e.g. 1 for CALCIO, 2 for TENNIS etc, the list of the events for that sport ordered by dateTime prepended with 1,2,3,4 indicating the order of the list.";
	public static final String OPTION_EXIT = "|        5. Exit.";

	public static final String CHOOSE_MENU_SELECTION = "|   MENU SELECTION DEMO    |";
	public static final String CHOOSE_ONE_SPORT = "|   Choose one of the following sports    |";
	public static final String CHOOSE_ONE_EVENT = "|   Choose one of the following events    |";

	/**
	 * Print dialog to choose the option
	 * 
	 * @return
	 */
	public static void printMenu(int menuToPrint) {

		System.out.println("============================");
		if (menuToPrint == MENU_1) {
			System.out.println(CHOOSE_MENU_SELECTION);
			System.out.println(OPTION_1);
			System.out.println(OPTION_2);
			System.out.println(OPTION_3);
			System.out.println(OPTION_4);
			System.out.println(OPTION_EXIT);
		} else if (menuToPrint == MENU_2) {
			System.out.println(CHOOSE_ONE_SPORT);
		} else if (menuToPrint == MENU_3) {
			System.out.println(CHOOSE_ONE_EVENT);
		} else if (menuToPrint == MENU_4) {

		}

	}

	public static int chooseOption() {

		System.out.println("============================");

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter option: ");
		String msg = in.nextLine();
		int selectedMenuOption = 0;
		try {
			selectedMenuOption = Integer.valueOf(msg);
		} catch (Exception e) {
		}
		// in.close();

		return selectedMenuOption;
	}

	/**
	 * Prints a list ordered by cod_programa in descendent order of the events with this format: sigla_sport, des_manif, des_avvenimento, dateTime.
	 * 
	 * @param listAvvenimentos
	 */
	public static void printListByCodPrograma(List<Avvenimento> listAvvenimentos) {
		listAvvenimentos.sort((p1, p2) -> p2.getCodProgramma().compareTo(p1.getCodProgramma()));
		printFormat1(listAvvenimentos);
	}

	/**
	 * A list ordered by dateTime in descending order of the events with the
	 * same format as in 1.
	 * 
	 * @param listAvvenimentos
	 */
	public static void printAvvenimentoOrderedByDatetime(List<Avvenimento> listAvvenimentos) {
		listAvvenimentos.sort((p1, p2) -> p2.getDateTime().compareTo(p1.getDateTime()));
		printFormat1(listAvvenimentos);

	}

	/**
	 * A list of all the different types of des_tipo_sco divided by sigla_sport.
	 * 
	 * @param listAvvenimentos
	 */
	public static void printDifferentTypesDividedBySiglaSport(List<Avvenimento> listAvvenimentos) {
		Map<String, List<Avvenimento>> mapAvvenimentos = listAvvenimentos.stream()
				.collect(Collectors.groupingBy(Avvenimento::getSiglaSport));

		for (Map.Entry<String, List<Avvenimento>> entry : mapAvvenimentos.entrySet()) {
			System.out.println(" ");
			System.out.print(entry.getKey());
			System.out.println(" ");
			printFormatted2(entry.getValue());
			System.out.println(" ");
		}
	}

	/**
	 * 
	 * 
	 * @param listAvvenimentos
	 */
	public static void printDifferentSiglaSport(List<Avvenimento> listAvvenimentos) {

		Map<String, List<Avvenimento>> avvenimentoMap = listAvvenimentos.stream()
				.sorted((p1, p2) -> p1.getDateTime().compareTo(p2.getDateTime()))
				.collect(Collectors.groupingBy(Avvenimento::getSiglaSport));

		printMenu(MENU_2);

		int sportIndex = 0;
		for (Map.Entry<String, List<Avvenimento>> entry : avvenimentoMap.entrySet()) {
			sportIndex++;
			System.out.println(sportIndex + "-" + entry.getKey());
		}

		int sigla_sport = chooseOption();
		printMenu(MENU_3);

		Object[] objects = avvenimentoMap.entrySet().toArray();
		Map.Entry<String, List<Avvenimento>> entry = (Map.Entry<String, List<Avvenimento>>) objects[sigla_sport - 1];
		printDesAvvenimento(entry.getValue());

		int events = chooseOption();
		Avvenimento avvenimento = entry.getValue().get(events - 1);
		printDesTipoSco(avvenimento);

	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RunApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		Processor processor = ctx.getBean(Processor.class);

		// Perform UnMarshaling
		Livexml livexml = (Livexml) processor.xmlToObject("/xml/data.xml");
		List<Avvenimento> listAvvenimentos = livexml.getAvvenimento();

		while (true) {

			printMenu(MENU_1);
			int menuSelectionDemo = chooseOption();

			switch (menuSelectionDemo) {
			case 1:
				System.out.println("Option 1 selected");

				printListByCodPrograma(listAvvenimentos);
				break;
			case 2:
				System.out.println("Option 2 selected");

				printAvvenimentoOrderedByDatetime(listAvvenimentos);
				break;
			case 3:
				System.out.println("Option 3 selected");

				printDifferentTypesDividedBySiglaSport(listAvvenimentos);
				break;
			case 4:
				System.out.println("Option 4 selected");

				printDifferentSiglaSport(listAvvenimentos);
				break;
			case 5:
				System.out.println("Exit selected");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}

		}

	}

	public static void printFormat1(List<Avvenimento> list) {
		DateFormat dfOldDate = new SimpleDateFormat("dd/MM/yy HH:mm");
		DateFormat dfNewDate = new SimpleDateFormat("dd-MM-yy HH:mm");

		for (Avvenimento temp : list) {

			Date oldDate = null;
			try {
				oldDate = dfOldDate.parse(temp.getDateTime());
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(temp.getSiglaSport() + ", " + temp.getDesManif() + ", " + temp.getDesAvvenimento() + ", "
					+ dfNewDate.format(oldDate));
		}
	}

	public static void printFormatted2(List<Avvenimento> list) {

		HashSet<String> listDesTipoSco = new HashSet<String>();
		for (Avvenimento temp : list) {
			for (Scommessa temp2 : temp.getScommessa()) {
				listDesTipoSco.add(temp2.getDesTipoSco());
			}
		}

		Iterator<String> itemIterator = listDesTipoSco.iterator();
		if (itemIterator.hasNext()) {
			System.out.print(itemIterator.next());
			while (itemIterator.hasNext()) {
				System.out.print("," + itemIterator.next());
			}
		}
	}

	public static void printDesAvvenimento(List<Avvenimento> list) {
		int index = 0;
		for (Avvenimento avvenimento : list) {
			index++;
			System.out.println(index + "-" + avvenimento.getDateTime() + " , " + avvenimento.getDesAvvenimento());
		}
	}

	public static void printDesTipoSco(Avvenimento avvenimento) {
		int index = 0;
		for (Scommessa scommessa : avvenimento.getScommessa()) {
			index++;
			System.out.println(index + "-" + scommessa.getDesTipoSco());
		}
	}

}
