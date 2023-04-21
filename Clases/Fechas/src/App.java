import java.time.LocalDate;
import java.time.Period;

public class App {

	public static void main(String[] args) {

		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2022, 12, 18);
		
		System.out.println(fecha2.getDayOfWeek());

		Period periodo = Period.between(fecha2, fecha1);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anios = periodo.getYears();

		if (anios > 0 && meses > 0 && dias > 0) {

			System.out.println(anios + " años, " + meses + " meses y " + dias + " días.");

		} else if (anios > 0 && meses > 0 && dias == 0) {

			System.out.println(anios + " años y " + meses + " meses.");

		} else if (anios > 0 && meses == 0 && dias > 0) {

			System.out.println(anios + " años y " + dias + " días.");

		} else if (anios == 0 && meses > 0 && dias > 0) {

			System.out.println(meses + " meses y " + dias + " días.");

		} else if (anios == 0 && meses == 0 && dias > 0) {

			System.out.println(dias + " días.");

		} else {
			System.out.println("La diferencia entre las fechas es cero.");
		}

	}

}
