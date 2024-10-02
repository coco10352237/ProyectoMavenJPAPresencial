package TestEntidades;

import java.util.Date;

import DaoImp.TblProductoImp;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		TblProducto tblprod=new TblProducto();
		TblProductoImp tblimp=new TblProductoImp();
		//asignamos valores...
		/*tblprod.setNomprod("azuar rubia");
		tblprod.setPrecio(3.5);
		tblprod.setCantidad(4);
		tblprod.setTotal(tblprod.getPrecio()*tblprod.getCantidad());
		tblprod.setCodbarras("7778899");
		tblprod.setNrolote("lote4589");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprod.setFechaven(fechasql);
		//invocamos el metodo registrar
		tblimp.RegistrarProducto(tblprod);
		//emitimos mensaje por consola
		System.out.println("dato registrado en BD");*/
		
		tblprod.setIdproducto(1);
		tblprod.setNomprod("Arroz Faron");
		tblprod.setPrecio(4.5);
		tblprod.setCantidad(5);
		tblimp.ActualizarProducto(tblprod);
		System.out.println("dato actualizados en BD");

	}//fin de metodo prinpal..

}//fin de la clase...
