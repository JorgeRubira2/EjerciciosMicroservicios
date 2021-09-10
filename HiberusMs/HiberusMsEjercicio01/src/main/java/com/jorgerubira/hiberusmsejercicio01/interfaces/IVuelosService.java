package com.jorgerubira.hiberusmsejercicio01.interfaces;

import com.jorgerubira.hiberusmsejercicio01.domain.aviationstack.VueloDto;

import java.util.List;

public interface IVuelosService {
   public void importarMaestros();
   public List<VueloDto> verVuelosEspaña();
}
