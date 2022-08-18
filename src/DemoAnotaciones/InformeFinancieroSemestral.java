package DemoAnotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroSemestral implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentación del informe financiero semestral.";
    }
}
