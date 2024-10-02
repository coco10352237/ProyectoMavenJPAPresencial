package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.*;
import model.TblProducto;

public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto producto) {
		//nos conectamos con la U.P.	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
		EntityManager em=emf.createEntityManager();
	     try{
		//iniciamos la transaccion..
		em.getTransaction().begin();
		//invocamos al metodo registrar...
		em.persist(producto);
		//confirmamos
		em.getTransaction().commit();
	     }catch(RuntimeException ex){
	    	
	    	ex.getMessage(); 
	     }finally{
		//cerramos
		em.close();
	     }
	
	}//fin del metodo reg...

	@Override
	public void ActualizarProducto(TblProducto producto) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(producto);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}//fin del metodo act...

	@Override
	public void EliminarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}//fin del metodo elim...

	@Override
	public List<TblProducto> ListarProducto() {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo lis...

	@Override
	public TblProducto BuscarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo busc...

}//fin de la clase...
