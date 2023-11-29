package clase_08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDescuento {

	@Test
    public void testDescuentoFijoPrecioCero() {
		
        Descuento descuento = new DescuentoFijo(10);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(0);
            
        });
    }

    @Test
    public void testDescuentoPorcentajePrecioCero() {
    	
        Descuento descuento = new DescuentoPorcentaje(15);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(0);
            
        });
    }

    @Test
    public void testDescuentoPorcentajeConTopePrecioCero() {
    	
        Descuento descuento = new DescuentoPorcentajeConTope(15, 50);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(0);
            
        });
    }

    @Test
    public void testDescuentoFijoResultadoNegativo() {
    	
        Descuento descuento = new DescuentoFijo(200);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(150);
            
        });
    }

    @Test
    public void testDescuentoPorcentajeResultadoNegativo() {
    	
        Descuento descuento = new DescuentoPorcentaje(120);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(100);
            
        });
    }

    @Test
    public void testDescuentoPorcentajeConTopeResultadoNegativo() {
    	
        Descuento descuento = new DescuentoPorcentajeConTope(50, 30);
        
        assertThrows(DescuentoInvalidoException.class, () -> {
        	
            descuento.aplicarDescuento(40);
            
        });
    }
}
