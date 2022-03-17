package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data (int diaI, int mesI, int anoI) {
		dia = diaI;
		mes = mesI;
		ano = anoI;
	}
	
	String mostrarData(int dia, int mes, int ano) {
		 String data = "" + dia + "/" + mes + "/" + ano;
		 return data;
	}
	
	String dataFormatada() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}
}
