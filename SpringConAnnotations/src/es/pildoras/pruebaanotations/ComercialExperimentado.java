package es.pildoras.pruebaanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial experimentado";
		return nuevoInforme.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero nuevoInforme;

}
