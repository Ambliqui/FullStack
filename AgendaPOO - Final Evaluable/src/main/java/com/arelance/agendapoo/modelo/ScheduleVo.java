/** ****************************************************************************
 * Simulacion de dato persistente de base de datos
 *******************************************************************************
 */
package com.arelance.agendapoo.modelo;

public class ScheduleVo {

    private ScheduleVo scheduleDato;


    private ScheduleVo() {
    }
    
    public ScheduleVo getInstance(){
        if (scheduleDato == null) {
            scheduleDato = new ScheduleVo();
        }
        return scheduleDato;
    }
}
